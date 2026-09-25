package org.apache.commons.math.stat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue(1L);
        frequency0.addValue((long) (byte) -1);
        long long6 = frequency0.getCount((-1L));
        double double8 = frequency0.getCumPct((long) (short) 100);
        long long10 = frequency0.getCumFreq(0L);
        long long12 = frequency0.getCount((int) (byte) 100);
        java.lang.String str13 = frequency0.toString();
        double double15 = frequency0.getPct(10);
        frequency0.clear();
        frequency0.addValue('4');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue(1L);
        frequency0.addValue((long) (byte) -1);
        long long6 = frequency0.getCount((-1L));
        frequency0.clear();
        java.lang.String str8 = frequency0.toString();
        frequency0.addValue('#');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency11.getSumFreq();
        double double14 = frequency11.getCumPct((long) '#');
        double double15 = frequency0.getPct((java.lang.Object) double14);
        long long16 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        frequency17.addValue(1L);
        frequency17.addValue((long) (byte) -1);
        long long23 = frequency17.getCount((-1L));
        java.util.Iterator iterator24 = frequency17.valuesIterator();
        long long26 = frequency17.getCount('a');
        long long28 = frequency17.getCumFreq((long) (short) -1);
        long long30 = frequency17.getCount((long) '#');
        java.util.Iterator iterator31 = frequency17.valuesIterator();
        frequency17.addValue((int) '#');
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        frequency34.addValue(1L);
        frequency34.addValue((long) (byte) -1);
        long long40 = frequency34.getCount((-1L));
        frequency34.clear();
        java.lang.String str42 = frequency34.toString();
        frequency34.addValue('#');
        java.util.Iterator iterator45 = frequency34.valuesIterator();
        long long47 = frequency34.getCumFreq((long) ' ');
        double double49 = frequency34.getCumPct('#');
        frequency34.addValue('#');
        double double52 = frequency17.getCumPct((java.lang.Object) frequency34);
        double double54 = frequency34.getPct((-1));
        frequency34.addValue(' ');
        double double57 = frequency0.getCumPct((java.lang.Object) ' ');
        long long59 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue(1L);
        long long4 = frequency0.getCumFreq((int) (short) -1);
        long long6 = frequency0.getCumFreq('a');
        long long7 = frequency0.getSumFreq();
        long long8 = frequency0.getSumFreq();
        java.lang.String str9 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency10.getSumFreq();
        long long13 = frequency10.getCumFreq((long) (short) -1);
        long long15 = frequency10.getCumFreq(10);
        java.util.Iterator iterator16 = frequency10.valuesIterator();
        long long17 = frequency0.getCount((java.lang.Object) frequency10);
        frequency10.addValue((java.lang.Integer) 0);
        double double21 = frequency10.getCumPct(' ');
        java.lang.String str22 = frequency10.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue(1L);
        frequency0.addValue((long) (byte) -1);
        long long6 = frequency0.getCount('4');
        long long7 = frequency0.getSumFreq();
        double double9 = frequency0.getCumPct((long) (short) 1);
        double double11 = frequency0.getCumPct((java.lang.Object) 10);
        java.util.Iterator iterator12 = frequency0.valuesIterator();
        long long14 = frequency0.getCount((long) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator16 = frequency15.valuesIterator();
        double double18 = frequency15.getCumPct('a');
        long long19 = frequency15.getSumFreq();
        long long21 = frequency15.getCumFreq((long) 0);
        double double22 = frequency0.getPct((java.lang.Object) frequency15);
        frequency0.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount((long) (byte) -1);
        long long5 = frequency0.getCount((int) 'a');
        double double7 = frequency0.getPct((int) (short) 1);
        long long9 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        frequency10.addValue(1L);
        frequency10.addValue((long) (byte) -1);
        long long16 = frequency10.getCount((-1L));
        java.lang.String str17 = frequency10.toString();
        frequency10.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        frequency20.addValue(1L);
        frequency20.addValue((long) (byte) -1);
        long long26 = frequency20.getCount((-1L));
        frequency20.clear();
        java.lang.String str28 = frequency20.toString();
        frequency20.addValue('#');
        java.util.Iterator iterator31 = frequency20.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        frequency32.addValue(1L);
        frequency32.addValue((long) (byte) -1);
        java.lang.String str37 = frequency32.toString();
        double double38 = frequency20.getPct((java.lang.Object) str37);
        double double39 = frequency10.getPct((java.lang.Object) frequency20);
        long long41 = frequency10.getCount('4');
        double double43 = frequency10.getPct((int) (short) 1);
        frequency10.addValue((java.lang.Integer) 10);
        java.lang.String str46 = frequency10.toString();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) frequency10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str37, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.3333333333333333d + "'", double43 == 0.3333333333333333d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t25%\t25%\n1\t1\t25%\t50%\n10\t1\t25%\t75%\n100\t1\t25%\t100%\n" + "'", str46, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t25%\t25%\n1\t1\t25%\t50%\n10\t1\t25%\t75%\n100\t1\t25%\t100%\n");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount((long) (byte) -1);
        long long5 = frequency0.getCount((int) 'a');
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount((long) (byte) -1);
        double double5 = frequency0.getCumPct(' ');
        double double7 = frequency0.getPct((int) (byte) -1);
        java.lang.String str8 = frequency0.toString();
        long long10 = frequency0.getCount(0);
        long long12 = frequency0.getCount('a');
        double double14 = frequency0.getPct((int) (short) 10);
        java.lang.String str15 = frequency0.toString();
        java.lang.String str16 = frequency0.toString();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator1 = frequency0.valuesIterator();
        frequency0.addValue(' ');
        double double5 = frequency0.getCumPct(' ');
        long long7 = frequency0.getCount('a');
        long long9 = frequency0.getCumFreq('a');
        double double11 = frequency0.getPct((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        frequency12.addValue(1L);
        frequency12.addValue((long) (byte) -1);
        frequency12.clear();
        long long18 = frequency0.getCumFreq((java.lang.Object) frequency12);
        long long19 = frequency12.getSumFreq();
        frequency12.clear();
        long long22 = frequency12.getCount('a');
        long long24 = frequency12.getCount('#');
        double double26 = frequency12.getPct(0);
        double double28 = frequency12.getCumPct('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator1 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency2 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator3 = frequency2.valuesIterator();
        double double4 = frequency0.getCumPct((java.lang.Object) frequency2);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCount(100);
        frequency0.clear();
        long long11 = frequency0.getCumFreq(2L);
        long long13 = frequency0.getCount(' ');
        double double15 = frequency0.getCumPct((int) (short) -1);
        long long17 = frequency0.getCumFreq((int) (short) 1);
        java.util.Iterator iterator18 = frequency0.valuesIterator();
        double double20 = frequency0.getCumPct((int) 'a');
        frequency0.addValue((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long1 = frequency0.getSumFreq();
        long long3 = frequency0.getCumFreq((long) (short) -1);
        long long5 = frequency0.getCumFreq(10);
        long long7 = frequency0.getCount('4');
        long long9 = frequency0.getCount(' ');
        frequency0.addValue('a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator1 = frequency0.valuesIterator();
        double double3 = frequency0.getCumPct('a');
        java.lang.String str4 = frequency0.toString();
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCount((long) (short) 100);
        long long9 = frequency0.getCount((int) ' ');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        frequency10.addValue(1L);
        frequency10.addValue((long) (byte) -1);
        long long16 = frequency10.getCount('4');
        long long17 = frequency10.getSumFreq();
        double double19 = frequency10.getCumPct((long) (short) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) frequency10);
        double double22 = frequency10.getPct((int) '4');
        double double24 = frequency10.getPct((int) (short) 1);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str4, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5d + "'", double24 == 0.5d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long1 = frequency0.getSumFreq();
        long long3 = frequency0.getCumFreq((long) (short) -1);
        long long5 = frequency0.getCumFreq(10);
        long long7 = frequency0.getCount('4');
        long long9 = frequency0.getCount((int) ' ');
        double double11 = frequency0.getPct((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator13 = frequency12.valuesIterator();
        frequency12.addValue(' ');
        double double17 = frequency12.getPct((int) 'a');
        frequency12.clear();
        double double20 = frequency12.getPct((-1));
        frequency12.addValue(' ');
        frequency12.clear();
        long long24 = frequency0.getCount((java.lang.Object) frequency12);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue(1L);
        frequency0.addValue((long) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        frequency5.addValue(1L);
        frequency5.addValue((long) (byte) -1);
        double double11 = frequency5.getCumPct('#');
        double double13 = frequency5.getCumPct((java.lang.Object) (-1L));
        frequency5.addValue((java.lang.Integer) 0);
        long long17 = frequency5.getCount((-1L));
        long long19 = frequency5.getCount((long) (short) 0);
        long long20 = frequency0.getCount((java.lang.Object) long19);
        long long22 = frequency0.getCumFreq(' ');
        long long24 = frequency0.getCount('#');
        double double26 = frequency0.getPct((int) (byte) 1);
        double double28 = frequency0.getCumPct('#');
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator iterator30 = frequency29.valuesIterator();
        frequency29.addValue(' ');
        double double34 = frequency29.getPct((int) 'a');
        frequency29.clear();
        double double37 = frequency29.getPct((long) (short) 100);
        long long39 = frequency29.getCount((-1));
        long long41 = frequency29.getCumFreq(100);
        java.util.Iterator iterator42 = frequency29.valuesIterator();
        long long43 = frequency0.getCumFreq((java.lang.Object) iterator42);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.5d + "'", double26 == 0.5d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }
}

