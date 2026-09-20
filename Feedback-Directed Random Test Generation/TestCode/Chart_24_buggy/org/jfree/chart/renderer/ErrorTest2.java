package org.jfree.chart.renderer;

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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', 52.0d);
        double double25 = grayPaintScale24.getUpperBound();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj21", grayPaintScale2.equals(obj21) ? grayPaintScale2.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) '#');
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
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
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
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
        java.lang.Object obj22 = grayPaintScale10.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj21", grayPaintScale10.equals(obj21) ? grayPaintScale10.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint(35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) (byte) 100);
        double double8 = grayPaintScale7.getUpperBound();
        java.lang.Object obj9 = grayPaintScale7.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj9", grayPaintScale7.equals(obj9) ? grayPaintScale7.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) "hi!");
        double double27 = grayPaintScale24.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean31 = grayPaintScale24.equals((java.lang.Object) 0.0d);
        double double32 = grayPaintScale24.getUpperBound();
        java.awt.Paint paint34 = grayPaintScale24.getPaint(1.0d);
        boolean boolean35 = grayPaintScale23.equals((java.lang.Object) 1.0d);
        double double36 = grayPaintScale23.getLowerBound();
        java.lang.Class<?> wildcardClass37 = grayPaintScale23.getClass();
        boolean boolean38 = grayPaintScale20.equals((java.lang.Object) grayPaintScale23);
        boolean boolean39 = grayPaintScale0.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj17", grayPaintScale0.equals(obj17) ? grayPaintScale0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) 0.0d);
        double double14 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale6.getPaint((double) 0L);
        java.awt.Paint paint18 = grayPaintScale6.getPaint(1.0d);
        double double19 = grayPaintScale6.getUpperBound();
        double double20 = grayPaintScale6.getUpperBound();
        double double21 = grayPaintScale6.getLowerBound();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0L);
        java.awt.Paint paint12 = grayPaintScale0.getPaint(1.0d);
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.awt.Paint paint15 = grayPaintScale0.getPaint((double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
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
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj21", grayPaintScale10.equals(obj21) ? grayPaintScale10.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale9.getPaint((double) (byte) 1);
        double double16 = grayPaintScale9.getLowerBound();
        java.lang.Object obj17 = grayPaintScale9.clone();
        boolean boolean18 = grayPaintScale0.equals(obj17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
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
        java.awt.Paint paint16 = grayPaintScale3.getPaint(0.0d);
        java.lang.Object obj17 = grayPaintScale3.clone();
        double double18 = grayPaintScale3.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj17", grayPaintScale3.equals(obj17) ? grayPaintScale3.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0.0f);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) 0.0f);
        double double10 = grayPaintScale0.getUpperBound();
        double double11 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) "hi!");
        double double15 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) 0);
        double double18 = grayPaintScale12.getUpperBound();
        java.lang.Object obj19 = grayPaintScale12.clone();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale12", grayPaintScale0.equals(grayPaintScale12) ? grayPaintScale0.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 0.0d);
        java.lang.Object obj24 = grayPaintScale23.clone();
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale23", grayPaintScale6.equals(grayPaintScale23) ? grayPaintScale6.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0);
        double double10 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
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
        double double37 = grayPaintScale2.getUpperBound();
        java.lang.Object obj38 = grayPaintScale2.clone();
        double double39 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj38", grayPaintScale2.equals(obj38) ? grayPaintScale2.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 10);
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        double double13 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean19 = grayPaintScale16.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) (short) 0);
        java.awt.Paint paint23 = grayPaintScale16.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) "hi!");
        double double27 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) 0);
        boolean boolean30 = grayPaintScale16.equals((java.lang.Object) grayPaintScale24);
        java.awt.Paint paint32 = grayPaintScale24.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        boolean boolean36 = grayPaintScale24.equals((java.lang.Object) '#');
        boolean boolean37 = grayPaintScale10.equals((java.lang.Object) grayPaintScale24);
        double double38 = grayPaintScale10.getLowerBound();
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale43 = new org.jfree.chart.renderer.GrayPaintScale();
        double double44 = grayPaintScale43.getUpperBound();
        double double45 = grayPaintScale43.getUpperBound();
        double double46 = grayPaintScale43.getUpperBound();
        double double47 = grayPaintScale43.getLowerBound();
        double double48 = grayPaintScale43.getUpperBound();
        double double49 = grayPaintScale43.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale52 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint54 = grayPaintScale52.getPaint((double) 0);
        boolean boolean55 = grayPaintScale43.equals((java.lang.Object) paint54);
        double double56 = grayPaintScale43.getUpperBound();
        boolean boolean57 = grayPaintScale42.equals((java.lang.Object) grayPaintScale43);
        boolean boolean58 = grayPaintScale10.equals((java.lang.Object) grayPaintScale42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale52", grayPaintScale10.equals(grayPaintScale52) ? grayPaintScale10.hashCode() == grayPaintScale52.hashCode() : true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 'a');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
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
        double double47 = grayPaintScale30.getLowerBound();
        boolean boolean49 = grayPaintScale30.equals((java.lang.Object) true);
        double double50 = grayPaintScale30.getLowerBound();
        java.lang.Object obj51 = grayPaintScale30.clone();
        boolean boolean52 = grayPaintScale13.equals(obj51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale38", grayPaintScale0.equals(grayPaintScale38) ? grayPaintScale0.hashCode() == grayPaintScale38.hashCode() : true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
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
        double double20 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean28 = grayPaintScale21.equals((java.lang.Object) 0.0d);
        double double29 = grayPaintScale21.getUpperBound();
        boolean boolean31 = grayPaintScale21.equals((java.lang.Object) 10.0d);
        double double32 = grayPaintScale21.getUpperBound();
        double double33 = grayPaintScale21.getUpperBound();
        java.lang.Object obj34 = grayPaintScale21.clone();
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale21", grayPaintScale3.equals(grayPaintScale21) ? grayPaintScale3.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getUpperBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Object obj16 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
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
        java.awt.Paint paint26 = grayPaintScale0.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) "hi!");
        double double33 = grayPaintScale30.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale30.getPaint((double) 0);
        boolean boolean36 = grayPaintScale29.equals((java.lang.Object) paint35);
        double double37 = grayPaintScale29.getLowerBound();
        boolean boolean39 = grayPaintScale29.equals((java.lang.Object) 100.0f);
        java.lang.Object obj40 = grayPaintScale29.clone();
        boolean boolean41 = grayPaintScale0.equals((java.lang.Object) grayPaintScale29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale30", grayPaintScale0.equals(grayPaintScale30) ? grayPaintScale0.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        double double18 = grayPaintScale14.getUpperBound();
        double double19 = grayPaintScale14.getUpperBound();
        double double20 = grayPaintScale14.getUpperBound();
        double double21 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale14.getPaint((double) 0.0f);
        double double24 = grayPaintScale14.getUpperBound();
        double double25 = grayPaintScale14.getUpperBound();
        boolean boolean26 = grayPaintScale13.equals((java.lang.Object) grayPaintScale14);
        java.awt.Paint paint28 = grayPaintScale14.getPaint((double) (byte) 1);
        boolean boolean29 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale14", grayPaintScale0.equals(grayPaintScale14) ? grayPaintScale0.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        double double15 = grayPaintScale2.getUpperBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        double double17 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj16", grayPaintScale2.equals(obj16) ? grayPaintScale2.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        double double15 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (-1));
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) 0);
        double double15 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) 10L);
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) 0L);
        java.lang.Object obj20 = null;
        boolean boolean21 = grayPaintScale12.equals(obj20);
        java.awt.Paint paint23 = grayPaintScale12.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '#');
        boolean boolean27 = grayPaintScale12.equals((java.lang.Object) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 1L);
        boolean boolean31 = grayPaintScale12.equals((java.lang.Object) 0);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
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
        java.awt.Paint paint20 = grayPaintScale10.getPaint(1.0d);
        double double21 = grayPaintScale10.getUpperBound();
        java.lang.Object obj22 = grayPaintScale10.clone();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj22", grayPaintScale10.equals(obj22) ? grayPaintScale10.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) (short) -1);
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 1.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0);
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) "hi!");
        double double15 = grayPaintScale12.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean19 = grayPaintScale12.equals((java.lang.Object) 0.0d);
        boolean boolean20 = grayPaintScale11.equals((java.lang.Object) 0.0d);
        boolean boolean22 = grayPaintScale11.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass23 = grayPaintScale11.getClass();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale18", grayPaintScale2.equals(grayPaintScale18) ? grayPaintScale2.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 0);
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
        java.awt.Paint paint41 = grayPaintScale7.getPaint((double) '4');
        java.lang.Object obj42 = grayPaintScale7.clone();
        boolean boolean43 = grayPaintScale0.equals(obj42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale26", grayPaintScale0.equals(grayPaintScale26) ? grayPaintScale0.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
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
        java.awt.Paint paint20 = grayPaintScale10.getPaint(1.0d);
        double double21 = grayPaintScale10.getUpperBound();
        java.lang.Object obj22 = grayPaintScale10.clone();
        java.awt.Paint paint24 = grayPaintScale10.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj22", grayPaintScale10.equals(obj22) ? grayPaintScale10.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 'a');
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) 0);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (byte) 0);
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj13 = grayPaintScale5.clone();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj13", grayPaintScale5.equals(obj13) ? grayPaintScale5.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0);
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean19 = grayPaintScale16.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) (short) 0);
        java.awt.Paint paint23 = grayPaintScale16.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) "hi!");
        double double27 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) 0);
        boolean boolean30 = grayPaintScale16.equals((java.lang.Object) grayPaintScale24);
        boolean boolean32 = grayPaintScale16.equals((java.lang.Object) (byte) 1);
        double double33 = grayPaintScale16.getLowerBound();
        double double34 = grayPaintScale16.getLowerBound();
        double double35 = grayPaintScale16.getLowerBound();
        double double36 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint38 = grayPaintScale16.getPaint((double) (-1.0f));
        java.lang.Class<?> wildcardClass39 = paint38.getClass();
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) wildcardClass39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale16", grayPaintScale2.equals(grayPaintScale16) ? grayPaintScale2.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale3.equals(obj11);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) 0);
        boolean boolean23 = grayPaintScale16.equals((java.lang.Object) grayPaintScale17);
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) (byte) 0);
        java.lang.Object obj26 = grayPaintScale17.clone();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale17", grayPaintScale3.equals(grayPaintScale17) ? grayPaintScale3.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (short) 0);
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) 0);
        boolean boolean26 = grayPaintScale12.equals((java.lang.Object) grayPaintScale20);
        boolean boolean28 = grayPaintScale12.equals((java.lang.Object) (byte) 1);
        double double29 = grayPaintScale12.getLowerBound();
        java.lang.Object obj30 = grayPaintScale12.clone();
        boolean boolean31 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale20", grayPaintScale0.equals(grayPaintScale20) ? grayPaintScale0.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) (byte) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) double8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 0.0d);
        java.lang.Object obj13 = grayPaintScale12.clone();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) 0);
        double double12 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) 10L);
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0L);
        double double17 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale9.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        boolean boolean23 = grayPaintScale9.equals((java.lang.Object) 1.0d);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj25 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass26 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 1.0f);
        double double18 = grayPaintScale15.getLowerBound();
        double double19 = grayPaintScale15.getLowerBound();
        double double20 = grayPaintScale15.getLowerBound();
        double double21 = grayPaintScale15.getLowerBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj23 = grayPaintScale2.clone();
        double double24 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
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
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 10L);
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj21", grayPaintScale2.equals(obj21) ? grayPaintScale2.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
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
        java.awt.Paint paint16 = grayPaintScale3.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100.0f);
        boolean boolean25 = grayPaintScale19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj26 = grayPaintScale19.clone();
        boolean boolean27 = grayPaintScale3.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale19 and obj26", grayPaintScale19.equals(obj26) ? grayPaintScale19.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
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
        java.awt.Paint paint27 = grayPaintScale13.getPaint((double) (short) 0);
        java.lang.Object obj28 = grayPaintScale13.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        java.lang.Object obj32 = grayPaintScale31.clone();
        boolean boolean33 = grayPaintScale13.equals(obj32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj28", grayPaintScale13.equals(obj28) ? grayPaintScale13.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
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
        double double14 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        double double19 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) 0);
        double double19 = grayPaintScale16.getUpperBound();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) double19);
        java.awt.Paint paint22 = grayPaintScale0.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) "hi!");
        double double26 = grayPaintScale23.getLowerBound();
        double double27 = grayPaintScale23.getUpperBound();
        double double28 = grayPaintScale23.getUpperBound();
        double double29 = grayPaintScale23.getUpperBound();
        double double30 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale23.getPaint((double) 0.0f);
        double double33 = grayPaintScale23.getUpperBound();
        double double34 = grayPaintScale23.getUpperBound();
        double double35 = grayPaintScale23.getLowerBound();
        boolean boolean36 = grayPaintScale0.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale23", grayPaintScale0.equals(grayPaintScale23) ? grayPaintScale0.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
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
        java.lang.Object obj19 = grayPaintScale2.clone();
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) "hi!");
        double double26 = grayPaintScale23.getLowerBound();
        double double27 = grayPaintScale23.getUpperBound();
        double double28 = grayPaintScale23.getUpperBound();
        double double29 = grayPaintScale23.getUpperBound();
        double double30 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale23.getPaint((double) 0.0f);
        double double33 = grayPaintScale23.getUpperBound();
        double double34 = grayPaintScale23.getUpperBound();
        boolean boolean35 = grayPaintScale22.equals((java.lang.Object) grayPaintScale23);
        java.awt.Paint paint37 = grayPaintScale23.getPaint((double) (byte) 1);
        double double38 = grayPaintScale23.getUpperBound();
        java.lang.Class<?> wildcardClass39 = grayPaintScale23.getClass();
        boolean boolean40 = grayPaintScale0.equals((java.lang.Object) wildcardClass39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale23", grayPaintScale0.equals(grayPaintScale23) ? grayPaintScale0.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) 0);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) "hi!");
        double double15 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) 0);
        double double18 = grayPaintScale12.getUpperBound();
        double double19 = grayPaintScale12.getUpperBound();
        double double20 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale12.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double26 = grayPaintScale25.getLowerBound();
        double double27 = grayPaintScale25.getLowerBound();
        boolean boolean28 = grayPaintScale12.equals((java.lang.Object) grayPaintScale25);
        double double29 = grayPaintScale25.getLowerBound();
        double double30 = grayPaintScale25.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 10);
        java.awt.Paint paint35 = grayPaintScale33.getPaint((double) 0.0f);
        double double36 = grayPaintScale33.getLowerBound();
        double double37 = grayPaintScale33.getUpperBound();
        boolean boolean38 = grayPaintScale25.equals((java.lang.Object) grayPaintScale33);
        double double39 = grayPaintScale25.getLowerBound();
        java.lang.Object obj40 = grayPaintScale25.clone();
        boolean boolean41 = grayPaintScale2.equals(obj40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale25", grayPaintScale6.equals(grayPaintScale25) ? grayPaintScale6.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) "hi!");
        double double26 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint28 = grayPaintScale23.getPaint((double) 0);
        boolean boolean29 = grayPaintScale22.equals((java.lang.Object) paint28);
        double double30 = grayPaintScale22.getLowerBound();
        boolean boolean32 = grayPaintScale22.equals((java.lang.Object) 100.0f);
        double double33 = grayPaintScale22.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean37 = grayPaintScale22.equals((java.lang.Object) 0);
        java.lang.Object obj38 = null;
        boolean boolean39 = grayPaintScale22.equals(obj38);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
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
        java.lang.Object obj19 = grayPaintScale8.clone();
        double double20 = grayPaintScale8.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj19", grayPaintScale8.equals(obj19) ? grayPaintScale8.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
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
        java.lang.Object obj16 = grayPaintScale0.clone();
        java.lang.Object obj17 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj16", grayPaintScale0.equals(obj16) ? grayPaintScale0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getLowerBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Object obj7 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(52.0d, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) -1);
        java.awt.Paint paint9 = grayPaintScale5.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) 0);
        double double15 = grayPaintScale12.getUpperBound();
        double double16 = grayPaintScale12.getUpperBound();
        boolean boolean17 = grayPaintScale5.equals((java.lang.Object) grayPaintScale12);
        double double18 = grayPaintScale5.getUpperBound();
        double double19 = grayPaintScale5.getLowerBound();
        java.lang.Object obj20 = grayPaintScale5.clone();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj20", grayPaintScale5.equals(obj20) ? grayPaintScale5.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale3.equals(obj11);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double14 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (-1));
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) paint19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getUpperBound();
        java.lang.Object obj25 = null;
        boolean boolean26 = grayPaintScale21.equals(obj25);
        double double27 = grayPaintScale21.getUpperBound();
        java.lang.Object obj28 = grayPaintScale21.clone();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale21", grayPaintScale3.equals(grayPaintScale21) ? grayPaintScale3.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) 0);
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) paint11);
        double double13 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 100);
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
        boolean boolean38 = grayPaintScale19.equals((java.lang.Object) (byte) 10);
        java.awt.Paint paint40 = grayPaintScale19.getPaint((double) (byte) 0);
        boolean boolean41 = grayPaintScale16.equals((java.lang.Object) (byte) 0);
        boolean boolean42 = grayPaintScale0.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale27", grayPaintScale0.equals(grayPaintScale27) ? grayPaintScale0.hashCode() == grayPaintScale27.hashCode() : true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 35.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getUpperBound();
        double double11 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        java.awt.Paint paint16 = grayPaintScale14.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getLowerBound();
        double double24 = grayPaintScale20.getUpperBound();
        double double25 = grayPaintScale20.getUpperBound();
        double double26 = grayPaintScale20.getUpperBound();
        double double27 = grayPaintScale20.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale20.getPaint((double) 0.0f);
        double double30 = grayPaintScale20.getUpperBound();
        double double31 = grayPaintScale20.getUpperBound();
        boolean boolean32 = grayPaintScale19.equals((java.lang.Object) grayPaintScale20);
        boolean boolean33 = grayPaintScale14.equals((java.lang.Object) grayPaintScale19);
        java.lang.Object obj34 = grayPaintScale14.clone();
        boolean boolean35 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale20", grayPaintScale0.equals(grayPaintScale20) ? grayPaintScale0.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = grayPaintScale28.clone();
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale28 and obj31", grayPaintScale28.equals(obj31) ? grayPaintScale28.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale9.getPaint(0.0d);
        double double14 = grayPaintScale9.getUpperBound();
        double double15 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale9.getPaint((double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean20 = grayPaintScale18.equals((java.lang.Object) "hi!");
        java.awt.Paint paint22 = grayPaintScale18.getPaint((double) 1);
        double double23 = grayPaintScale18.getUpperBound();
        double double24 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale18.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass27 = paint26.getClass();
        boolean boolean28 = grayPaintScale9.equals((java.lang.Object) wildcardClass27);
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) boolean28);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double31 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', 52.0d);
        java.lang.Object obj35 = grayPaintScale34.clone();
        boolean boolean36 = grayPaintScale6.equals((java.lang.Object) grayPaintScale34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale34 and obj35", grayPaintScale34.equals(obj35) ? grayPaintScale34.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
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
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
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
        java.lang.Object obj28 = grayPaintScale13.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj27", grayPaintScale13.equals(obj27) ? grayPaintScale13.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
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
        java.lang.Class<?> wildcardClass25 = grayPaintScale10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj24", grayPaintScale10.equals(obj24) ? grayPaintScale10.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0.0f);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        java.awt.Paint paint7 = grayPaintScale3.getPaint((double) 1);
        double double8 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale3.getPaint(1.0d);
        double double11 = grayPaintScale3.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale3", grayPaintScale2.equals(grayPaintScale3) ? grayPaintScale2.hashCode() == grayPaintScale3.hashCode() : true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
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
        double double27 = grayPaintScale13.getLowerBound();
        java.lang.Object obj28 = grayPaintScale13.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.lang.Object obj32 = grayPaintScale31.clone();
        boolean boolean33 = grayPaintScale13.equals((java.lang.Object) grayPaintScale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj28", grayPaintScale13.equals(obj28) ? grayPaintScale13.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0.0f);
        java.lang.Object obj12 = grayPaintScale2.clone();
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
        java.awt.Paint paint33 = grayPaintScale23.getPaint(1.0d);
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 0);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) paint12);
        java.lang.Class<?> wildcardClass14 = grayPaintScale6.getClass();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) wildcardClass14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 1);
        java.lang.Object obj19 = null;
        boolean boolean20 = grayPaintScale18.equals(obj19);
        java.lang.Object obj21 = null;
        boolean boolean22 = grayPaintScale18.equals(obj21);
        java.lang.Class<?> wildcardClass23 = grayPaintScale18.getClass();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale18", grayPaintScale7.equals(grayPaintScale18) ? grayPaintScale7.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
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
        java.lang.Object obj24 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) double8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double15 = grayPaintScale14.getLowerBound();
        boolean boolean17 = grayPaintScale14.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) (short) 0);
        java.awt.Paint paint21 = grayPaintScale14.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean24 = grayPaintScale22.equals((java.lang.Object) "hi!");
        double double25 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) 0);
        boolean boolean28 = grayPaintScale14.equals((java.lang.Object) grayPaintScale22);
        boolean boolean30 = grayPaintScale22.equals((java.lang.Object) 10.0f);
        double double31 = grayPaintScale22.getLowerBound();
        java.lang.Object obj32 = grayPaintScale22.clone();
        boolean boolean33 = grayPaintScale2.equals(obj32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale22 and obj32", grayPaintScale22.equals(obj32) ? grayPaintScale22.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
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
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale0.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 100L);
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) 100L);
        java.lang.Object obj13 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean24 = grayPaintScale17.equals((java.lang.Object) 0.0d);
        double double25 = grayPaintScale17.getUpperBound();
        boolean boolean27 = grayPaintScale17.equals((java.lang.Object) 10.0d);
        double double28 = grayPaintScale17.getUpperBound();
        double double29 = grayPaintScale17.getUpperBound();
        double double30 = grayPaintScale17.getUpperBound();
        boolean boolean31 = grayPaintScale16.equals((java.lang.Object) double30);
        java.awt.Paint paint33 = grayPaintScale16.getPaint(32.0d);
        boolean boolean34 = grayPaintScale0.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
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
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj17", grayPaintScale14.equals(obj17) ? grayPaintScale14.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (short) 10);
        double double17 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean20 = grayPaintScale18.equals((java.lang.Object) "hi!");
        double double21 = grayPaintScale18.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean25 = grayPaintScale18.equals((java.lang.Object) 0.0d);
        double double26 = grayPaintScale18.getUpperBound();
        boolean boolean28 = grayPaintScale18.equals((java.lang.Object) 10.0d);
        double double29 = grayPaintScale18.getUpperBound();
        double double30 = grayPaintScale18.getUpperBound();
        double double31 = grayPaintScale18.getUpperBound();
        double double32 = grayPaintScale18.getLowerBound();
        boolean boolean33 = grayPaintScale16.equals((java.lang.Object) grayPaintScale18);
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) (byte) 100);
        boolean boolean19 = grayPaintScale13.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj20 = grayPaintScale13.clone();
        boolean boolean21 = grayPaintScale0.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj20", grayPaintScale13.equals(obj20) ? grayPaintScale13.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
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
        double double20 = grayPaintScale0.getUpperBound();
        double double21 = grayPaintScale0.getLowerBound();
        double double22 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        double double24 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale23.getPaint(0.0d);
        double double27 = grayPaintScale23.getLowerBound();
        double double28 = grayPaintScale23.getLowerBound();
        boolean boolean29 = grayPaintScale0.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale23", grayPaintScale0.equals(grayPaintScale23) ? grayPaintScale0.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean19 = grayPaintScale16.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) (short) 0);
        java.awt.Paint paint23 = grayPaintScale16.getPaint((double) 0);
        double double24 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale16.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double30 = grayPaintScale29.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint38 = grayPaintScale36.getPaint((double) (byte) 100);
        boolean boolean39 = grayPaintScale33.equals((java.lang.Object) (byte) 100);
        double double40 = grayPaintScale33.getLowerBound();
        double double41 = grayPaintScale33.getUpperBound();
        double double42 = grayPaintScale33.getLowerBound();
        double double43 = grayPaintScale33.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean46 = grayPaintScale44.equals((java.lang.Object) "hi!");
        double double47 = grayPaintScale44.getLowerBound();
        double double48 = grayPaintScale44.getUpperBound();
        boolean boolean49 = grayPaintScale33.equals((java.lang.Object) double48);
        double double50 = grayPaintScale33.getUpperBound();
        boolean boolean51 = grayPaintScale29.equals((java.lang.Object) grayPaintScale33);
        java.awt.Paint paint53 = grayPaintScale29.getPaint((double) 0L);
        boolean boolean54 = grayPaintScale16.equals((java.lang.Object) paint53);
        boolean boolean55 = grayPaintScale2.equals((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale16", grayPaintScale2.equals(grayPaintScale16) ? grayPaintScale2.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (byte) 100);
        boolean boolean14 = grayPaintScale8.equals((java.lang.Object) (byte) 100);
        double double15 = grayPaintScale8.getLowerBound();
        double double16 = grayPaintScale8.getUpperBound();
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
        double double36 = grayPaintScale19.getUpperBound();
        boolean boolean37 = grayPaintScale8.equals((java.lang.Object) double36);
        double double38 = grayPaintScale8.getLowerBound();
        double double39 = grayPaintScale8.getUpperBound();
        java.lang.Object obj40 = grayPaintScale8.clone();
        boolean boolean41 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
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
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) "hi!");
        double double22 = grayPaintScale19.getUpperBound();
        double double23 = grayPaintScale19.getLowerBound();
        double double24 = grayPaintScale19.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale19.getPaint(1.0d);
        java.lang.Object obj27 = grayPaintScale19.clone();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale19", grayPaintScale3.equals(grayPaintScale19) ? grayPaintScale3.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint12 = grayPaintScale8.getPaint((double) (byte) 1);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100);
        double double17 = grayPaintScale16.getLowerBound();
        java.lang.Object obj18 = grayPaintScale16.clone();
        boolean boolean19 = grayPaintScale0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj18", grayPaintScale16.equals(obj18) ? grayPaintScale16.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 1);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
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
        double double22 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj21", grayPaintScale2.equals(obj21) ? grayPaintScale2.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        java.awt.Paint paint7 = grayPaintScale3.getPaint((double) 1);
        java.awt.Paint paint9 = grayPaintScale3.getPaint(0.0d);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 1.0d);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale15", grayPaintScale3.equals(grayPaintScale15) ? grayPaintScale3.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 0);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) grayPaintScale7);
        double double14 = grayPaintScale6.getLowerBound();
        double double15 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale6.getPaint((double) 0L);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) paint17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
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
        java.awt.Paint paint16 = grayPaintScale3.getPaint(0.0d);
        java.lang.Object obj17 = grayPaintScale3.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj17", grayPaintScale3.equals(obj17) ? grayPaintScale3.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
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
        java.lang.Class<?> wildcardClass12 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) 100);
        boolean boolean12 = grayPaintScale6.equals((java.lang.Object) (byte) 100);
        double double13 = grayPaintScale6.getLowerBound();
        double double14 = grayPaintScale6.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) -1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getUpperBound();
        double double14 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale10.getPaint((double) (byte) 1);
        double double17 = grayPaintScale10.getLowerBound();
        double double18 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale10.getPaint(0.0d);
        java.awt.Paint paint22 = grayPaintScale10.getPaint((double) 0);
        double double23 = grayPaintScale10.getLowerBound();
        java.lang.Object obj24 = grayPaintScale10.clone();
        boolean boolean25 = grayPaintScale2.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj24", grayPaintScale10.equals(obj24) ? grayPaintScale10.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.awt.Paint paint11 = grayPaintScale3.getPaint((double) (byte) 0);
        java.lang.Object obj12 = grayPaintScale3.clone();
        double double13 = grayPaintScale3.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj12", grayPaintScale3.equals(obj12) ? grayPaintScale3.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) 0.0d);
        double double13 = grayPaintScale5.getLowerBound();
        double double14 = grayPaintScale5.getLowerBound();
        double double15 = grayPaintScale5.getLowerBound();
        double double16 = grayPaintScale5.getUpperBound();
        java.lang.Object obj17 = grayPaintScale5.clone();
        boolean boolean18 = grayPaintScale2.equals(obj17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj17", grayPaintScale5.equals(obj17) ? grayPaintScale5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.awt.Paint paint11 = grayPaintScale3.getPaint((double) (byte) 0);
        java.lang.Object obj12 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean23 = grayPaintScale16.equals((java.lang.Object) 0.0d);
        java.lang.Object obj24 = null;
        boolean boolean25 = grayPaintScale16.equals(obj24);
        boolean boolean26 = grayPaintScale15.equals((java.lang.Object) grayPaintScale16);
        double double27 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale16.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        double double33 = grayPaintScale32.getLowerBound();
        boolean boolean34 = grayPaintScale16.equals((java.lang.Object) grayPaintScale32);
        double double35 = grayPaintScale16.getLowerBound();
        double double36 = grayPaintScale16.getLowerBound();
        boolean boolean37 = grayPaintScale3.equals((java.lang.Object) double36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale22", grayPaintScale2.equals(grayPaintScale22) ? grayPaintScale2.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) (short) 1);
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Object obj14 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 1L);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) 10);
        java.awt.Paint paint13 = grayPaintScale9.getPaint((double) (-1.0f));
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double40 = grayPaintScale39.getLowerBound();
        boolean boolean41 = grayPaintScale11.equals((java.lang.Object) grayPaintScale39);
        boolean boolean42 = grayPaintScale0.equals((java.lang.Object) grayPaintScale39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale11", grayPaintScale0.equals(grayPaintScale11) ? grayPaintScale0.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean24 = grayPaintScale17.equals((java.lang.Object) 0.0d);
        boolean boolean25 = grayPaintScale16.equals((java.lang.Object) 0.0d);
        boolean boolean27 = grayPaintScale16.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass28 = grayPaintScale16.getClass();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
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
        double double14 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double9 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (short) 0);
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) 0);
        boolean boolean26 = grayPaintScale12.equals((java.lang.Object) grayPaintScale20);
        double double27 = grayPaintScale20.getLowerBound();
        double double28 = grayPaintScale20.getLowerBound();
        double double29 = grayPaintScale20.getUpperBound();
        boolean boolean30 = grayPaintScale8.equals((java.lang.Object) double29);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 1.0d);
        double double34 = grayPaintScale33.getLowerBound();
        boolean boolean35 = grayPaintScale8.equals((java.lang.Object) grayPaintScale33);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) boolean35);
        java.lang.Object obj37 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean40 = grayPaintScale38.equals((java.lang.Object) "hi!");
        java.awt.Paint paint42 = grayPaintScale38.getPaint((double) 1);
        double double43 = grayPaintScale38.getUpperBound();
        double double44 = grayPaintScale38.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale47 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean48 = grayPaintScale38.equals((java.lang.Object) 0.0d);
        double double49 = grayPaintScale38.getUpperBound();
        java.awt.Paint paint51 = grayPaintScale38.getPaint(0.0d);
        boolean boolean52 = grayPaintScale2.equals((java.lang.Object) paint51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj37", grayPaintScale2.equals(obj37) ? grayPaintScale2.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
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
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj19", grayPaintScale13.equals(obj19) ? grayPaintScale13.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale0.equals(obj8);
        double double10 = grayPaintScale0.getLowerBound();
        double double11 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double15 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (byte) 100);
        boolean boolean24 = grayPaintScale18.equals((java.lang.Object) (byte) 100);
        double double25 = grayPaintScale18.getLowerBound();
        double double26 = grayPaintScale18.getUpperBound();
        double double27 = grayPaintScale18.getLowerBound();
        double double28 = grayPaintScale18.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean31 = grayPaintScale29.equals((java.lang.Object) "hi!");
        double double32 = grayPaintScale29.getLowerBound();
        double double33 = grayPaintScale29.getUpperBound();
        boolean boolean34 = grayPaintScale18.equals((java.lang.Object) double33);
        double double35 = grayPaintScale18.getUpperBound();
        boolean boolean36 = grayPaintScale14.equals((java.lang.Object) grayPaintScale18);
        java.awt.Paint paint38 = grayPaintScale14.getPaint((double) 1L);
        boolean boolean39 = grayPaintScale0.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale29", grayPaintScale0.equals(grayPaintScale29) ? grayPaintScale0.hashCode() == grayPaintScale29.hashCode() : true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100.0f);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) "hi!");
        double double11 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) 0.0d);
        double double16 = grayPaintScale8.getUpperBound();
        double double17 = grayPaintScale8.getUpperBound();
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) double17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 100);
        boolean boolean22 = grayPaintScale7.equals((java.lang.Object) (short) 100);
        java.awt.Paint paint24 = grayPaintScale7.getPaint((double) 1.0f);
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale8", grayPaintScale0.equals(grayPaintScale8) ? grayPaintScale0.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double11 = grayPaintScale0.getUpperBound();
        double double12 = grayPaintScale0.getUpperBound();
        double double13 = grayPaintScale0.getUpperBound();
        java.lang.Object obj14 = grayPaintScale0.clone();
        java.lang.Object obj15 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj14", grayPaintScale0.equals(obj14) ? grayPaintScale0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double14 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint((double) (-1L));
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) 1.0f);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
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
        double double18 = grayPaintScale2.getLowerBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass20 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) 0);
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getUpperBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj15 = grayPaintScale9.clone();
        java.lang.Class<?> wildcardClass16 = grayPaintScale9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj15", grayPaintScale9.equals(obj15) ? grayPaintScale9.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
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
        java.lang.Object obj19 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double23 = grayPaintScale22.getUpperBound();
        java.lang.Class<?> wildcardClass24 = grayPaintScale22.getClass();
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj19", grayPaintScale0.equals(obj19) ? grayPaintScale0.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        double double11 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 1.0f);
        double double18 = grayPaintScale15.getLowerBound();
        double double19 = grayPaintScale15.getLowerBound();
        double double20 = grayPaintScale15.getLowerBound();
        double double21 = grayPaintScale15.getLowerBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj23 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 100);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10.0f);
        double double10 = grayPaintScale9.getLowerBound();
        java.lang.Object obj11 = grayPaintScale9.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj11", grayPaintScale9.equals(obj11) ? grayPaintScale9.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        double double8 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) 10L);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0L);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale5.equals(obj13);
        java.awt.Paint paint16 = grayPaintScale5.getPaint(0.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) paint16);
        double double18 = grayPaintScale2.getUpperBound();
        double double19 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean27 = grayPaintScale20.equals((java.lang.Object) 0.0d);
        double double28 = grayPaintScale20.getUpperBound();
        java.lang.Object obj29 = new java.lang.Object();
        boolean boolean30 = grayPaintScale20.equals(obj29);
        double double31 = grayPaintScale20.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean35 = grayPaintScale20.equals((java.lang.Object) grayPaintScale34);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        java.lang.Object obj37 = grayPaintScale20.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean43 = grayPaintScale41.equals((java.lang.Object) "hi!");
        double double44 = grayPaintScale41.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale47 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean48 = grayPaintScale41.equals((java.lang.Object) 0.0d);
        double double49 = grayPaintScale41.getUpperBound();
        java.awt.Paint paint51 = grayPaintScale41.getPaint(1.0d);
        boolean boolean52 = grayPaintScale40.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint54 = grayPaintScale40.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass55 = grayPaintScale40.getClass();
        boolean boolean56 = grayPaintScale20.equals((java.lang.Object) wildcardClass55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj37", grayPaintScale20.equals(obj37) ? grayPaintScale20.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        double double7 = grayPaintScale6.getUpperBound();
        java.lang.Object obj8 = grayPaintScale6.clone();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        double double15 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj14", grayPaintScale0.equals(obj14) ? grayPaintScale0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 10);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0.0f);
        double double8 = grayPaintScale5.getLowerBound();
        java.lang.Class<?> wildcardClass9 = grayPaintScale5.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) wildcardClass9);
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
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
        java.awt.Paint paint20 = grayPaintScale10.getPaint(1.0d);
        double double21 = grayPaintScale10.getUpperBound();
        java.lang.Object obj22 = grayPaintScale10.clone();
        double double23 = grayPaintScale10.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj22", grayPaintScale10.equals(obj22) ? grayPaintScale10.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) double7);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) 0);
        double double13 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 10L);
        java.awt.Paint paint17 = grayPaintScale10.getPaint((double) 0L);
        double double18 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean24 = grayPaintScale22.equals((java.lang.Object) "hi!");
        double double25 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) 0);
        boolean boolean28 = grayPaintScale21.equals((java.lang.Object) paint27);
        double double29 = grayPaintScale21.getLowerBound();
        boolean boolean31 = grayPaintScale21.equals((java.lang.Object) 100.0f);
        double double32 = grayPaintScale21.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean36 = grayPaintScale21.equals((java.lang.Object) 0);
        java.awt.Paint paint38 = grayPaintScale21.getPaint((double) (short) 0);
        boolean boolean39 = grayPaintScale10.equals((java.lang.Object) grayPaintScale21);
        java.lang.Object obj40 = grayPaintScale21.clone();
        boolean boolean41 = grayPaintScale2.equals(obj40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale21 and obj40", grayPaintScale21.equals(obj40) ? grayPaintScale21.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
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
        java.lang.Object obj28 = null;
        boolean boolean29 = grayPaintScale14.equals(obj28);
        java.lang.Object obj30 = grayPaintScale14.clone();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj30", grayPaintScale14.equals(obj30) ? grayPaintScale14.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (short) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
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
        double double12 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean29 = grayPaintScale27.equals((java.lang.Object) "hi!");
        double double30 = grayPaintScale27.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean34 = grayPaintScale27.equals((java.lang.Object) 0.0d);
        java.lang.Object obj35 = null;
        boolean boolean36 = grayPaintScale27.equals(obj35);
        boolean boolean37 = grayPaintScale26.equals((java.lang.Object) grayPaintScale27);
        double double38 = grayPaintScale27.getUpperBound();
        java.awt.Paint paint40 = grayPaintScale27.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale43 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        boolean boolean45 = grayPaintScale43.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass46 = grayPaintScale43.getClass();
        boolean boolean47 = grayPaintScale27.equals((java.lang.Object) grayPaintScale43);
        boolean boolean48 = grayPaintScale2.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
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
        java.lang.Object obj25 = grayPaintScale2.clone();
        java.lang.Object obj26 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
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
        double double28 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj27", grayPaintScale2.equals(obj27) ? grayPaintScale2.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double35 = grayPaintScale34.getLowerBound();
        java.awt.Paint paint37 = grayPaintScale34.getPaint((double) (short) 10);
        boolean boolean39 = grayPaintScale34.equals((java.lang.Object) 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double43 = grayPaintScale42.getLowerBound();
        double double44 = grayPaintScale42.getLowerBound();
        double double45 = grayPaintScale42.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale48 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double49 = grayPaintScale48.getLowerBound();
        boolean boolean51 = grayPaintScale48.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint53 = grayPaintScale48.getPaint((double) (short) 0);
        java.awt.Paint paint55 = grayPaintScale48.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale56 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean58 = grayPaintScale56.equals((java.lang.Object) "hi!");
        double double59 = grayPaintScale56.getLowerBound();
        java.awt.Paint paint61 = grayPaintScale56.getPaint((double) 0);
        boolean boolean62 = grayPaintScale48.equals((java.lang.Object) grayPaintScale56);
        java.awt.Paint paint64 = grayPaintScale56.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale67 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        boolean boolean68 = grayPaintScale56.equals((java.lang.Object) '#');
        boolean boolean69 = grayPaintScale42.equals((java.lang.Object) grayPaintScale56);
        double double70 = grayPaintScale42.getLowerBound();
        boolean boolean71 = grayPaintScale34.equals((java.lang.Object) grayPaintScale42);
        boolean boolean72 = grayPaintScale14.equals((java.lang.Object) boolean71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale48", grayPaintScale6.equals(grayPaintScale48) ? grayPaintScale6.hashCode() == grayPaintScale48.hashCode() : true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double13 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale12.getPaint((double) (short) -1);
        double double16 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale12.getPaint((double) 0.0f);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) paint18);
        java.lang.Object obj20 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean28 = grayPaintScale21.equals((java.lang.Object) 0.0d);
        double double29 = grayPaintScale21.getUpperBound();
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = grayPaintScale21.equals(obj30);
        double double32 = grayPaintScale21.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean36 = grayPaintScale21.equals((java.lang.Object) grayPaintScale35);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double40 = grayPaintScale39.getUpperBound();
        boolean boolean41 = grayPaintScale21.equals((java.lang.Object) double40);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double45 = grayPaintScale44.getLowerBound();
        boolean boolean46 = grayPaintScale21.equals((java.lang.Object) grayPaintScale44);
        double double47 = grayPaintScale44.getUpperBound();
        boolean boolean48 = grayPaintScale0.equals((java.lang.Object) grayPaintScale44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj20", grayPaintScale0.equals(obj20) ? grayPaintScale0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double8 = grayPaintScale7.getUpperBound();
        java.lang.Object obj9 = grayPaintScale7.clone();
        boolean boolean10 = grayPaintScale2.equals(obj9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj9", grayPaintScale7.equals(obj9) ? grayPaintScale7.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double6 = grayPaintScale0.getLowerBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (-1));
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean13 = grayPaintScale10.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (short) 0);
        boolean boolean17 = grayPaintScale10.equals((java.lang.Object) 0.0d);
        double double18 = grayPaintScale10.getLowerBound();
        double double19 = grayPaintScale10.getLowerBound();
        double double20 = grayPaintScale10.getUpperBound();
        double double21 = grayPaintScale10.getLowerBound();
        double double22 = grayPaintScale10.getUpperBound();
        double double23 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale10.getPaint((-1.0d));
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) "hi!");
        double double11 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) 0.0d);
        double double16 = grayPaintScale8.getUpperBound();
        double double17 = grayPaintScale8.getLowerBound();
        double double18 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale8.getPaint(0.0d);
        double double21 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale8.getPaint((double) 1L);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(1.0d);
        double double11 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) "hi!");
        double double15 = grayPaintScale12.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean19 = grayPaintScale12.equals((java.lang.Object) 0.0d);
        java.lang.Object obj20 = grayPaintScale12.clone();
        boolean boolean21 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale12", grayPaintScale0.equals(grayPaintScale12) ? grayPaintScale0.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
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
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.awt.Paint paint11 = grayPaintScale9.getPaint(35.0d);
        java.awt.Paint paint13 = grayPaintScale9.getPaint((double) (byte) 0);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj15 = grayPaintScale9.clone();
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
        double double33 = grayPaintScale26.getLowerBound();
        java.lang.Class<?> wildcardClass34 = grayPaintScale26.getClass();
        boolean boolean35 = grayPaintScale9.equals((java.lang.Object) grayPaintScale26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale18", grayPaintScale2.equals(grayPaintScale18) ? grayPaintScale2.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 100);
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
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
        double double38 = grayPaintScale2.getUpperBound();
        java.lang.Object obj39 = grayPaintScale2.clone();
        java.awt.Paint paint41 = grayPaintScale2.getPaint(100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj39", grayPaintScale2.equals(obj39) ? grayPaintScale2.hashCode() == obj39.hashCode() : true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
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
        double double15 = grayPaintScale0.getLowerBound();
        double double16 = grayPaintScale0.getLowerBound();
        java.lang.Object obj17 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj17", grayPaintScale0.equals(obj17) ? grayPaintScale0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 100L);
        java.lang.Object obj11 = grayPaintScale5.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj11", grayPaintScale5.equals(obj11) ? grayPaintScale5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
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
        double double21 = grayPaintScale7.getUpperBound();
        double double22 = grayPaintScale7.getUpperBound();
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint46 = grayPaintScale44.getPaint((double) (short) 0);
        java.lang.Class<?> wildcardClass47 = paint46.getClass();
        boolean boolean48 = grayPaintScale36.equals((java.lang.Object) paint46);
        double double49 = grayPaintScale36.getLowerBound();
        boolean boolean50 = grayPaintScale7.equals((java.lang.Object) grayPaintScale36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale36", grayPaintScale2.equals(grayPaintScale36) ? grayPaintScale2.hashCode() == grayPaintScale36.hashCode() : true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0.0f);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 10.0f);
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) (byte) 100);
        boolean boolean22 = grayPaintScale16.equals((java.lang.Object) (byte) 100);
        java.awt.Paint paint24 = grayPaintScale16.getPaint((double) 10.0f);
        java.lang.Object obj25 = grayPaintScale16.clone();
        boolean boolean26 = grayPaintScale2.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj25", grayPaintScale16.equals(obj25) ? grayPaintScale16.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double9 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (short) 0);
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) 0);
        boolean boolean26 = grayPaintScale12.equals((java.lang.Object) grayPaintScale20);
        double double27 = grayPaintScale20.getLowerBound();
        double double28 = grayPaintScale20.getLowerBound();
        double double29 = grayPaintScale20.getUpperBound();
        boolean boolean30 = grayPaintScale8.equals((java.lang.Object) double29);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 1.0d);
        double double34 = grayPaintScale33.getLowerBound();
        boolean boolean35 = grayPaintScale8.equals((java.lang.Object) grayPaintScale33);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) boolean35);
        java.lang.Object obj37 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass38 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj37", grayPaintScale2.equals(obj37) ? grayPaintScale2.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 100L);
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) -1);
        java.awt.Paint paint19 = grayPaintScale15.getPaint((double) 0);
        double double20 = grayPaintScale15.getLowerBound();
        boolean boolean21 = grayPaintScale9.equals((java.lang.Object) double20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) (short) -1);
        boolean boolean27 = grayPaintScale9.equals((java.lang.Object) grayPaintScale24);
        double double28 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 100);
        double double32 = grayPaintScale31.getUpperBound();
        double double33 = grayPaintScale31.getLowerBound();
        double double34 = grayPaintScale31.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale31.getPaint((double) (short) 100);
        boolean boolean37 = grayPaintScale9.equals((java.lang.Object) grayPaintScale31);
        java.lang.Object obj38 = grayPaintScale31.clone();
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100.0f);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass12 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10.0f);
        double double10 = grayPaintScale9.getLowerBound();
        java.lang.Object obj11 = grayPaintScale9.clone();
        boolean boolean12 = grayPaintScale0.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj11", grayPaintScale9.equals(obj11) ? grayPaintScale9.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double4 = grayPaintScale3.getUpperBound();
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass26 = grayPaintScale25.getClass();
        boolean boolean27 = grayPaintScale15.equals((java.lang.Object) grayPaintScale25);
        boolean boolean28 = grayPaintScale3.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj29 = null;
        boolean boolean30 = grayPaintScale15.equals(obj29);
        boolean boolean31 = grayPaintScale0.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100.0f);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint12 = grayPaintScale8.getPaint((double) (byte) 1);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getUpperBound();
        java.lang.Object obj18 = null;
        boolean boolean19 = grayPaintScale14.equals(obj18);
        double double20 = grayPaintScale14.getUpperBound();
        double double21 = grayPaintScale14.getUpperBound();
        boolean boolean22 = grayPaintScale8.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale14", grayPaintScale0.equals(grayPaintScale14) ? grayPaintScale0.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getLowerBound();
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) (short) 1);
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 35.0d);
        java.lang.Class<?> wildcardClass14 = grayPaintScale13.getClass();
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 1.0f);
        double double8 = grayPaintScale5.getLowerBound();
        java.lang.Object obj9 = grayPaintScale5.clone();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale5", grayPaintScale0.equals(grayPaintScale5) ? grayPaintScale0.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
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
        java.awt.Paint paint20 = grayPaintScale10.getPaint(1.0d);
        double double21 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        double double25 = grayPaintScale24.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean33 = grayPaintScale31.equals((java.lang.Object) "hi!");
        double double34 = grayPaintScale31.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale31.getPaint(0.0d);
        java.lang.Class<?> wildcardClass37 = paint36.getClass();
        boolean boolean38 = grayPaintScale28.equals((java.lang.Object) wildcardClass37);
        boolean boolean39 = grayPaintScale24.equals((java.lang.Object) grayPaintScale28);
        boolean boolean40 = grayPaintScale10.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale31", grayPaintScale10.equals(grayPaintScale31) ? grayPaintScale10.hashCode() == grayPaintScale31.hashCode() : true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean27 = grayPaintScale20.equals((java.lang.Object) 0.0d);
        double double28 = grayPaintScale20.getUpperBound();
        java.awt.Paint paint30 = grayPaintScale20.getPaint(1.0d);
        boolean boolean31 = grayPaintScale19.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint33 = grayPaintScale19.getPaint((double) (byte) 0);
        java.awt.Paint paint35 = grayPaintScale19.getPaint((double) (byte) 1);
        double double36 = grayPaintScale19.getLowerBound();
        double double37 = grayPaintScale19.getUpperBound();
        double double38 = grayPaintScale19.getUpperBound();
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) double38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale26", grayPaintScale2.equals(grayPaintScale26) ? grayPaintScale2.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
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
        java.lang.Object obj26 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
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
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double32 = grayPaintScale31.getLowerBound();
        boolean boolean34 = grayPaintScale31.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint36 = grayPaintScale31.getPaint((double) (short) 0);
        java.awt.Paint paint38 = grayPaintScale31.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean41 = grayPaintScale39.equals((java.lang.Object) "hi!");
        double double42 = grayPaintScale39.getLowerBound();
        java.awt.Paint paint44 = grayPaintScale39.getPaint((double) 0);
        boolean boolean45 = grayPaintScale31.equals((java.lang.Object) grayPaintScale39);
        boolean boolean47 = grayPaintScale39.equals((java.lang.Object) 10.0f);
        double double48 = grayPaintScale39.getLowerBound();
        double double49 = grayPaintScale39.getLowerBound();
        double double50 = grayPaintScale39.getUpperBound();
        double double51 = grayPaintScale39.getLowerBound();
        boolean boolean52 = grayPaintScale28.equals((java.lang.Object) double51);
        java.lang.Object obj53 = grayPaintScale28.clone();
        boolean boolean54 = grayPaintScale11.equals(obj53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale31", grayPaintScale2.equals(grayPaintScale31) ? grayPaintScale2.hashCode() == grayPaintScale31.hashCode() : true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0.0f);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (short) 10);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double16 = grayPaintScale15.getLowerBound();
        boolean boolean18 = grayPaintScale15.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (short) 0);
        java.awt.Paint paint22 = grayPaintScale15.getPaint((double) 0);
        double double23 = grayPaintScale15.getUpperBound();
        double double24 = grayPaintScale15.getUpperBound();
        java.lang.Object obj25 = grayPaintScale15.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj25", grayPaintScale15.equals(obj25) ? grayPaintScale15.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
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
        java.awt.Paint paint29 = grayPaintScale2.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj27", grayPaintScale2.equals(obj27) ? grayPaintScale2.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
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
        double double27 = grayPaintScale15.getLowerBound();
        double double28 = grayPaintScale15.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (byte) 100);
        java.awt.Paint paint33 = grayPaintScale31.getPaint(100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean39 = grayPaintScale37.equals((java.lang.Object) "hi!");
        double double40 = grayPaintScale37.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale43 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean44 = grayPaintScale37.equals((java.lang.Object) 0.0d);
        java.lang.Object obj45 = null;
        boolean boolean46 = grayPaintScale37.equals(obj45);
        boolean boolean47 = grayPaintScale36.equals((java.lang.Object) grayPaintScale37);
        double double48 = grayPaintScale37.getUpperBound();
        java.awt.Paint paint50 = grayPaintScale37.getPaint((double) 0L);
        java.lang.Class<?> wildcardClass51 = paint50.getClass();
        boolean boolean52 = grayPaintScale31.equals((java.lang.Object) paint50);
        boolean boolean53 = grayPaintScale15.equals((java.lang.Object) grayPaintScale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and grayPaintScale37", grayPaintScale16.equals(grayPaintScale37) ? grayPaintScale16.hashCode() == grayPaintScale37.hashCode() : true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        double double8 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) 10L);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0L);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale5.equals(obj13);
        java.awt.Paint paint16 = grayPaintScale5.getPaint(0.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) paint16);
        double double18 = grayPaintScale2.getUpperBound();
        double double19 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean27 = grayPaintScale20.equals((java.lang.Object) 0.0d);
        double double28 = grayPaintScale20.getUpperBound();
        java.lang.Object obj29 = new java.lang.Object();
        boolean boolean30 = grayPaintScale20.equals(obj29);
        double double31 = grayPaintScale20.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean35 = grayPaintScale20.equals((java.lang.Object) grayPaintScale34);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        java.lang.Object obj37 = grayPaintScale20.clone();
        java.lang.Object obj38 = grayPaintScale20.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj37", grayPaintScale20.equals(obj37) ? grayPaintScale20.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double9 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (short) 0);
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) 0);
        boolean boolean26 = grayPaintScale12.equals((java.lang.Object) grayPaintScale20);
        double double27 = grayPaintScale20.getLowerBound();
        double double28 = grayPaintScale20.getLowerBound();
        double double29 = grayPaintScale20.getUpperBound();
        boolean boolean30 = grayPaintScale8.equals((java.lang.Object) double29);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 1.0d);
        double double34 = grayPaintScale33.getLowerBound();
        boolean boolean35 = grayPaintScale8.equals((java.lang.Object) grayPaintScale33);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) boolean35);
        java.lang.Object obj37 = grayPaintScale2.clone();
        double double38 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj37", grayPaintScale2.equals(obj37) ? grayPaintScale2.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) (byte) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj10 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 100.0d);
        boolean boolean14 = grayPaintScale3.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj10", grayPaintScale3.equals(obj10) ? grayPaintScale3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 1);
        double double12 = grayPaintScale7.getUpperBound();
        double double13 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale7.getPaint((double) 1L);
        java.lang.Object obj16 = grayPaintScale7.clone();
        boolean boolean17 = grayPaintScale0.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale7", grayPaintScale0.equals(grayPaintScale7) ? grayPaintScale0.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
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
        java.lang.Class<?> wildcardClass27 = grayPaintScale6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj26", grayPaintScale6.equals(obj26) ? grayPaintScale6.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
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
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean24 = grayPaintScale22.equals((java.lang.Object) "hi!");
        double double25 = grayPaintScale22.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean29 = grayPaintScale22.equals((java.lang.Object) 0.0d);
        double double30 = grayPaintScale22.getUpperBound();
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = grayPaintScale22.equals(obj31);
        double double33 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean37 = grayPaintScale22.equals((java.lang.Object) grayPaintScale36);
        double double38 = grayPaintScale36.getLowerBound();
        java.lang.Object obj39 = grayPaintScale36.clone();
        boolean boolean40 = grayPaintScale2.equals(obj39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale28", grayPaintScale2.equals(grayPaintScale28) ? grayPaintScale2.hashCode() == grayPaintScale28.hashCode() : true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint(1.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
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
        java.lang.Object obj39 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass40 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj39", grayPaintScale2.equals(obj39) ? grayPaintScale2.hashCode() == obj39.hashCode() : true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double6 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint((double) (short) -1);
        double double9 = grayPaintScale5.getLowerBound();
        java.lang.Class<?> wildcardClass10 = grayPaintScale5.getClass();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) wildcardClass10);
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
        double double26 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale13.getPaint((double) 1L);
        java.lang.Object obj29 = grayPaintScale13.clone();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj29", grayPaintScale13.equals(obj29) ? grayPaintScale13.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        double double12 = grayPaintScale3.getLowerBound();
        double double13 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale3.getPaint(0.0d);
        java.lang.Object obj16 = null;
        boolean boolean17 = grayPaintScale3.equals(obj16);
        double double18 = grayPaintScale3.getLowerBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) double18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) (byte) 100);
        boolean boolean28 = grayPaintScale22.equals((java.lang.Object) (byte) 100);
        double double29 = grayPaintScale22.getLowerBound();
        double double30 = grayPaintScale22.getUpperBound();
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
        boolean boolean49 = grayPaintScale33.equals((java.lang.Object) (byte) 1);
        double double50 = grayPaintScale33.getUpperBound();
        boolean boolean51 = grayPaintScale22.equals((java.lang.Object) double50);
        double double52 = grayPaintScale22.getLowerBound();
        java.lang.Object obj53 = grayPaintScale22.clone();
        boolean boolean54 = grayPaintScale2.equals(obj53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale41", grayPaintScale3.equals(grayPaintScale41) ? grayPaintScale3.hashCode() == grayPaintScale41.hashCode() : true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double23 = grayPaintScale22.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint31 = grayPaintScale29.getPaint((double) (byte) 100);
        boolean boolean32 = grayPaintScale26.equals((java.lang.Object) (byte) 100);
        double double33 = grayPaintScale26.getLowerBound();
        double double34 = grayPaintScale26.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double38 = grayPaintScale37.getLowerBound();
        boolean boolean40 = grayPaintScale37.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint42 = grayPaintScale37.getPaint((double) (short) 0);
        java.awt.Paint paint44 = grayPaintScale37.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale45 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean47 = grayPaintScale45.equals((java.lang.Object) "hi!");
        double double48 = grayPaintScale45.getLowerBound();
        java.awt.Paint paint50 = grayPaintScale45.getPaint((double) 0);
        boolean boolean51 = grayPaintScale37.equals((java.lang.Object) grayPaintScale45);
        boolean boolean53 = grayPaintScale37.equals((java.lang.Object) (byte) 1);
        double double54 = grayPaintScale37.getUpperBound();
        boolean boolean55 = grayPaintScale26.equals((java.lang.Object) double54);
        boolean boolean56 = grayPaintScale22.equals((java.lang.Object) grayPaintScale26);
        double double57 = grayPaintScale22.getUpperBound();
        java.lang.Object obj58 = grayPaintScale22.clone();
        boolean boolean59 = grayPaintScale13.equals(obj58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale45", grayPaintScale0.equals(grayPaintScale45) ? grayPaintScale0.hashCode() == grayPaintScale45.hashCode() : true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 100L);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
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
        java.lang.Object obj39 = grayPaintScale2.clone();
        java.awt.Paint paint41 = grayPaintScale2.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj39", grayPaintScale2.equals(obj39) ? grayPaintScale2.hashCode() == obj39.hashCode() : true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 10);
        double double6 = grayPaintScale2.getUpperBound();
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
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale();
        double double28 = grayPaintScale27.getUpperBound();
        double double29 = grayPaintScale27.getLowerBound();
        double double30 = grayPaintScale27.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale27.getPaint(0.0d);
        double double33 = grayPaintScale27.getUpperBound();
        double double34 = grayPaintScale27.getLowerBound();
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) double34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale27", grayPaintScale7.equals(grayPaintScale27) ? grayPaintScale7.hashCode() == grayPaintScale27.hashCode() : true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
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
        java.lang.Object obj28 = grayPaintScale14.clone();
        java.awt.Paint paint30 = grayPaintScale14.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj28", grayPaintScale14.equals(obj28) ? grayPaintScale14.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double36 = grayPaintScale35.getLowerBound();
        boolean boolean38 = grayPaintScale35.equals((java.lang.Object) (short) -1);
        double double39 = grayPaintScale35.getLowerBound();
        java.awt.Paint paint41 = grayPaintScale35.getPaint((double) (-1));
        java.awt.Paint paint43 = grayPaintScale35.getPaint((double) (short) -1);
        boolean boolean44 = grayPaintScale14.equals((java.lang.Object) paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale35", grayPaintScale6.equals(grayPaintScale35) ? grayPaintScale6.hashCode() == grayPaintScale35.hashCode() : true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
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
        double double18 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double25 = grayPaintScale24.getLowerBound();
        boolean boolean27 = grayPaintScale24.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) (short) 0);
        boolean boolean30 = grayPaintScale19.equals((java.lang.Object) grayPaintScale24);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale24", grayPaintScale2.equals(grayPaintScale24) ? grayPaintScale2.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale3.equals(obj11);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) (byte) 100);
        boolean boolean22 = grayPaintScale16.equals((java.lang.Object) (byte) 100);
        double double23 = grayPaintScale16.getLowerBound();
        double double24 = grayPaintScale16.getUpperBound();
        double double25 = grayPaintScale16.getUpperBound();
        double double26 = grayPaintScale16.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) "hi!");
        double double33 = grayPaintScale30.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale30.getPaint((double) 0);
        boolean boolean36 = grayPaintScale29.equals((java.lang.Object) paint35);
        double double37 = grayPaintScale29.getLowerBound();
        boolean boolean39 = grayPaintScale29.equals((java.lang.Object) 100.0f);
        boolean boolean40 = grayPaintScale16.equals((java.lang.Object) grayPaintScale29);
        double double41 = grayPaintScale29.getLowerBound();
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) double41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale30", grayPaintScale3.equals(grayPaintScale30) ? grayPaintScale3.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
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
        java.lang.Object obj35 = null;
        boolean boolean36 = grayPaintScale21.equals(obj35);
        boolean boolean37 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
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
        double double18 = grayPaintScale12.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) "hi!");
        double double22 = grayPaintScale19.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean26 = grayPaintScale19.equals((java.lang.Object) 0.0d);
        double double27 = grayPaintScale19.getUpperBound();
        java.lang.Object obj28 = new java.lang.Object();
        boolean boolean29 = grayPaintScale19.equals(obj28);
        double double30 = grayPaintScale19.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean34 = grayPaintScale19.equals((java.lang.Object) grayPaintScale33);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double38 = grayPaintScale37.getUpperBound();
        boolean boolean39 = grayPaintScale19.equals((java.lang.Object) double38);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double43 = grayPaintScale42.getLowerBound();
        boolean boolean44 = grayPaintScale19.equals((java.lang.Object) grayPaintScale42);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale47 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double48 = grayPaintScale47.getLowerBound();
        boolean boolean49 = grayPaintScale19.equals((java.lang.Object) grayPaintScale47);
        double double50 = grayPaintScale47.getUpperBound();
        java.lang.Object obj51 = grayPaintScale47.clone();
        boolean boolean52 = grayPaintScale12.equals((java.lang.Object) grayPaintScale47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and grayPaintScale19", grayPaintScale12.equals(grayPaintScale19) ? grayPaintScale12.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double11 = grayPaintScale0.getUpperBound();
        double double12 = grayPaintScale0.getUpperBound();
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
        boolean boolean31 = grayPaintScale15.equals((java.lang.Object) (byte) 1);
        double double32 = grayPaintScale15.getLowerBound();
        boolean boolean34 = grayPaintScale15.equals((java.lang.Object) (byte) 10);
        java.awt.Paint paint36 = grayPaintScale15.getPaint((double) (byte) 0);
        double double37 = grayPaintScale15.getLowerBound();
        double double38 = grayPaintScale15.getLowerBound();
        java.lang.Object obj39 = grayPaintScale15.clone();
        boolean boolean40 = grayPaintScale0.equals(obj39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale23", grayPaintScale0.equals(grayPaintScale23) ? grayPaintScale0.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 0);
        double double13 = grayPaintScale7.getUpperBound();
        double double14 = grayPaintScale7.getUpperBound();
        double double15 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale7.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double21 = grayPaintScale20.getLowerBound();
        double double22 = grayPaintScale20.getLowerBound();
        boolean boolean23 = grayPaintScale7.equals((java.lang.Object) grayPaintScale20);
        double double24 = grayPaintScale20.getLowerBound();
        double double25 = grayPaintScale20.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 10);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) 0.0f);
        double double31 = grayPaintScale28.getLowerBound();
        double double32 = grayPaintScale28.getUpperBound();
        boolean boolean33 = grayPaintScale20.equals((java.lang.Object) grayPaintScale28);
        double double34 = grayPaintScale20.getUpperBound();
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) double34);
        java.awt.Paint paint37 = grayPaintScale2.getPaint((double) 0.0f);
        java.lang.Object obj38 = grayPaintScale2.clone();
        java.awt.Paint paint40 = grayPaintScale2.getPaint((double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj38", grayPaintScale2.equals(obj38) ? grayPaintScale2.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) 100L);
        boolean boolean29 = grayPaintScale0.equals((java.lang.Object) grayPaintScale26);
        java.lang.Object obj30 = grayPaintScale26.clone();
        double double31 = grayPaintScale26.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale26 and obj30", grayPaintScale26.equals(obj30) ? grayPaintScale26.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale9.getPaint(0.0d);
        double double14 = grayPaintScale9.getUpperBound();
        double double15 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale9.getPaint((double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean20 = grayPaintScale18.equals((java.lang.Object) "hi!");
        java.awt.Paint paint22 = grayPaintScale18.getPaint((double) 1);
        double double23 = grayPaintScale18.getUpperBound();
        double double24 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale18.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass27 = paint26.getClass();
        boolean boolean28 = grayPaintScale9.equals((java.lang.Object) wildcardClass27);
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) boolean28);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10L);
        java.awt.Paint paint35 = grayPaintScale33.getPaint((-1.0d));
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale33", grayPaintScale9.equals(grayPaintScale33) ? grayPaintScale9.hashCode() == grayPaintScale33.hashCode() : true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        boolean boolean14 = grayPaintScale3.equals((java.lang.Object) grayPaintScale8);
        double double15 = grayPaintScale3.getUpperBound();
        double double16 = grayPaintScale3.getLowerBound();
        double double17 = grayPaintScale3.getUpperBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) double17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean24 = grayPaintScale22.equals((java.lang.Object) "hi!");
        double double25 = grayPaintScale22.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean29 = grayPaintScale22.equals((java.lang.Object) 0.0d);
        double double30 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale22.getPaint(1.0d);
        boolean boolean33 = grayPaintScale21.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint35 = grayPaintScale21.getPaint((double) 0);
        double double36 = grayPaintScale21.getLowerBound();
        double double37 = grayPaintScale21.getUpperBound();
        java.lang.Object obj38 = grayPaintScale21.clone();
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale22", grayPaintScale3.equals(grayPaintScale22) ? grayPaintScale3.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
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
        java.lang.Object obj20 = grayPaintScale10.clone();
        double double21 = grayPaintScale10.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj20", grayPaintScale10.equals(obj20) ? grayPaintScale10.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 1);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) (byte) 100);
        boolean boolean31 = grayPaintScale25.equals((java.lang.Object) (byte) 100);
        double double32 = grayPaintScale25.getLowerBound();
        double double33 = grayPaintScale25.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double37 = grayPaintScale36.getLowerBound();
        boolean boolean39 = grayPaintScale36.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint41 = grayPaintScale36.getPaint((double) (short) 0);
        java.awt.Paint paint43 = grayPaintScale36.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean46 = grayPaintScale44.equals((java.lang.Object) "hi!");
        double double47 = grayPaintScale44.getLowerBound();
        java.awt.Paint paint49 = grayPaintScale44.getPaint((double) 0);
        boolean boolean50 = grayPaintScale36.equals((java.lang.Object) grayPaintScale44);
        boolean boolean52 = grayPaintScale36.equals((java.lang.Object) (byte) 1);
        double double53 = grayPaintScale36.getUpperBound();
        boolean boolean54 = grayPaintScale25.equals((java.lang.Object) double53);
        java.awt.Paint paint56 = grayPaintScale25.getPaint((double) 10);
        double double57 = grayPaintScale25.getUpperBound();
        double double58 = grayPaintScale25.getLowerBound();
        double double59 = grayPaintScale25.getLowerBound();
        boolean boolean60 = grayPaintScale0.equals((java.lang.Object) double59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale44", grayPaintScale0.equals(grayPaintScale44) ? grayPaintScale0.hashCode() == grayPaintScale44.hashCode() : true);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 0);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) -1);
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) 0);
        double double17 = grayPaintScale14.getUpperBound();
        double double18 = grayPaintScale14.getUpperBound();
        boolean boolean19 = grayPaintScale7.equals((java.lang.Object) grayPaintScale14);
        double double20 = grayPaintScale7.getUpperBound();
        double double21 = grayPaintScale7.getLowerBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale7", grayPaintScale2.equals(grayPaintScale7) ? grayPaintScale2.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0);
        double double17 = grayPaintScale9.getUpperBound();
        double double18 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale9.getPaint((double) 0);
        double double21 = grayPaintScale9.getLowerBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        java.awt.Paint paint26 = grayPaintScale24.getPaint((double) 10L);
        java.lang.Object obj27 = grayPaintScale24.clone();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale24 and obj27", grayPaintScale24.equals(obj27) ? grayPaintScale24.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
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
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 1.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (byte) 1);
        double double9 = grayPaintScale6.getLowerBound();
        java.lang.Object obj10 = grayPaintScale6.clone();
        boolean boolean11 = grayPaintScale2.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 100);
        double double12 = grayPaintScale11.getUpperBound();
        double double13 = grayPaintScale11.getLowerBound();
        double double14 = grayPaintScale11.getUpperBound();
        java.lang.Object obj15 = grayPaintScale11.clone();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj15", grayPaintScale11.equals(obj15) ? grayPaintScale11.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
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
        java.lang.Object obj16 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        double double12 = grayPaintScale3.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 35.0d);
        java.lang.Object obj18 = grayPaintScale17.clone();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 100);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and grayPaintScale18", grayPaintScale14.equals(grayPaintScale18) ? grayPaintScale14.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 1);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale4.equals((java.lang.Object) "hi!");
        double double7 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale4.getPaint((double) 0);
        double double10 = grayPaintScale4.getUpperBound();
        double double11 = grayPaintScale4.getUpperBound();
        double double12 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale4.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getLowerBound();
        boolean boolean20 = grayPaintScale4.equals((java.lang.Object) grayPaintScale17);
        double double21 = grayPaintScale17.getUpperBound();
        double double22 = grayPaintScale17.getLowerBound();
        java.lang.Object obj23 = grayPaintScale17.clone();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
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
        double double24 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) 0.0d);
        double double14 = grayPaintScale6.getUpperBound();
        double double15 = grayPaintScale6.getLowerBound();
        double double16 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale6.getPaint(0.0d);
        double double19 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale6.getPaint((double) 1L);
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale12", grayPaintScale2.equals(grayPaintScale12) ? grayPaintScale2.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) (short) -1);
        double double13 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale9.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) 0);
        double double22 = grayPaintScale16.getUpperBound();
        double double23 = grayPaintScale16.getUpperBound();
        double double24 = grayPaintScale16.getUpperBound();
        double double25 = grayPaintScale16.getLowerBound();
        boolean boolean26 = grayPaintScale9.equals((java.lang.Object) grayPaintScale16);
        double double27 = grayPaintScale16.getUpperBound();
        double double28 = grayPaintScale16.getUpperBound();
        double double29 = grayPaintScale16.getUpperBound();
        double double30 = grayPaintScale16.getLowerBound();
        boolean boolean31 = grayPaintScale0.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale16", grayPaintScale0.equals(grayPaintScale16) ? grayPaintScale0.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        double double9 = grayPaintScale3.getUpperBound();
        double double10 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        double double17 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale3.equals((java.lang.Object) grayPaintScale13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double22 = grayPaintScale21.getLowerBound();
        double double23 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale21.getPaint(0.0d);
        boolean boolean26 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        java.awt.Paint paint31 = grayPaintScale29.getPaint((double) 100L);
        boolean boolean32 = grayPaintScale3.equals((java.lang.Object) grayPaintScale29);
        java.lang.Object obj33 = grayPaintScale29.clone();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) grayPaintScale29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale29 and obj33", grayPaintScale29.equals(obj33) ? grayPaintScale29.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 0);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) "hi!");
        double double11 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) 0.0d);
        boolean boolean16 = grayPaintScale7.equals((java.lang.Object) 0.0d);
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) (byte) 0);
        java.awt.Paint paint20 = grayPaintScale7.getPaint((double) (short) -1);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale5.getPaint(0.0d);
        double double10 = grayPaintScale5.getUpperBound();
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) 1);
        double double19 = grayPaintScale14.getUpperBound();
        double double20 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass23 = paint22.getClass();
        boolean boolean24 = grayPaintScale5.equals((java.lang.Object) wildcardClass23);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) boolean24);
        double double26 = grayPaintScale2.getLowerBound();
        java.lang.Object obj27 = grayPaintScale2.clone();
        java.lang.Object obj28 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj27", grayPaintScale2.equals(obj27) ? grayPaintScale2.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
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
        java.lang.Object obj18 = grayPaintScale11.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj17", grayPaintScale11.equals(obj17) ? grayPaintScale11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (short) 100);
        boolean boolean16 = grayPaintScale10.equals((java.lang.Object) ' ');
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) boolean16);
        java.lang.Object obj18 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        java.awt.Paint paint13 = grayPaintScale9.getPaint((double) 1);
        double double14 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean18 = grayPaintScale9.equals((java.lang.Object) (short) -1);
        double double19 = grayPaintScale9.getUpperBound();
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) double19);
        java.lang.Object obj21 = grayPaintScale6.clone();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) "hi!");
        double double22 = grayPaintScale19.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean26 = grayPaintScale19.equals((java.lang.Object) 0.0d);
        java.lang.Object obj27 = null;
        boolean boolean28 = grayPaintScale19.equals(obj27);
        boolean boolean29 = grayPaintScale18.equals((java.lang.Object) grayPaintScale19);
        double double30 = grayPaintScale19.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale19.getPaint(0.0d);
        java.lang.Object obj33 = grayPaintScale19.clone();
        boolean boolean34 = grayPaintScale10.equals(obj33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale19", grayPaintScale0.equals(grayPaintScale19) ? grayPaintScale0.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
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
        java.lang.Object obj24 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj24", grayPaintScale0.equals(obj24) ? grayPaintScale0.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getUpperBound();
        double double11 = grayPaintScale0.getUpperBound();
        double double12 = grayPaintScale0.getUpperBound();
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Object obj14 = null;
        boolean boolean15 = grayPaintScale0.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale0.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 100L);
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) 100L);
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass14 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) -1);
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0);
        double double11 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) double11);
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Object obj13 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
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
        double double17 = grayPaintScale10.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj16", grayPaintScale10.equals(obj16) ? grayPaintScale10.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (byte) 100);
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) (byte) 100);
        double double15 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        java.lang.Object obj19 = grayPaintScale18.clone();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj19", grayPaintScale18.equals(obj19) ? grayPaintScale18.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 10L);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale7);
        double double14 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale0.getPaint((double) (short) 1);
        java.lang.Object obj17 = grayPaintScale0.clone();
        double double18 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj17", grayPaintScale0.equals(obj17) ? grayPaintScale0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale3.equals(obj11);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double14 = grayPaintScale2.getUpperBound();
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (-1L));
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) 1.0f);
        java.lang.Object obj25 = grayPaintScale19.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale19 and obj25", grayPaintScale19.equals(obj25) ? grayPaintScale19.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
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
        java.awt.Paint paint37 = grayPaintScale6.getPaint((double) 10);
        double double38 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint40 = grayPaintScale6.getPaint((double) 'a');
        double double41 = grayPaintScale6.getUpperBound();
        double double42 = grayPaintScale6.getUpperBound();
        double double43 = grayPaintScale6.getLowerBound();
        double double44 = grayPaintScale6.getUpperBound();
        java.lang.Object obj45 = grayPaintScale6.clone();
        boolean boolean46 = grayPaintScale2.equals(obj45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj45", grayPaintScale6.equals(obj45) ? grayPaintScale6.hashCode() == obj45.hashCode() : true);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) (short) -1);
        double double10 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) 0);
        double double13 = grayPaintScale0.getLowerBound();
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        java.awt.Paint paint20 = grayPaintScale18.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) "hi!");
        double double27 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) 0);
        boolean boolean30 = grayPaintScale23.equals((java.lang.Object) paint29);
        double double31 = grayPaintScale23.getLowerBound();
        boolean boolean33 = grayPaintScale23.equals((java.lang.Object) 100.0f);
        double double34 = grayPaintScale23.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean38 = grayPaintScale23.equals((java.lang.Object) 0);
        java.awt.Paint paint40 = grayPaintScale23.getPaint((double) (short) 0);
        boolean boolean41 = grayPaintScale18.equals((java.lang.Object) (short) 0);
        boolean boolean42 = grayPaintScale0.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale24", grayPaintScale0.equals(grayPaintScale24) ? grayPaintScale0.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean19 = grayPaintScale16.equals((java.lang.Object) (short) -1);
        double double20 = grayPaintScale16.getLowerBound();
        double double21 = grayPaintScale16.getLowerBound();
        java.lang.Object obj22 = grayPaintScale16.clone();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
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
        double double32 = grayPaintScale2.getLowerBound();
        double double33 = grayPaintScale2.getUpperBound();
        java.lang.Object obj34 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        double double38 = grayPaintScale37.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double42 = grayPaintScale41.getLowerBound();
        boolean boolean44 = grayPaintScale41.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint46 = grayPaintScale41.getPaint((double) (short) 0);
        java.awt.Paint paint48 = grayPaintScale41.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale49 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean51 = grayPaintScale49.equals((java.lang.Object) "hi!");
        double double52 = grayPaintScale49.getLowerBound();
        java.awt.Paint paint54 = grayPaintScale49.getPaint((double) 0);
        boolean boolean55 = grayPaintScale41.equals((java.lang.Object) grayPaintScale49);
        java.awt.Paint paint57 = grayPaintScale49.getPaint((double) 0.0f);
        boolean boolean58 = grayPaintScale37.equals((java.lang.Object) 0.0f);
        boolean boolean59 = grayPaintScale2.equals((java.lang.Object) grayPaintScale37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj34", grayPaintScale2.equals(obj34) ? grayPaintScale2.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
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
        java.lang.Class<?> wildcardClass15 = grayPaintScale7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj14", grayPaintScale7.equals(obj14) ? grayPaintScale7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) 100L);
        boolean boolean29 = grayPaintScale0.equals((java.lang.Object) grayPaintScale26);
        java.lang.Object obj30 = grayPaintScale26.clone();
        java.lang.Class<?> wildcardClass31 = grayPaintScale26.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale26 and obj30", grayPaintScale26.equals(obj30) ? grayPaintScale26.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
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
        java.lang.Class<?> wildcardClass36 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj35", grayPaintScale2.equals(obj35) ? grayPaintScale2.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 10L);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale7);
        double double14 = grayPaintScale0.getLowerBound();
        java.lang.Object obj15 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getUpperBound();
        double double20 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale16.getPaint((double) (byte) 1);
        java.lang.Class<?> wildcardClass23 = paint22.getClass();
        boolean boolean24 = grayPaintScale0.equals((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj15", grayPaintScale0.equals(obj15) ? grayPaintScale0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
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
        java.lang.Object obj38 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj37", grayPaintScale2.equals(obj37) ? grayPaintScale2.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
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
        java.awt.Paint paint21 = grayPaintScale2.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint29 = grayPaintScale27.getPaint((double) 0);
        double double30 = grayPaintScale27.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale27.getPaint((double) 10L);
        java.lang.Class<?> wildcardClass33 = paint32.getClass();
        boolean boolean34 = grayPaintScale24.equals((java.lang.Object) wildcardClass33);
        double double35 = grayPaintScale24.getUpperBound();
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) double35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale24", grayPaintScale9.equals(grayPaintScale24) ? grayPaintScale9.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
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
        java.lang.Object obj20 = grayPaintScale10.clone();
        double double21 = grayPaintScale10.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj20", grayPaintScale10.equals(obj20) ? grayPaintScale10.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        double double10 = grayPaintScale7.getUpperBound();
        java.lang.Object obj11 = grayPaintScale7.clone();
        boolean boolean12 = grayPaintScale0.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale7", grayPaintScale0.equals(grayPaintScale7) ? grayPaintScale0.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
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
        java.lang.Class<?> wildcardClass15 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj14", grayPaintScale0.equals(obj14) ? grayPaintScale0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double13 = grayPaintScale12.getLowerBound();
        double double14 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale12.getPaint(0.0d);
        double double17 = grayPaintScale12.getUpperBound();
        boolean boolean18 = grayPaintScale8.equals((java.lang.Object) grayPaintScale12);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
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
        double double38 = grayPaintScale33.getLowerBound();
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) double38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and grayPaintScale20", grayPaintScale8.equals(grayPaintScale20) ? grayPaintScale8.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass11 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 10L);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint15 = grayPaintScale7.getPaint((double) (-1L));
        java.lang.Object obj16 = grayPaintScale7.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double20 = grayPaintScale19.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double24 = grayPaintScale23.getLowerBound();
        boolean boolean26 = grayPaintScale23.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint28 = grayPaintScale23.getPaint((double) (short) 0);
        java.awt.Paint paint30 = grayPaintScale23.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean33 = grayPaintScale31.equals((java.lang.Object) "hi!");
        double double34 = grayPaintScale31.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale31.getPaint((double) 0);
        boolean boolean37 = grayPaintScale23.equals((java.lang.Object) grayPaintScale31);
        double double38 = grayPaintScale31.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass42 = grayPaintScale41.getClass();
        boolean boolean43 = grayPaintScale31.equals((java.lang.Object) grayPaintScale41);
        boolean boolean44 = grayPaintScale19.equals((java.lang.Object) grayPaintScale31);
        double double45 = grayPaintScale31.getUpperBound();
        double double46 = grayPaintScale31.getUpperBound();
        double double47 = grayPaintScale31.getUpperBound();
        boolean boolean48 = grayPaintScale7.equals((java.lang.Object) grayPaintScale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale31", grayPaintScale0.equals(grayPaintScale31) ? grayPaintScale0.hashCode() == grayPaintScale31.hashCode() : true);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        double double12 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean20 = grayPaintScale18.equals((java.lang.Object) "hi!");
        java.awt.Paint paint22 = grayPaintScale18.getPaint((double) 1);
        double double23 = grayPaintScale18.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean27 = grayPaintScale18.equals((java.lang.Object) (short) -1);
        double double28 = grayPaintScale18.getUpperBound();
        boolean boolean29 = grayPaintScale15.equals((java.lang.Object) double28);
        java.lang.Object obj30 = grayPaintScale15.clone();
        boolean boolean31 = grayPaintScale5.equals(obj30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale18", grayPaintScale0.equals(grayPaintScale18) ? grayPaintScale0.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
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
        java.lang.Object obj18 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        double double15 = grayPaintScale2.getUpperBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj16", grayPaintScale2.equals(obj16) ? grayPaintScale2.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) 0);
        double double12 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) 10L);
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0L);
        double double17 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale9.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        boolean boolean23 = grayPaintScale9.equals((java.lang.Object) 1.0d);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj25 = grayPaintScale2.clone();
        java.lang.Object obj26 = null;
        boolean boolean27 = grayPaintScale2.equals(obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) 10L);
        double double13 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 1L);
        boolean boolean20 = grayPaintScale8.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj21 = grayPaintScale8.clone();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale11", grayPaintScale2.equals(grayPaintScale11) ? grayPaintScale2.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (short) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) 0.0f);
        java.lang.Class<?> wildcardClass9 = grayPaintScale6.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, 10.0d);
        double double6 = grayPaintScale5.getUpperBound();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) double6);
        double double8 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getLowerBound();
        double double13 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale9.getPaint((double) (byte) 1);
        java.lang.Object obj16 = grayPaintScale9.clone();
        boolean boolean17 = grayPaintScale0.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
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
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 10.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) -1);
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0);
        double double11 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) double11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double16 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) 100L);
        double double22 = grayPaintScale19.getLowerBound();
        boolean boolean23 = grayPaintScale15.equals((java.lang.Object) grayPaintScale19);
        double double24 = grayPaintScale19.getLowerBound();
        java.lang.Object obj25 = grayPaintScale19.clone();
        boolean boolean26 = grayPaintScale0.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale15", grayPaintScale6.equals(grayPaintScale15) ? grayPaintScale6.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
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
        double double21 = grayPaintScale7.getUpperBound();
        double double22 = grayPaintScale7.getLowerBound();
        double double23 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double27 = grayPaintScale26.getLowerBound();
        boolean boolean29 = grayPaintScale26.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint31 = grayPaintScale26.getPaint((double) (short) 0);
        boolean boolean33 = grayPaintScale26.equals((java.lang.Object) 0.0d);
        double double34 = grayPaintScale26.getLowerBound();
        double double35 = grayPaintScale26.getLowerBound();
        double double36 = grayPaintScale26.getLowerBound();
        double double37 = grayPaintScale26.getUpperBound();
        java.lang.Object obj38 = grayPaintScale26.clone();
        boolean boolean39 = grayPaintScale7.equals((java.lang.Object) grayPaintScale26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale26", grayPaintScale13.equals(grayPaintScale26) ? grayPaintScale13.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100.0f);
        boolean boolean24 = grayPaintScale18.equals((java.lang.Object) 100.0f);
        double double25 = grayPaintScale18.getLowerBound();
        double double26 = grayPaintScale18.getUpperBound();
        java.lang.Object obj27 = grayPaintScale18.clone();
        boolean boolean28 = grayPaintScale0.equals(obj27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj27", grayPaintScale18.equals(obj27) ? grayPaintScale18.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        double double7 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean13 = grayPaintScale10.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (short) 0);
        boolean boolean17 = grayPaintScale10.equals((java.lang.Object) 0.0d);
        double double18 = grayPaintScale10.getLowerBound();
        double double19 = grayPaintScale10.getLowerBound();
        double double20 = grayPaintScale10.getLowerBound();
        double double21 = grayPaintScale10.getUpperBound();
        java.lang.Class<?> wildcardClass22 = grayPaintScale10.getClass();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) wildcardClass22);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) "hi!");
        double double27 = grayPaintScale24.getUpperBound();
        double double28 = grayPaintScale24.getLowerBound();
        double double29 = grayPaintScale24.getUpperBound();
        java.awt.Paint paint31 = grayPaintScale24.getPaint(1.0d);
        java.lang.Object obj32 = grayPaintScale24.clone();
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale24 and obj32", grayPaintScale24.equals(obj32) ? grayPaintScale24.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0.0f);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (short) 10);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        boolean boolean23 = grayPaintScale19.equals((java.lang.Object) '4');
        boolean boolean24 = grayPaintScale16.equals((java.lang.Object) grayPaintScale19);
        java.awt.Paint paint26 = grayPaintScale16.getPaint((double) 1);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint12 = grayPaintScale8.getPaint((double) (byte) 1);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale14", grayPaintScale0.equals(grayPaintScale14) ? grayPaintScale0.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
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
        double double17 = grayPaintScale11.getLowerBound();
        java.lang.Object obj18 = grayPaintScale11.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double22 = grayPaintScale21.getUpperBound();
        double double23 = grayPaintScale21.getUpperBound();
        java.lang.Object obj24 = grayPaintScale21.clone();
        boolean boolean25 = grayPaintScale11.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale21", grayPaintScale2.equals(grayPaintScale21) ? grayPaintScale2.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getUpperBound();
        double double20 = grayPaintScale18.getLowerBound();
        double double21 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale18.getPaint(0.0d);
        double double24 = grayPaintScale18.getUpperBound();
        double double25 = grayPaintScale18.getLowerBound();
        boolean boolean26 = grayPaintScale6.equals((java.lang.Object) double25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale18", grayPaintScale9.equals(grayPaintScale18) ? grayPaintScale9.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) (byte) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj10 = grayPaintScale3.clone();
        double double11 = grayPaintScale3.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj10", grayPaintScale3.equals(obj10) ? grayPaintScale3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) 0);
        double double12 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) 10L);
        java.lang.Class<?> wildcardClass15 = paint14.getClass();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass18 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj17", grayPaintScale0.equals(obj17) ? grayPaintScale0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
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
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0L);
        java.awt.Paint paint12 = grayPaintScale0.getPaint(1.0d);
        double double13 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) 1.0f);
        double double17 = grayPaintScale14.getLowerBound();
        double double18 = grayPaintScale14.getLowerBound();
        double double19 = grayPaintScale14.getLowerBound();
        double double20 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale14.getPaint(1.0d);
        double double23 = grayPaintScale14.getUpperBound();
        boolean boolean24 = grayPaintScale0.equals((java.lang.Object) double23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale14", grayPaintScale0.equals(grayPaintScale14) ? grayPaintScale0.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale0.getUpperBound();
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) "hi!");
        java.awt.Paint paint9 = grayPaintScale5.getPaint((double) 1);
        double double10 = grayPaintScale5.getUpperBound();
        double double11 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean15 = grayPaintScale5.equals((java.lang.Object) 0.0d);
        double double16 = grayPaintScale5.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) double16);
        double double18 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double22 = grayPaintScale21.getLowerBound();
        double double23 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale21.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean28 = grayPaintScale26.equals((java.lang.Object) "hi!");
        double double29 = grayPaintScale26.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean33 = grayPaintScale26.equals((java.lang.Object) 0.0d);
        double double34 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint36 = grayPaintScale26.getPaint(1.0d);
        boolean boolean37 = grayPaintScale21.equals((java.lang.Object) grayPaintScale26);
        java.awt.Paint paint39 = grayPaintScale26.getPaint((double) 0L);
        java.lang.Object obj40 = grayPaintScale26.clone();
        boolean boolean41 = grayPaintScale2.equals(obj40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale26", grayPaintScale5.equals(grayPaintScale26) ? grayPaintScale5.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale0.getPaint(0.0d);
        double double13 = grayPaintScale0.getUpperBound();
        double double14 = grayPaintScale0.getUpperBound();
        java.lang.Object obj15 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        java.lang.Class<?> wildcardClass21 = paint20.getClass();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj15", grayPaintScale0.equals(obj15) ? grayPaintScale0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double21 = grayPaintScale20.getLowerBound();
        double double22 = grayPaintScale20.getLowerBound();
        double double23 = grayPaintScale20.getLowerBound();
        boolean boolean25 = grayPaintScale20.equals((java.lang.Object) 100L);
        double double26 = grayPaintScale20.getLowerBound();
        double double27 = grayPaintScale20.getUpperBound();
        java.lang.Object obj28 = grayPaintScale20.clone();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj28", grayPaintScale20.equals(obj28) ? grayPaintScale20.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 0.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) (short) 1);
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass14 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 10L);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0L);
        double double15 = grayPaintScale7.getLowerBound();
        double double16 = grayPaintScale7.getUpperBound();
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale7.equals(obj17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 'a');
        boolean boolean22 = grayPaintScale7.equals((java.lang.Object) grayPaintScale21);
        java.lang.Object obj23 = grayPaintScale21.clone();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale21 and obj23", grayPaintScale21.equals(obj23) ? grayPaintScale21.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 100L);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.awt.Paint paint17 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
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
        java.lang.Object obj19 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass20 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj19", grayPaintScale0.equals(obj19) ? grayPaintScale0.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) 0.0d);
        double double14 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale6.getPaint(1.0d);
        boolean boolean17 = grayPaintScale5.equals((java.lang.Object) 1.0d);
        double double18 = grayPaintScale5.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale5.getClass();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) 0);
        double double26 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale23.getPaint((double) 10L);
        java.awt.Paint paint30 = grayPaintScale23.getPaint((double) 0L);
        double double31 = grayPaintScale23.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean37 = grayPaintScale35.equals((java.lang.Object) "hi!");
        double double38 = grayPaintScale35.getLowerBound();
        java.awt.Paint paint40 = grayPaintScale35.getPaint((double) 0);
        boolean boolean41 = grayPaintScale34.equals((java.lang.Object) paint40);
        double double42 = grayPaintScale34.getLowerBound();
        boolean boolean44 = grayPaintScale34.equals((java.lang.Object) 100.0f);
        double double45 = grayPaintScale34.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale48 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean49 = grayPaintScale34.equals((java.lang.Object) 0);
        java.awt.Paint paint51 = grayPaintScale34.getPaint((double) (short) 0);
        boolean boolean52 = grayPaintScale23.equals((java.lang.Object) grayPaintScale34);
        java.lang.Object obj53 = grayPaintScale34.clone();
        boolean boolean54 = grayPaintScale5.equals((java.lang.Object) grayPaintScale34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale48", grayPaintScale5.equals(grayPaintScale48) ? grayPaintScale5.hashCode() == grayPaintScale48.hashCode() : true);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
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
        double double17 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale20.equals((java.lang.Object) grayPaintScale21);
        double double28 = grayPaintScale20.getLowerBound();
        double double29 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint31 = grayPaintScale20.getPaint((double) (short) 0);
        java.awt.Paint paint33 = grayPaintScale20.getPaint((double) (byte) -1);
        java.lang.Class<?> wildcardClass34 = paint33.getClass();
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) wildcardClass34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale20", grayPaintScale2.equals(grayPaintScale20) ? grayPaintScale2.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
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
        java.awt.Paint paint36 = grayPaintScale28.getPaint((double) (byte) 1);
        java.awt.Paint paint38 = grayPaintScale28.getPaint(1.0d);
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale20", grayPaintScale2.equals(grayPaintScale20) ? grayPaintScale2.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) 0);
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getUpperBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint19 = grayPaintScale17.getPaint(1.0d);
        java.lang.Object obj20 = grayPaintScale17.clone();
        boolean boolean21 = grayPaintScale9.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj20", grayPaintScale17.equals(obj20) ? grayPaintScale17.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
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
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint(0.0d);
        double double27 = grayPaintScale21.getUpperBound();
        double double28 = grayPaintScale21.getLowerBound();
        double double29 = grayPaintScale21.getUpperBound();
        boolean boolean30 = grayPaintScale8.equals((java.lang.Object) double29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale21", grayPaintScale0.equals(grayPaintScale21) ? grayPaintScale0.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (short) 10);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        boolean boolean15 = grayPaintScale6.equals((java.lang.Object) 1L);
        double double16 = grayPaintScale6.getUpperBound();
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale6.equals(obj17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) 'a');
        double double24 = grayPaintScale21.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint29 = grayPaintScale27.getPaint((double) 0);
        java.lang.Class<?> wildcardClass30 = paint29.getClass();
        boolean boolean31 = grayPaintScale21.equals((java.lang.Object) paint29);
        boolean boolean32 = grayPaintScale6.equals((java.lang.Object) grayPaintScale21);
        double double33 = grayPaintScale6.getLowerBound();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) double33);
        java.lang.Object obj35 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass36 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj35", grayPaintScale2.equals(obj35) ? grayPaintScale2.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }
}

