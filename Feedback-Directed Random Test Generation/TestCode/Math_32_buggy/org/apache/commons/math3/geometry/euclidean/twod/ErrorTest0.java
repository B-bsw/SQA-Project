package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) ' ', (double) 0, (double) 10.0f, (double) 100);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((-1.0d), (double) ' ', (double) ' ', 10.0d);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(100.0d, (double) 10L, 0.0d, (double) (short) 100);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100L, (double) (-1), (double) 0L, (double) (short) 10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1L, (-1.0d), (double) 100.0f, (double) 100);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) -1, (double) (-1.0f), (double) (byte) 0, 0.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) -1, 1.0d, 52.999999999999844d, (double) 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10L, (double) 1L, Double.POSITIVE_INFINITY, 3467.9999999999995d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0.0f, (double) (byte) -1, (-1.0d), 108.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 10, (double) 1, (double) 0L, 120.99999999999999d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1L, (double) (short) -1, 0.0d, 108.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100.0f, (double) 0.0f, (double) (byte) 1, 100.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(10.0d, (double) (byte) 0, (double) (byte) 10, (double) 10L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(120.99999999999999d, 120.99999999999999d, (double) 0L, (double) (-1L));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(0.0d, (double) 1.0f, 120.99999999999999d, (double) 0.0f);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1.0f, Double.POSITIVE_INFINITY, 52.999999999999844d, (double) 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((-1.0d), (double) 10, (double) 'a', (double) 1L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) -1, (double) 100L, Double.POSITIVE_INFINITY, (double) (-1L));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 100, (double) 1.0f, (double) (-1), Double.POSITIVE_INFINITY);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 10, (double) (byte) 10, (double) 10, (double) 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(44.0d, (double) '#', 0.0d, (double) (short) 100);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100.0f, (double) 0.0f, (double) 1.0f, (double) 10.0f);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 1, 108.0d, (double) ' ', (double) (byte) 10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0.0f, (double) (short) -1, (double) (short) 10, 120.99999999999999d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1.0f, (double) 100, 1889.9999999999973d, (double) (byte) 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0L, 3467.9999999999995d, (double) 100L, (double) 10L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) '4', (double) (short) 100, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100.0f, (double) '4', (double) (-1), (double) (byte) 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10.0f, 0.0d, (double) (-1), (double) '#');
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(120.99999999999999d, 3467.9999999999995d, (double) (byte) 100, (double) (byte) 10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 100, (double) 'a', 0.0d, 0.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10L, (double) 10L, 3467.9999999999995d, (double) 100L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 'a', (double) '4', (-1.0d), (double) 100L);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1.0f, (double) 1, (double) ' ', (double) (byte) -1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) '4', (-1.0d), (double) 0, 100.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10L, (double) 100L, 3467.9999999999995d, (double) 'a');
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(1.0d, 52.999999999999844d, 108.0d, (double) (short) 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100, 0.0d, (double) (short) -1, (double) (short) 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 0, (double) 100L, (double) 100L, (double) (-1.0f));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100L, (double) 0L, (double) (byte) 0, (double) 10L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100L, (double) 100, (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(100.0d, 52.999999999999844d, (double) (byte) -1, (double) 1.0f);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) '#', (double) ' ', (double) (short) 10, (double) 10.0f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 100, Double.POSITIVE_INFINITY, (double) (short) 100, (double) (byte) 10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(0.0d, (double) 10L, 0.0d, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100L, (double) (byte) 100, (double) (short) 10, (double) 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0.0f, (double) ' ', (double) 10L, 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1, (double) (short) 100, 120.99999999999999d, (double) 0.0f);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10.0f, 108.0d, (double) 0L, (double) (-1.0f));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(0.0d, (double) (byte) 0, (double) 10, 44.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(1.0d, 0.0d, 52.999999999999844d, 100.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) ' ', (-1.0d), (double) (byte) 0, (double) '4');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(0.0d, (double) (byte) 1, Double.POSITIVE_INFINITY, (double) (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(0.0d, (double) (-1.0f), (double) 1.0f, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 100, (double) (short) -1, (double) '#', 108.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0, (double) (short) 0, (double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100.0f, (double) (byte) 100, (double) (byte) 1, (double) 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(100.0d, 0.0d, 0.0d, 1.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 0, (-1.0d), (double) 0, (double) (short) 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(100.0d, (double) 1L, (double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) -1, (double) 100, (double) 100, 1.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 100, (double) 10, (double) (byte) 0, (double) 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1, (double) (short) 100, (double) ' ', (double) (byte) 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(108.0d, (double) 'a', (double) (-1L), (-1.0d));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100L, 44.0d, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(108.0d, (double) 'a', 0.0d, (double) 10L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) ' ', (double) (short) 10, 0.0d, (double) 1.0f);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) '#', (double) 0L, (double) (byte) -1, (double) 100.0f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100L, (double) 100L, 1.0d, (double) 0.0f);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(3467.9999999999995d, (double) (byte) 0, 2.0d, 2.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) '#', (double) 1L, (double) (byte) 10, 220.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(44.0d, (double) 'a', (double) 1, 0.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0, (double) (short) 1, (double) (byte) 100, 100.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(999.9999999999993d, (double) '#', (double) 0L, 999.9999999999993d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 10, (double) (short) 100, (double) (byte) 10, (double) (byte) 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(100.0d, 220.0d, (double) (byte) 100, (double) 10L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(238.0d, 2.0d, (double) 100L, 1889.9999999999973d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(1889.9999999999973d, 111.99999999999952d, 44.0d, 120.99999999999999d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 10, (double) 0.0f, 111.99999999999952d, 999.9999999999993d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) -1, Double.POSITIVE_INFINITY, (double) 100L, 44.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(Double.POSITIVE_INFINITY, 44.0d, (double) 100, 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) ' ', (double) 100.0f, 120.99999999999999d, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1, Double.POSITIVE_INFINITY, (double) (short) 0, (double) 10.0f);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(Double.POSITIVE_INFINITY, (double) (byte) 100, (double) 10L, 52.999999999999844d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(980.9999999999993d, (double) (short) 100, (double) (byte) 10, 1889.9999999999973d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(Double.POSITIVE_INFINITY, 100.0d, 980.9999999999993d, 0.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 1, (double) 10, (double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(100.0d, (double) 1L, 44.0d, 115.99999999999997d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100.0f, (double) (short) 10, 1.0d, (double) 1.0f);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) -1, 3467.9999999999995d, (double) 1.0f, (double) (short) 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10.0f, 52.999999999999844d, (double) 1.0f, (double) (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(120.99999999999999d, (double) ' ', 44.0d, 44.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(1889.9999999999973d, (double) (short) 1, (double) 0, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((-1.0d), (double) 100L, 220.0d, (double) 0.0f);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(238.0d, (double) 10.0f, (double) 0L, 220.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) '4', (double) (-1), (double) 0L, (double) 1L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 1, (double) (-1.0f), (-1.0d), 220.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(111.99999999999952d, (double) 10L, (double) (short) 10, 10.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 100, 0.0d, (double) (short) -1, 120.99999999999999d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(120.99999999999999d, (double) (short) 100, (-1.0d), 120.99999999999999d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(220.0d, 111.99999999999952d, (double) (-1L), 0.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 0, (double) (short) 100, 44.0d, (double) 10L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0.0f, (double) 100L, 1889.9999999999973d, 236.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0, (double) 100.0f, (double) 0L, 0.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(Double.POSITIVE_INFINITY, 3467.9999999999995d, (double) (short) 0, (double) (short) -1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(1.0d, 238.0d, (double) (short) 0, (double) (-1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(1.0d, (double) 1.0f, (double) 1, 115.99999999999997d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) '#', (double) 100.0f, (double) 100.0f, (double) 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(Double.POSITIVE_INFINITY, 236.0d, 120.99999999999999d, (double) (short) 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(111.99999999999952d, (double) 10, (double) (byte) 1, 3467.9999999999995d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(68.0d, (double) (short) 100, (double) (short) 10, (double) 1.0f);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(52.999999999999844d, 0.0d, 108.0d, 115.99999999999997d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10L, (double) (byte) 0, (double) (byte) 0, 120.99999999999999d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 100, 1889.9999999999973d, (double) 1, (double) (short) 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(238.0d, Double.POSITIVE_INFINITY, 0.0d, (double) 'a');
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(44.0d, (double) 'a', 220.0d, (double) 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(238.0d, 236.0d, (double) 1L, 10.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1.0f, (double) 0L, (double) 0L, 1.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10.0f, (double) (byte) 0, (double) 10L, 86.99999999999943d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 100, 0.0d, (double) 100, (double) 100);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(980.9999999999993d, (double) 10L, (double) 10L, 220.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 'a', 50.99999999999983d, 0.0d, 111.99999999999952d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10, (double) 10, Double.POSITIVE_INFINITY, (double) (short) 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0L, 238.0d, 0.0d, (double) (short) 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1.0f, 111.99999999999952d, (double) 100.0f, (double) (short) 10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1L, (double) 1, (double) (byte) 10, (double) 0L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) -1, (double) 100, 86.99999999999943d, (double) 10L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0, (double) (short) -1, (double) (short) 1, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 10, (double) '#', 999.9999999999993d, 100.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 1, 1.0d, 236.0d, 1.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(111.99999999999952d, (double) 100.0f, (double) (short) 100, 999.9999999999993d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(44.0d, 120.99999999999999d, 236.0d, (double) (-1.0f));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(111.99999999999952d, (double) (byte) 0, (double) (short) 0, 108.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 1, (double) 0L, (double) 100L, 108.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(120.99999999999999d, 176.0d, (double) (byte) 100, (double) 0L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 'a', (double) 100.0f, 7065.999999999998d, (double) 100);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100.0f, (double) (-1), (double) (short) -1, 68.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(100.0d, (-1.0d), (double) 1, 44.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(176.0d, 176.0d, (double) 100L, (double) (byte) 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(3467.9999999999995d, (double) (short) 100, (double) (short) 1, 3467.9999999999995d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 10, (double) '4', 86.99999999999943d, (double) (byte) 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0L, 0.0d, 1889.9999999999973d, (double) 1.0f);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 1, 10.0d, 238.0d, (double) (short) 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(108.0d, (double) 0, 2.0d, 999.9999999999993d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) -1, 108.0d, (double) '4', (double) 10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 100, (double) (short) 100, (double) 1.0f, 50.99999999999983d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) '#', 111.99999999999952d, 200.0d, 115.99999999999997d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(3467.9999999999995d, 115.99999999999997d, 44.0d, 999.9999999999993d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((-1.0d), 1.0d, 1.0d, (double) (byte) 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0L, 176.0d, 3467.9999999999995d, (double) 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(50.99999999999983d, 50.99999999999983d, 1889.9999999999973d, (double) (byte) 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (-1.0f), (double) 0L, (double) 1.0f, 0.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 10, (double) (short) 1, 0.0d, 52.999999999999844d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0L, 200.0d, 402287.99999999907d, 52.999999999999844d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(999.9999999999993d, (double) (-1), (double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) ' ', 514.0d, 7003.999999999998d, (double) 1L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10L, (double) '4', 111.99999999999952d, (double) (byte) 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (-1L), (double) (short) 100, 50.99999999999983d, (double) 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(120.99999999999999d, (double) (byte) 1, (double) (byte) 0, 236.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(Double.POSITIVE_INFINITY, 0.0d, 115.99999999999997d, (double) 100L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (short) 1, (double) 0L, (double) (short) 1, (double) '4');
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0L, 115.99999999999997d, 238.0d, (double) (byte) 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(108.0d, (double) 0, (double) (byte) 0, 115.99999999999997d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 100L, 1.0d, (double) 'a', 1889.9999999999973d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(68.0d, 100.0d, 0.0d, (double) (-1));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 100, (double) (-1.0f), (double) 0.0f, 0.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(400.0d, 68.0d, 0.0d, 115.99999999999997d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(980.9999999999993d, 6700.0d, 221.99999999999994d, (double) (short) 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1.0f, (double) 0, (double) (byte) 1, (double) (short) 10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10.0f, 68.0d, 0.0d, (double) (short) 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(111.99999999999952d, (double) (-1), 108.0d, 120.99999999999999d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(7065.999999999998d, 10.0d, (double) 10L, 100.0d);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1.0f, Double.POSITIVE_INFINITY, 193.99999999999886d, 6700.0d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10.0f, (double) (byte) 1, (double) 100.0f, 7003.999999999998d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 10, (double) (-1), (double) 'a', (double) 'a');
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (-1L), (double) 1L, (double) 0, (double) (byte) -1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(514.0d, 0.0d, (double) 10.0f, 115.99999999999997d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 10, (double) (-1.0f), (double) (-1L), 10.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(108.0d, 0.0d, (double) (-1L), 1.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((-1.0d), (double) (short) 100, (double) (short) 10, (double) (byte) -1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(111.99999999999952d, 86.99999999999943d, (double) 0.0f, 514.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 0, Double.POSITIVE_INFINITY, (double) (short) 10, 50.99999999999983d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(44.0d, 3467.9999999999995d, 980.9999999999993d, 184.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(2.0d, 193.99999999999886d, 52.999999999999844d, 0.0d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(221.99999999999994d, 7065.999999999998d, 514.0d, 108.0d);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10L, 1.0d, 0.0d, (double) 100);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 1, 236.0d, (double) 1.0f, (double) (short) -1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(238.0d, 3467.9999999999995d, (double) (byte) 1, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 1, 0.0d, (double) (short) 10, 3499.9999999999995d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) (byte) 100, (double) (short) 10, (double) (byte) 100, 400.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 10, Double.POSITIVE_INFINITY, 1889.9999999999973d, 0.0d);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(52.999999999999844d, 184.0d, 514.0d, (double) (byte) 10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((double) 0.0f, (double) (-1.0f), (double) (short) 10, (double) '4');
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet polygonsSet4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(0.0d, 193.99999999999886d, 3499.9999999999995d, (double) 100.0f);
    }
}

