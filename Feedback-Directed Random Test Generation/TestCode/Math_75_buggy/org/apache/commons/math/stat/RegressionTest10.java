package org.apache.commons.math.stat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCumFreq('#');
        double double12 = frequency0.getPct('4');
        long long14 = frequency0.getCumFreq((long) (short) 0);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        java.lang.String str17 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long22 = frequency18.getCount('a');
        long long23 = frequency18.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor24 = frequency18.valuesIterator();
        long long26 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double28 = frequency18.getPct((int) (short) 1);
        double double30 = frequency18.getCumPct((long) 'a');
        double double32 = frequency18.getCumPct((long) 10);
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCount((long) (short) 10);
        double double37 = frequency33.getCumPct((long) (byte) 10);
        frequency33.addValue(0L);
        long long41 = frequency33.getCount((int) (byte) 10);
        boolean boolean42 = frequency18.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        long long45 = frequency43.getCount((-1L));
        long long47 = frequency43.getCumFreq((long) 100);
        long long49 = frequency43.getCumFreq((int) (byte) 10);
        long long50 = frequency18.getCumFreq((java.lang.Object) long49);
        double double52 = frequency18.getPct(10);
        double double53 = frequency0.getCumPct((java.lang.Object) double52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n\t1\t100%\t100%\n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCount((int) (short) -1);
        long long12 = frequency0.getCumFreq((long) (short) -1);
        long long14 = frequency0.getCount(10L);
        long long16 = frequency0.getCount(2L);
        long long18 = frequency0.getCount('a');
        double double20 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq((long) (short) 1);
        double double25 = frequency21.getPct((long) (byte) 100);
        long long27 = frequency21.getCumFreq((long) (short) 1);
        double double29 = frequency21.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((long) (short) 1);
        double double34 = frequency30.getPct((long) (byte) 100);
        frequency30.addValue((-1));
        long long38 = frequency30.getCount(100);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        long long41 = frequency39.getCount((long) (short) 10);
        double double43 = frequency39.getCumPct((long) (byte) 10);
        long long44 = frequency30.getCumFreq((java.lang.Object) double43);
        long long45 = frequency21.getCount((java.lang.Object) double43);
        boolean boolean46 = frequency0.equals((java.lang.Object) double43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        long long10 = frequency0.getCount((long) (short) 1);
        long long12 = frequency0.getCount('a');
        long long14 = frequency0.getCount((long) (byte) 10);
        long long16 = frequency0.getCount((long) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        frequency17.clear();
        double double20 = frequency17.getPct((java.lang.Object) 0L);
        long long22 = frequency17.getCumFreq((long) ' ');
        frequency17.addValue(2L);
        frequency17.clear();
        long long27 = frequency17.getCumFreq('a');
        double double29 = frequency17.getCumPct('a');
        long long30 = frequency0.getCumFreq((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long7 = frequency3.getCount('a');
        long long8 = frequency3.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency3.valuesIterator();
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) long11);
        long long13 = frequency0.getSumFreq();
        long long15 = frequency0.getCumFreq(' ');
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount((long) (short) 10);
        double double21 = frequency17.getCumPct((long) (byte) 10);
        double double23 = frequency17.getCumPct(' ');
        double double25 = frequency17.getPct((int) (byte) 1);
        double double27 = frequency17.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        frequency0.addValue((java.lang.Object) double27);
        long long30 = frequency0.getCumFreq('a');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        frequency31.clear();
        long long34 = frequency31.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency35.getCount('a');
        double double40 = frequency31.getCumPct((java.lang.Object) 'a');
        long long41 = frequency31.getSumFreq();
        frequency31.addValue(2L);
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        long long46 = frequency44.getCumFreq((long) (short) 1);
        frequency44.addValue((int) (short) -1);
        java.lang.String str49 = frequency44.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor50 = frequency44.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        long long53 = frequency51.getCumFreq((long) (short) 1);
        frequency51.addValue('a');
        org.apache.commons.math.stat.Frequency frequency56 = new org.apache.commons.math.stat.Frequency();
        long long58 = frequency56.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long60 = frequency56.getCount('a');
        double double61 = frequency51.getCumPct((java.lang.Object) long60);
        long long62 = frequency51.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency();
        long long65 = frequency63.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long67 = frequency63.getCumFreq((int) '#');
        double double69 = frequency63.getCumPct((java.lang.Object) (short) 0);
        boolean boolean71 = frequency63.equals((java.lang.Object) 100.0d);
        org.apache.commons.math.stat.Frequency frequency72 = new org.apache.commons.math.stat.Frequency();
        long long74 = frequency72.getCount((long) (short) 10);
        double double76 = frequency72.getCumPct((long) (byte) 10);
        frequency72.addValue(0L);
        double double79 = frequency63.getCumPct((java.lang.Object) 0L);
        double double80 = frequency51.getPct((java.lang.Object) double79);
        double double81 = frequency44.getCumPct((java.lang.Object) double79);
        boolean boolean82 = frequency31.equals((java.lang.Object) frequency44);
        // The following exception was thrown during execution in test generation
        try {
            long long83 = frequency0.getCumFreq((java.lang.Object) frequency44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertNotNull(wildcardComparableItor50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency9.valuesIterator();
        long long17 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getPct((int) (short) 1);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency9);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCumFreq((long) 100);
        double double25 = frequency0.getCumPct((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((long) (short) 1);
        double double13 = frequency9.getPct((long) (byte) 100);
        frequency9.addValue((-1));
        long long17 = frequency9.getCount(100);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((long) (short) 10);
        double double22 = frequency18.getCumPct((long) (byte) 10);
        long long23 = frequency9.getCumFreq((java.lang.Object) double22);
        long long24 = frequency0.getCount((java.lang.Object) double22);
        double double26 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        long long4 = frequency0.getCumFreq((long) 'a');
        double double6 = frequency0.getPct((java.lang.Object) true);
        long long8 = frequency0.getCount(0);
        long long10 = frequency0.getCount(0);
        long long12 = frequency0.getCumFreq('a');
        double double14 = frequency0.getPct(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) 100.0d);
        frequency0.addValue((java.lang.Integer) 0);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        double double8 = frequency0.getPct((long) (short) 1);
        frequency0.addValue((int) '4');
        double double12 = frequency0.getPct((java.lang.Object) '#');
        long long14 = frequency0.getCount(100L);
        frequency0.addValue((java.lang.Integer) 0);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq((long) (short) 1);
        frequency17.addValue('a');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency22.getCount('a');
        double double27 = frequency17.getCumPct((java.lang.Object) long26);
        long long29 = frequency17.getCount('#');
        double double31 = frequency17.getCumPct('#');
        long long33 = frequency17.getCumFreq('#');
        java.lang.String str34 = frequency17.toString();
        double double36 = frequency17.getCumPct('#');
        long long38 = frequency17.getCumFreq('a');
        boolean boolean39 = frequency0.equals((java.lang.Object) 'a');
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str34, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCumFreq((long) (byte) -1);
        long long10 = frequency0.getCumFreq('a');
        boolean boolean12 = frequency0.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long17 = frequency13.getCount('a');
        long long18 = frequency13.getSumFreq();
        frequency13.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency13.valuesIterator();
        java.lang.String str22 = frequency13.toString();
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency13);
        long long25 = frequency13.getCount(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency13.valuesIterator();
        frequency13.addValue(100L);
        frequency13.addValue((int) (byte) 10);
        long long32 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCount((long) (short) 10);
        long long37 = frequency33.getCount(0L);
        double double39 = frequency33.getPct('4');
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((long) (short) 1);
        double double44 = frequency40.getCumPct((int) (short) 100);
        frequency40.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        double double48 = frequency40.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long50 = frequency40.getCumFreq((int) ' ');
        java.lang.String str51 = frequency40.toString();
        long long53 = frequency40.getCount(0);
        long long54 = frequency33.getCount((java.lang.Object) 0);
        java.lang.String str55 = frequency33.toString();
        long long56 = frequency13.getCumFreq((java.lang.Object) str55);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str51, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str55, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct(100);
        double double12 = frequency0.getCumPct('#');
        frequency0.clear();
        long long15 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Integer) 100);
        long long19 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        long long8 = frequency0.getCount(100);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        long long14 = frequency0.getCumFreq((java.lang.Object) double13);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        frequency15.clear();
        frequency15.addValue('#');
        long long20 = frequency15.getCumFreq((int) (short) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency15.valuesIterator();
        double double23 = frequency15.getCumPct((long) '4');
        double double24 = frequency0.getPct((java.lang.Object) double23);
        long long25 = frequency0.getSumFreq();
        frequency0.clear();
        frequency0.addValue('#');
        long long30 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        long long8 = frequency0.getCount(100);
        long long10 = frequency0.getCumFreq((long) (byte) -1);
        double double12 = frequency0.getCumPct((-1));
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((long) (short) 10);
        double double17 = frequency13.getCumPct((long) (byte) 10);
        frequency13.addValue(0L);
        double double21 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency13.addValue((java.lang.Integer) 100);
        long long24 = frequency13.getSumFreq();
        boolean boolean25 = frequency0.equals((java.lang.Object) frequency13);
        double double27 = frequency0.getPct((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) 100.0d);
        frequency0.addValue((java.lang.Integer) 0);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        double double8 = frequency0.getPct((long) (short) 1);
        java.lang.Class<?> wildcardClass9 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct('#');
        long long6 = frequency0.getCumFreq(10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency0.equals((java.lang.Object) frequency7);
        frequency0.clear();
        double double11 = frequency0.getPct('a');
        double double13 = frequency0.getCumPct((int) ' ');
        double double15 = frequency0.getPct((long) (short) 0);
        long long17 = frequency0.getCumFreq(100);
        java.lang.Class<?> wildcardClass18 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCount('a');
        frequency0.addValue((long) 'a');
        long long10 = frequency0.getCumFreq((-1));
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((long) (short) 1);
        frequency11.addValue('a');
        long long17 = frequency11.getCount((int) (short) -1);
        long long19 = frequency11.getCount((long) 1);
        long long21 = frequency11.getCount((int) (short) 0);
        frequency11.addValue('#');
        java.lang.String str24 = frequency11.toString();
        java.lang.String str25 = frequency11.toString();
        long long27 = frequency11.getCumFreq((int) (short) 10);
        double double29 = frequency11.getCumPct((int) (short) -1);
        double double30 = frequency0.getPct((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue((int) (short) -1);
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCount((java.lang.Object) 1.0f);
        double double9 = frequency0.getCumPct((long) '#');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((long) (short) 1);
        frequency10.addValue('a');
        long long16 = frequency10.getCount((int) (short) -1);
        long long18 = frequency10.getCumFreq(' ');
        long long20 = frequency10.getCount((int) (byte) 0);
        double double21 = frequency0.getCumPct((java.lang.Object) long20);
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq((long) (short) 1);
        double double26 = frequency22.getCumPct((int) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long31 = frequency27.getCount('a');
        long long32 = frequency27.getSumFreq();
        frequency27.addValue((java.lang.Integer) 100);
        frequency27.addValue(0);
        java.lang.Object obj37 = null;
        boolean boolean38 = frequency27.equals(obj37);
        double double39 = frequency22.getCumPct((java.lang.Object) boolean38);
        boolean boolean40 = frequency0.equals((java.lang.Object) frequency22);
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor42 = frequency41.valuesIterator();
        long long44 = frequency41.getCount('a');
        double double46 = frequency41.getCumPct(' ');
        double double48 = frequency41.getPct((long) (short) 100);
        frequency41.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor50 = frequency41.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            double double51 = frequency22.getCumPct((java.lang.Object) wildcardComparableItor50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.TreeMap$KeyIterator cannot be cast to class java.lang.Comparable (java.util.TreeMap$KeyIterator and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardComparableItor42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(wildcardComparableItor50);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCount((long) 1);
        long long10 = frequency0.getCount((int) (short) 0);
        frequency0.addValue('#');
        long long13 = frequency0.getSumFreq();
        double double15 = frequency0.getPct('#');
        double double17 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        frequency18.addValue(' ');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq((long) (short) 1);
        double double25 = frequency21.getPct((long) (byte) 100);
        long long27 = frequency21.getCumFreq((long) (short) 1);
        double double29 = frequency21.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        boolean boolean30 = frequency18.equals((java.lang.Object) frequency21);
        frequency21.addValue((java.lang.Object) (-1.0d));
        double double33 = frequency0.getPct((java.lang.Object) (-1.0d));
        long long35 = frequency0.getCumFreq((int) '4');
        long long37 = frequency0.getCumFreq((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        frequency0.addValue('#');
        long long5 = frequency0.getCumFreq((int) '4');
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct((long) (byte) 0);
        double double10 = frequency0.getCumPct(0L);
        frequency0.addValue('a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getPct(0L);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((long) (short) 1);
        double double13 = frequency9.getPct((long) (byte) 100);
        long long15 = frequency9.getCumFreq((long) (short) 1);
        double double17 = frequency9.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq((long) (short) 1);
        double double22 = frequency18.getPct((long) (byte) 100);
        frequency18.addValue((-1));
        long long26 = frequency18.getCount(100);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCount((long) (short) 10);
        double double31 = frequency27.getCumPct((long) (byte) 10);
        long long32 = frequency18.getCumFreq((java.lang.Object) double31);
        long long33 = frequency9.getCount((java.lang.Object) double31);
        java.lang.String str34 = frequency9.toString();
        double double36 = frequency9.getPct('#');
        long long37 = frequency0.getCount((java.lang.Object) double36);
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        long long40 = frequency38.getCumFreq((long) (short) 1);
        double double42 = frequency38.getPct((long) (byte) 100);
        frequency38.addValue((-1));
        double double46 = frequency38.getPct('4');
        java.lang.String str47 = frequency38.toString();
        double double49 = frequency38.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double51 = frequency38.getCumPct(' ');
        long long53 = frequency38.getCumFreq((long) 'a');
        long long54 = frequency0.getCumFreq((java.lang.Object) long53);
        double double56 = frequency0.getPct((int) (short) 1);
        frequency0.addValue((int) (byte) 100);
        long long60 = frequency0.getCount((int) (byte) -1);
        frequency0.addValue(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str34, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        long long5 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long7 = frequency0.getCount((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        long long10 = frequency8.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long12 = frequency8.getCount('a');
        double double14 = frequency8.getPct((long) (short) 10);
        long long16 = frequency8.getCumFreq(' ');
        double double18 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double20 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long21 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency22.getCumFreq((int) '#');
        long long28 = frequency22.getCount((java.lang.Object) Double.NaN);
        long long30 = frequency22.getCumFreq((long) (byte) -1);
        long long32 = frequency22.getCumFreq('a');
        boolean boolean34 = frequency22.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency35.getCount('a');
        long long40 = frequency35.getSumFreq();
        frequency35.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor43 = frequency35.valuesIterator();
        java.lang.String str44 = frequency35.toString();
        boolean boolean45 = frequency22.equals((java.lang.Object) frequency35);
        double double46 = frequency0.getCumPct((java.lang.Object) boolean45);
        long long48 = frequency0.getCumFreq((int) '4');
        long long50 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        long long52 = frequency0.getCumFreq((long) (short) 10);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str44, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCumFreq(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor10 = frequency0.valuesIterator();
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertNotNull(wildcardComparableItor10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        long long7 = frequency0.getCumFreq('4');
        double double9 = frequency0.getCumPct((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        frequency10.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency10.valuesIterator();
        double double14 = frequency10.getCumPct((int) (short) 0);
        double double16 = frequency10.getCumPct((int) (byte) 0);
        long long17 = frequency0.getCount((java.lang.Object) (byte) 0);
        double double19 = frequency0.getPct('#');
        double double21 = frequency0.getPct(' ');
        frequency0.clear();
        long long24 = frequency0.getCumFreq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        double double8 = frequency0.getCumPct(' ');
        double double10 = frequency0.getPct(10);
        double double12 = frequency0.getCumPct((int) (short) 10);
        double double14 = frequency0.getCumPct(2L);
        long long16 = frequency0.getCount('a');
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency0.valuesIterator();
        long long21 = frequency0.getCumFreq(1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        long long4 = frequency0.getCount(0L);
        frequency0.addValue((int) (short) 0);
        double double8 = frequency0.getPct((long) 10);
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((long) (short) -1);
        frequency0.addValue((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct('a');
        double double12 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        long long14 = frequency0.getCumFreq((-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double12 = frequency0.getPct((int) (byte) -1);
        double double14 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount((long) (short) 10);
        double double19 = frequency15.getCumPct((long) (byte) 10);
        double double21 = frequency15.getCumPct((int) (byte) 10);
        long long23 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long25 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        boolean boolean26 = frequency0.equals((java.lang.Object) long25);
        frequency0.addValue('#');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((long) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        double double5 = frequency0.getPct(10);
        double double7 = frequency0.getCumPct((int) (short) 0);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getPct(0L);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        java.lang.String str11 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency12.getCumFreq((int) '#');
        double double18 = frequency12.getCumPct((java.lang.Object) (short) 0);
        boolean boolean20 = frequency12.equals((java.lang.Object) 100.0d);
        double double22 = frequency12.getPct('#');
        long long24 = frequency12.getCount('#');
        frequency12.addValue((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) frequency12);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct((int) (byte) 10);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        frequency9.addValue(0L);
        double double17 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getCumPct((int) (short) 10);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency9);
        long long22 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long24 = frequency9.getCumFreq((long) ' ');
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long29 = frequency25.getCount('a');
        long long30 = frequency25.getSumFreq();
        long long32 = frequency25.getCumFreq('4');
        long long34 = frequency25.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency35.getCumFreq((int) '#');
        double double41 = frequency35.getCumPct((java.lang.Object) (short) 0);
        boolean boolean43 = frequency35.equals((java.lang.Object) 100.0d);
        double double45 = frequency35.getPct((int) (byte) 100);
        long long46 = frequency35.getSumFreq();
        double double48 = frequency35.getCumPct((int) '#');
        long long49 = frequency25.getCumFreq((java.lang.Object) '#');
        long long50 = frequency25.getSumFreq();
        double double51 = frequency9.getPct((java.lang.Object) long50);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        double double3 = frequency0.getPct((java.lang.Object) 0L);
        long long5 = frequency0.getCumFreq((long) ' ');
        frequency0.clear();
        double double8 = frequency0.getCumPct((int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency9.valuesIterator();
        long long17 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getPct((int) (short) 1);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency9);
        long long22 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double24 = frequency9.getPct(' ');
        long long26 = frequency9.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        double double7 = frequency0.getPct((int) '4');
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n2\t1\t33%\t67%\n100\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCumFreq((long) (byte) -1);
        long long10 = frequency0.getCumFreq('#');
        frequency0.addValue(3L);
        long long14 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long7 = frequency0.getCount('#');
        long long9 = frequency0.getCumFreq((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (byte) -1);
        double double6 = frequency0.getCumPct(' ');
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCumFreq(' ');
        frequency0.addValue((java.lang.Integer) 1);
        double double17 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double19 = frequency0.getPct((int) (byte) 0);
        double double21 = frequency0.getCumPct('4');
        java.lang.String str22 = frequency0.toString();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n1\t1\t33%\t67%\n100\t1\t33%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n1\t1\t33%\t67%\n100\t1\t33%\t100%\n");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        long long8 = frequency0.getCount(100);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double12 = frequency0.getPct('4');
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((int) (short) 0);
        frequency0.addValue(1);
        long long20 = frequency0.getCumFreq(10L);
        java.lang.Class<?> wildcardClass21 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor2 = frequency0.valuesIterator();
        long long4 = frequency0.getCount((-1L));
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((long) (short) 10);
        double double9 = frequency5.getCumPct((long) (byte) 10);
        double double11 = frequency5.getCumPct(' ');
        double double13 = frequency5.getPct((int) (byte) 1);
        long long15 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        double double17 = frequency5.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        frequency18.clear();
        frequency18.addValue('#');
        long long23 = frequency18.getCumFreq((int) (short) 0);
        frequency18.clear();
        frequency18.addValue('a');
        long long27 = frequency5.getCount((java.lang.Object) 'a');
        frequency5.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long31 = frequency5.getCumFreq(100);
        long long32 = frequency0.getCount((java.lang.Object) long31);
        double double34 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double36 = frequency0.getPct((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardComparableItor2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        double double10 = frequency0.getPct((int) (byte) 100);
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getCumPct((int) '#');
        long long15 = frequency0.getCount(' ');
        frequency0.addValue((java.lang.Integer) 0);
        long long19 = frequency0.getCount((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        long long7 = frequency0.getCumFreq('4');
        double double9 = frequency0.getCumPct((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        frequency10.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency10.valuesIterator();
        double double14 = frequency10.getCumPct((int) (short) 0);
        double double16 = frequency10.getCumPct((int) (byte) 0);
        long long17 = frequency0.getCount((java.lang.Object) (byte) 0);
        double double19 = frequency0.getPct('#');
        double double21 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq((long) (short) 1);
        frequency22.addValue('a');
        long long28 = frequency22.getCount((int) (short) -1);
        long long30 = frequency22.getCumFreq(' ');
        long long32 = frequency22.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCumFreq((long) (short) 1);
        double double37 = frequency33.getPct((long) (byte) 100);
        frequency33.addValue((-1));
        double double41 = frequency33.getPct('4');
        long long43 = frequency33.getCount((int) (short) 100);
        long long44 = frequency22.getCount((java.lang.Object) long43);
        boolean boolean45 = frequency0.equals((java.lang.Object) frequency22);
        long long47 = frequency0.getCumFreq(1L);
        long long49 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCount((int) (short) -1);
        long long12 = frequency0.getCumFreq((long) (short) -1);
        long long14 = frequency0.getCount(10L);
        long long16 = frequency0.getCount(2L);
        double double18 = frequency0.getCumPct(1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getPct((long) (byte) 1);
        double double10 = frequency0.getCumPct(3L);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long14 = frequency0.getCount((int) (short) 1);
        double double16 = frequency0.getPct((int) 'a');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long21 = frequency17.getCumFreq((int) '#');
        frequency17.addValue((java.lang.Object) 10.0d);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor24 = frequency17.valuesIterator();
        double double26 = frequency17.getCumPct((int) '4');
        frequency17.clear();
        boolean boolean28 = frequency0.equals((java.lang.Object) frequency17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue((int) (short) -1);
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCount((java.lang.Object) 1.0f);
        double double9 = frequency0.getCumPct((long) '#');
        long long11 = frequency0.getCumFreq((int) (byte) 0);
        long long13 = frequency0.getCount((int) (byte) 10);
        double double15 = frequency0.getCumPct((int) (byte) 0);
        double double17 = frequency0.getCumPct(0L);
        long long19 = frequency0.getCumFreq(0);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long24 = frequency20.getCount('a');
        long long25 = frequency20.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency20.valuesIterator();
        long long28 = frequency20.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long29 = frequency20.getSumFreq();
        double double31 = frequency20.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency20.addValue((int) (short) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor34 = frequency20.valuesIterator();
        double double36 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long38 = frequency20.getCount((long) '#');
        frequency0.addValue((java.lang.Object) long38);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(wildcardComparableItor34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount(100);
        long long8 = frequency0.getCumFreq(1L);
        java.lang.String str9 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long14 = frequency10.getCount('a');
        long long15 = frequency10.getSumFreq();
        frequency10.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor18 = frequency10.valuesIterator();
        java.lang.String str19 = frequency10.toString();
        long long21 = frequency10.getCumFreq((int) ' ');
        double double22 = frequency0.getCumPct((java.lang.Object) long21);
        double double24 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long26 = frequency0.getCount(1L);
        double double28 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        long long4 = frequency0.getCount(0L);
        frequency0.addValue((int) (short) 0);
        double double8 = frequency0.getPct(100L);
        long long10 = frequency0.getCumFreq((int) (short) 1);
        frequency0.addValue(100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCumFreq(' ');
        long long14 = frequency0.getSumFreq();
        frequency0.addValue((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (short) 100);
        long long6 = frequency0.getCount((int) (byte) 100);
        long long8 = frequency0.getCumFreq(0);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        frequency9.clear();
        long long17 = frequency9.getCount((long) 0);
        long long19 = frequency9.getCumFreq('a');
        long long21 = frequency9.getCumFreq(0L);
        long long22 = frequency0.getCount((java.lang.Object) 0L);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long7 = frequency3.getCount('a');
        long long8 = frequency3.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency3.valuesIterator();
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) long11);
        frequency0.addValue((int) (short) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency0.valuesIterator();
        frequency0.addValue((-1));
        double double19 = frequency0.getPct((long) (byte) 10);
        frequency0.addValue((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        long long5 = frequency0.getCumFreq((int) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        double double8 = frequency0.getPct('a');
        long long10 = frequency0.getCumFreq('#');
        double double12 = frequency0.getPct(0L);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue((int) (short) -1);
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCount((java.lang.Object) 1.0f);
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        long long10 = frequency8.getCount((long) (short) 10);
        double double12 = frequency8.getCumPct((long) (byte) 10);
        frequency8.addValue(0L);
        boolean boolean16 = frequency8.equals((java.lang.Object) (byte) 1);
        long long17 = frequency0.getCumFreq((java.lang.Object) boolean16);
        double double19 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        long long20 = frequency0.getSumFreq();
        double double22 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        long long24 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCount((java.lang.Object) 10);
        long long10 = frequency0.getCumFreq((long) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency12.getCount('a');
        long long17 = frequency12.getSumFreq();
        frequency12.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor20 = frequency12.valuesIterator();
        java.lang.String str21 = frequency12.toString();
        long long23 = frequency12.getCumFreq((int) ' ');
        long long24 = frequency0.getCumFreq((java.lang.Object) ' ');
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        frequency25.clear();
        frequency25.addValue('#');
        long long30 = frequency25.getCumFreq((int) (short) 0);
        double double32 = frequency25.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCumFreq((long) (short) 1);
        double double37 = frequency33.getPct((long) (byte) 100);
        frequency33.addValue((-1));
        double double41 = frequency33.getPct('4');
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long46 = frequency42.getCount('a');
        long long47 = frequency42.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor48 = frequency42.valuesIterator();
        long long50 = frequency42.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double52 = frequency42.getPct((int) (short) 1);
        boolean boolean53 = frequency33.equals((java.lang.Object) frequency42);
        long long55 = frequency33.getCumFreq((long) (short) 1);
        double double56 = frequency25.getCumPct((java.lang.Object) long55);
        long long57 = frequency0.getCumFreq((java.lang.Object) long55);
        long long59 = frequency0.getCumFreq(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCumFreq('#');
        frequency0.addValue(' ');
        double double14 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((long) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        long long3 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = frequency0.equals((java.lang.Object) 2L);
        frequency0.addValue((int) (byte) 1);
        long long9 = frequency0.getCount((int) (short) 10);
        double double11 = frequency0.getPct((int) (byte) 1);
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        java.lang.String str14 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue((int) (short) -1);
        java.lang.String str5 = frequency0.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount('a');
        long long10 = frequency0.getCount('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        long long13 = frequency0.getCount((int) (byte) 1);
        frequency0.addValue((long) (byte) 0);
        long long17 = frequency0.getCumFreq((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getPct((long) (byte) 1);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((long) (short) 10);
        long long15 = frequency11.getCount(0L);
        frequency11.addValue((int) (short) 0);
        double double19 = frequency11.getCumPct(0);
        double double21 = frequency11.getCumPct('4');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor25 = frequency22.valuesIterator();
        frequency22.addValue((java.lang.Comparable<java.lang.String>) "");
        double double29 = frequency22.getPct((int) '4');
        double double31 = frequency22.getCumPct((-1));
        double double33 = frequency22.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long35 = frequency22.getCount((int) (short) 100);
        frequency11.addValue((java.lang.Object) long35);
        long long38 = frequency11.getCount(' ');
        double double39 = frequency0.getPct((java.lang.Object) long38);
        java.lang.Class<?> wildcardClass40 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.clear();
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.clear();
        long long11 = frequency0.getCount((int) (byte) -1);
        long long13 = frequency0.getCumFreq((long) (short) 100);
        double double15 = frequency0.getPct('a');
        long long16 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        frequency0.addValue((java.lang.Integer) 10);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((-1));
        long long14 = frequency0.getCumFreq((long) 100);
        long long16 = frequency0.getCumFreq('a');
        frequency0.addValue((-1L));
        long long20 = frequency0.getCount((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCount((java.lang.Object) 10);
        long long10 = frequency0.getCumFreq((long) 1);
        long long12 = frequency0.getCumFreq((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long12 = frequency0.getCumFreq((long) (short) 0);
        frequency0.clear();
        long long15 = frequency0.getCumFreq((int) (byte) 0);
        long long17 = frequency0.getCumFreq(' ');
        double double19 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCount((long) 1);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency9.valuesIterator();
        boolean boolean17 = frequency9.equals((java.lang.Object) false);
        double double18 = frequency0.getPct((java.lang.Object) boolean17);
        double double20 = frequency0.getCumPct((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        long long5 = frequency0.getCumFreq(' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        frequency0.clear();
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCount((java.lang.Object) 10);
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double12 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n1\t1\t33%\t67%\n100\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCount((int) (short) 0);
        frequency0.addValue((long) 100);
        long long16 = frequency0.getCount(2L);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long21 = frequency17.getCount('a');
        long long22 = frequency17.getSumFreq();
        frequency17.clear();
        frequency17.addValue((java.lang.Integer) 100);
        frequency17.clear();
        frequency17.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long30 = frequency17.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor31 = frequency17.valuesIterator();
        long long33 = frequency17.getCumFreq((-1));
        frequency0.addValue((java.lang.Object) (-1));
        long long36 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        frequency0.addValue((java.lang.Integer) 10);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((long) (short) 10);
        double double15 = frequency11.getCumPct((long) (byte) 10);
        double double17 = frequency11.getCumPct(' ');
        double double19 = frequency11.getPct((long) 1);
        boolean boolean20 = frequency0.equals((java.lang.Object) double19);
        double double22 = frequency0.getPct('a');
        double double24 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long29 = frequency25.getCumFreq((int) '#');
        double double31 = frequency25.getCumPct((java.lang.Object) (short) 0);
        boolean boolean33 = frequency25.equals((java.lang.Object) 100.0d);
        long long34 = frequency25.getSumFreq();
        long long36 = frequency25.getCumFreq(1);
        double double37 = frequency0.getCumPct((java.lang.Object) long36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.5d + "'", double37 == 0.5d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        frequency0.clear();
        long long9 = frequency0.getCount((int) (byte) 0);
        long long11 = frequency0.getCount((int) (short) 100);
        long long13 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.clear();
        java.lang.String str15 = frequency0.toString();
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.clear();
        long long8 = frequency0.getCumFreq(10);
        frequency0.clear();
        double double11 = frequency0.getCumPct(100L);
        double double13 = frequency0.getCumPct((long) ' ');
        double double15 = frequency0.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        double double10 = frequency0.getPct('#');
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long22 = frequency18.getCount('a');
        long long23 = frequency18.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor24 = frequency18.valuesIterator();
        long long26 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency15.addValue((java.lang.Object) long26);
        long long28 = frequency15.getSumFreq();
        long long30 = frequency15.getCount('a');
        long long32 = frequency15.getCount('4');
        frequency15.addValue((int) (byte) 100);
        double double36 = frequency15.getCumPct((int) (short) -1);
        boolean boolean37 = frequency0.equals((java.lang.Object) double36);
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        long long40 = frequency38.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long42 = frequency38.getCount('a');
        long long43 = frequency38.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor44 = frequency38.valuesIterator();
        long long46 = frequency38.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long48 = frequency38.getCumFreq('#');
        frequency38.addValue(' ');
        long long51 = frequency0.getCount((java.lang.Object) ' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor52 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor52);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct((int) (short) 10);
        double double12 = frequency0.getCumPct((long) (byte) 0);
        double double14 = frequency0.getPct((int) (short) 100);
        long long16 = frequency0.getCount((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long21 = frequency17.getCumFreq((int) '#');
        long long23 = frequency17.getCount((java.lang.Object) Double.NaN);
        long long25 = frequency17.getCumFreq((long) (byte) -1);
        double double27 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double29 = frequency17.getCumPct((-1L));
        double double31 = frequency17.getPct('#');
        long long33 = frequency17.getCumFreq((int) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCount((long) (short) 10);
        double double38 = frequency34.getCumPct((long) (byte) 10);
        frequency34.addValue(0L);
        double double42 = frequency34.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double44 = frequency34.getCumPct((int) (short) 10);
        double double46 = frequency34.getCumPct((long) (byte) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency34.valuesIterator();
        long long48 = frequency34.getSumFreq();
        long long50 = frequency34.getCumFreq((int) 'a');
        long long52 = frequency34.getCount(' ');
        frequency17.addValue((java.lang.Object) long52);
        frequency17.addValue((java.lang.Integer) (-1));
        double double56 = frequency0.getCumPct((java.lang.Object) (-1));
        java.lang.Object obj57 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double58 = frequency0.getPct(obj57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        double double7 = frequency0.getPct((int) '4');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        long long10 = frequency8.getCount((long) (short) 10);
        long long12 = frequency8.getCumFreq((long) 'a');
        boolean boolean13 = frequency0.equals((java.lang.Object) frequency8);
        double double15 = frequency8.getPct('4');
        long long17 = frequency8.getCount((java.lang.Object) '#');
        double double19 = frequency8.getCumPct('4');
        frequency8.addValue((long) ' ');
        frequency8.addValue((int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCumFreq((long) (byte) -1);
        double double10 = frequency0.getPct('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCumFreq((long) (short) 1);
        frequency12.addValue('a');
        long long18 = frequency12.getCount((int) (short) -1);
        long long20 = frequency12.getCount((long) 1);
        long long22 = frequency12.getCount((int) (short) 0);
        frequency12.addValue('#');
        long long26 = frequency12.getCount('4');
        double double27 = frequency0.getPct((java.lang.Object) long26);
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCumFreq((long) (short) 1);
        double double32 = frequency28.getPct((long) (byte) 100);
        long long34 = frequency28.getCumFreq((int) (byte) 0);
        long long36 = frequency28.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        long long38 = frequency28.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        double double39 = frequency0.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((long) (short) 1);
        frequency40.addValue('a');
        long long46 = frequency40.getCount((int) (short) -1);
        long long48 = frequency40.getCumFreq(' ');
        long long50 = frequency40.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        long long53 = frequency51.getCumFreq((long) (short) 1);
        double double55 = frequency51.getPct((long) (byte) 100);
        frequency51.addValue((-1));
        double double59 = frequency51.getPct('4');
        long long61 = frequency51.getCount((int) (short) 100);
        long long62 = frequency40.getCount((java.lang.Object) long61);
        long long64 = frequency40.getCount(0);
        long long65 = frequency40.getSumFreq();
        double double67 = frequency40.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long68 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long70 = frequency0.getCount(0L);
        double double72 = frequency0.getPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct(100);
        double double12 = frequency0.getPct((int) (short) 10);
        frequency0.addValue(10L);
        long long16 = frequency0.getCount('#');
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.clear();
        frequency0.addValue((long) ' ');
        frequency0.clear();
        frequency0.addValue('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCumFreq(' ');
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((long) (short) 1);
        double double15 = frequency11.getPct((long) (byte) 100);
        frequency11.addValue((-1));
        double double19 = frequency11.getPct('4');
        long long21 = frequency11.getCount((int) (short) 100);
        long long22 = frequency0.getCount((java.lang.Object) long21);
        long long24 = frequency0.getCount((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor25 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        long long28 = frequency26.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long30 = frequency26.getCumFreq((int) '#');
        double double32 = frequency26.getCumPct((java.lang.Object) (short) 0);
        long long34 = frequency26.getCumFreq((long) '4');
        long long35 = frequency0.getCumFreq((java.lang.Object) long34);
        long long37 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        frequency0.addValue('#');
        long long5 = frequency0.getCumFreq((int) (short) 0);
        long long7 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor8 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        double double15 = frequency9.getCumPct(' ');
        double double17 = frequency9.getPct((int) (byte) 1);
        double double19 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long20 = frequency9.getSumFreq();
        frequency9.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
        double double24 = frequency9.getPct(' ');
        boolean boolean25 = frequency0.equals((java.lang.Object) double24);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct(100);
        double double12 = frequency0.getCumPct('#');
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        long long14 = frequency0.getCumFreq(strComparable13);
        double double16 = frequency0.getPct((int) 'a');
        frequency0.addValue(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long12 = frequency0.getCumFreq((long) (short) 0);
        frequency0.clear();
        long long15 = frequency0.getCumFreq((int) (byte) 0);
        long long17 = frequency0.getCumFreq((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency9.valuesIterator();
        long long17 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getPct((int) (short) 1);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency9);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount((long) (short) 10);
        double double25 = frequency21.getCumPct((long) (byte) 10);
        frequency21.addValue(0L);
        boolean boolean29 = frequency21.equals((java.lang.Object) (byte) 1);
        long long31 = frequency21.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long33 = frequency21.getCount(100);
        double double34 = frequency9.getPct((java.lang.Object) 100);
        java.lang.String str35 = frequency9.toString();
        long long37 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        long long40 = frequency38.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor41 = frequency38.valuesIterator();
        frequency38.addValue((java.lang.Comparable<java.lang.String>) "");
        double double45 = frequency38.getPct((int) '4');
        frequency38.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long49 = frequency38.getCumFreq(' ');
        long long51 = frequency38.getCount((java.lang.Object) 0.0d);
        frequency9.addValue((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str35, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount(100);
        double double8 = frequency0.getCumPct('4');
        long long10 = frequency0.getCount((int) (short) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long12 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((long) (short) 1);
        frequency13.addValue('a');
        boolean boolean19 = frequency13.equals((java.lang.Object) (short) 100);
        double double21 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        boolean boolean23 = frequency13.equals((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        boolean boolean24 = frequency0.equals((java.lang.Object) frequency13);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCount((long) (short) 10);
        double double29 = frequency25.getCumPct((long) (byte) 10);
        frequency25.addValue(0L);
        boolean boolean33 = frequency25.equals((java.lang.Object) (byte) 1);
        long long35 = frequency25.getCount((int) (byte) 1);
        double double37 = frequency25.getCumPct((long) ' ');
        long long38 = frequency0.getCumFreq((java.lang.Object) double37);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        long long41 = frequency39.getCount((long) (short) 10);
        long long43 = frequency39.getCount(0L);
        long long45 = frequency39.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double47 = frequency39.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        double double48 = frequency0.getCumPct((java.lang.Object) double47);
        java.lang.String str49 = frequency0.toString();
        double double51 = frequency0.getCumPct((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        long long3 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = frequency0.equals((java.lang.Object) 2L);
        frequency0.addValue((int) (byte) 1);
        long long9 = frequency0.getCount((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency0.equals((java.lang.Object) frequency7);
        java.lang.Object obj9 = null;
        double double10 = frequency7.getPct(obj9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        double double10 = frequency0.getPct((long) (byte) 0);
        frequency0.clear();
        frequency0.addValue((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long18 = frequency14.getCount('a');
        double double20 = frequency14.getPct((long) (short) 10);
        long long22 = frequency14.getCumFreq(' ');
        frequency14.addValue('#');
        java.lang.String str25 = frequency14.toString();
        long long26 = frequency0.getCount((java.lang.Object) str25);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        long long8 = frequency0.getCount(100);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        long long14 = frequency0.getCumFreq((java.lang.Object) double13);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        frequency15.clear();
        frequency15.addValue('#');
        long long20 = frequency15.getCumFreq((int) (short) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency15.valuesIterator();
        double double23 = frequency15.getCumPct((long) '4');
        double double24 = frequency0.getPct((java.lang.Object) double23);
        long long25 = frequency0.getSumFreq();
        long long27 = frequency0.getCumFreq(100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long12 = frequency0.getCount('#');
        double double14 = frequency0.getCumPct('#');
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long23 = frequency19.getCount('a');
        long long24 = frequency19.getSumFreq();
        frequency19.addValue((java.lang.Integer) 100);
        frequency19.addValue(0);
        long long30 = frequency19.getCumFreq((long) 1);
        frequency19.addValue((java.lang.Integer) 10);
        double double34 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCumFreq((long) (short) 1);
        frequency35.addValue('a');
        long long41 = frequency35.getCount((int) (short) -1);
        long long43 = frequency35.getCumFreq(' ');
        long long45 = frequency35.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency();
        long long48 = frequency46.getCumFreq((long) (short) 1);
        double double50 = frequency46.getPct((long) (byte) 100);
        frequency46.addValue((-1));
        double double54 = frequency46.getPct('4');
        long long56 = frequency46.getCount((int) (short) 100);
        long long57 = frequency35.getCount((java.lang.Object) long56);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        long long60 = frequency58.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long62 = frequency58.getCumFreq((int) '#');
        frequency58.addValue((java.lang.Object) 10.0d);
        double double66 = frequency58.getCumPct(10);
        double double68 = frequency58.getPct('a');
        double double69 = frequency35.getCumPct((java.lang.Object) 'a');
        boolean boolean70 = frequency19.equals((java.lang.Object) frequency35);
        double double72 = frequency19.getCumPct('a');
        double double74 = frequency19.getCumPct((int) (short) -1);
        double double76 = frequency19.getCumPct((long) ' ');
        long long78 = frequency19.getCount('#');
        double double79 = frequency0.getCumPct((java.lang.Object) '#');
        long long81 = frequency0.getCumFreq((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.6666666666666666d + "'", double76 == 0.6666666666666666d);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getCumPct((int) (byte) 0);
        long long15 = frequency0.getCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct(100);
        double double12 = frequency0.getPct((int) (short) 10);
        double double14 = frequency0.getPct('a');
        long long16 = frequency0.getCumFreq(' ');
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency0.equals((java.lang.Object) frequency7);
        frequency0.clear();
        double double11 = frequency0.getPct('a');
        double double13 = frequency0.getCumPct((int) ' ');
        double double15 = frequency0.getPct((long) (short) 0);
        long long17 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        long long19 = frequency0.getCumFreq((int) (short) 10);
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        frequency0.addValue('#');
        long long5 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency6.getSumFreq();
        long long10 = frequency0.getCount((java.lang.Object) long9);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCumFreq((int) '#');
        double double17 = frequency11.getCumPct((java.lang.Object) (short) 0);
        boolean boolean19 = frequency11.equals((java.lang.Object) 100.0d);
        double double21 = frequency11.getPct((int) (byte) 100);
        long long23 = frequency11.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long25 = frequency11.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        long long26 = frequency11.getSumFreq();
        frequency11.addValue((long) (short) -1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor29 = frequency11.valuesIterator();
        long long31 = frequency11.getCount(1);
        long long32 = frequency0.getCount((java.lang.Object) 1);
        long long34 = frequency0.getCumFreq(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        long long3 = frequency0.getCount((long) (byte) 0);
        frequency0.addValue((int) 'a');
        java.lang.Class<?> wildcardClass6 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        frequency0.addValue('#');
        long long5 = frequency0.getCumFreq((int) '4');
        long long7 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        long long9 = frequency0.getCumFreq((long) '#');
        double double11 = frequency0.getPct(100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        double double12 = frequency0.getCumPct((long) (byte) 1);
        long long14 = frequency0.getCumFreq('a');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(3L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double9 = frequency5.getCumPct('#');
        double double11 = frequency5.getPct('a');
        double double12 = frequency0.getPct((java.lang.Object) 'a');
        double double14 = frequency0.getCumPct(1L);
        long long16 = frequency0.getCount((long) (byte) 0);
        long long18 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        long long10 = frequency0.getCount((long) (short) 1);
        double double12 = frequency0.getPct((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long7 = frequency3.getCount('a');
        long long8 = frequency3.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency3.valuesIterator();
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) long11);
        long long14 = frequency0.getCount('a');
        long long16 = frequency0.getCount((long) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq((long) (short) 1);
        double double21 = frequency17.getPct((long) (byte) 100);
        frequency17.addValue((-1));
        double double25 = frequency17.getPct('4');
        java.lang.String str26 = frequency17.toString();
        double double28 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        long long31 = frequency29.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long33 = frequency29.getCumFreq((int) '#');
        double double35 = frequency29.getCumPct((java.lang.Object) (short) 0);
        boolean boolean37 = frequency29.equals((java.lang.Object) 100.0d);
        double double39 = frequency29.getPct((int) (byte) 100);
        long long40 = frequency29.getSumFreq();
        double double42 = frequency29.getCumPct((int) '#');
        long long43 = frequency17.getCount((java.lang.Object) '#');
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        long long46 = frequency44.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long48 = frequency44.getCount('a');
        long long49 = frequency44.getSumFreq();
        long long51 = frequency44.getCumFreq('4');
        double double52 = frequency17.getPct((java.lang.Object) '4');
        long long54 = frequency17.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        long long56 = frequency17.getCumFreq((long) 1);
        double double58 = frequency17.getCumPct((int) (byte) -1);
        double double59 = frequency0.getPct((java.lang.Object) double58);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        long long4 = frequency0.getCount(0L);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCount(' ');
        double double11 = frequency0.getCumPct(0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long12 = frequency0.getCount('#');
        double double14 = frequency0.getCumPct('#');
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue('4');
        long long20 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nfalse\t1\t100%\t100%\n");
        long long22 = frequency0.getCount('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long6 = frequency0.getCumFreq((int) (short) -1);
        long long7 = frequency0.getSumFreq();
        java.lang.String str8 = frequency0.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long12 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((long) (short) 1);
        frequency13.addValue('a');
        boolean boolean19 = frequency13.equals((java.lang.Object) (short) 100);
        double double21 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        boolean boolean23 = frequency13.equals((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        boolean boolean24 = frequency0.equals((java.lang.Object) frequency13);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCount((long) (short) 10);
        double double29 = frequency25.getCumPct((long) (byte) 10);
        frequency25.addValue(0L);
        boolean boolean33 = frequency25.equals((java.lang.Object) (byte) 1);
        long long35 = frequency25.getCount((int) (byte) 1);
        double double37 = frequency25.getCumPct((long) ' ');
        long long38 = frequency0.getCumFreq((java.lang.Object) double37);
        long long40 = frequency0.getCumFreq(100);
        double double42 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long12 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((long) (short) 1);
        frequency13.addValue('a');
        boolean boolean19 = frequency13.equals((java.lang.Object) (short) 100);
        double double21 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        boolean boolean23 = frequency13.equals((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        boolean boolean24 = frequency0.equals((java.lang.Object) frequency13);
        frequency0.clear();
        double double27 = frequency0.getPct('#');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor29 = frequency28.valuesIterator();
        long long31 = frequency28.getCumFreq((int) '#');
        double double33 = frequency28.getCumPct('#');
        boolean boolean34 = frequency0.equals((java.lang.Object) frequency28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardComparableItor29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        double double7 = frequency0.getPct((int) '4');
        double double9 = frequency0.getCumPct((-1));
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency10.valuesIterator();
        frequency10.addValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = frequency10.getClass();
        boolean boolean17 = frequency0.equals((java.lang.Object) frequency10);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long22 = frequency18.getCount('a');
        long long23 = frequency18.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor24 = frequency18.valuesIterator();
        boolean boolean26 = frequency18.equals((java.lang.Object) false);
        long long28 = frequency18.getCount((long) (short) 1);
        frequency18.addValue(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor31 = frequency18.valuesIterator();
        boolean boolean32 = frequency0.equals((java.lang.Object) frequency18);
        double double34 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor35 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor35);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        double double5 = frequency0.getPct(10);
        long long7 = frequency0.getCumFreq((long) (-1));
        double double9 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor10 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCumFreq((int) '#');
        frequency11.addValue((java.lang.Object) 10.0d);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor18 = frequency11.valuesIterator();
        long long20 = frequency11.getCount((long) (short) -1);
        boolean boolean21 = frequency0.equals((java.lang.Object) frequency11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCount((int) (short) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        long long15 = frequency0.getCount('a');
        java.lang.String str16 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((long) (short) 1);
        double double13 = frequency9.getPct((long) (byte) 100);
        double double14 = frequency0.getCumPct((java.lang.Object) (byte) 100);
        double double16 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        frequency0.addValue((long) 0);
        double double20 = frequency0.getPct(10);
        frequency0.addValue(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (byte) -1);
        frequency0.clear();
        frequency0.clear();
        frequency0.clear();
        double double9 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((long) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        frequency10.addValue((java.lang.Comparable<java.lang.String>) "");
        long long18 = frequency10.getCount(0);
        java.lang.String str19 = frequency10.toString();
        double double21 = frequency10.getCumPct('4');
        double double22 = frequency0.getCumPct((java.lang.Object) double21);
        long long24 = frequency0.getCount((long) (short) 10);
        double double26 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency0.equals((java.lang.Object) frequency7);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((long) (short) 1);
        double double13 = frequency9.getPct((long) (byte) 100);
        java.lang.String str14 = frequency9.toString();
        frequency7.addValue((java.lang.Object) str14);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long23 = frequency19.getCount('a');
        long long24 = frequency19.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor25 = frequency19.valuesIterator();
        long long27 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency16.addValue((java.lang.Object) long27);
        double double30 = frequency16.getCumPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long35 = frequency31.getCount('a');
        long long36 = frequency31.getSumFreq();
        long long38 = frequency31.getCumFreq('4');
        long long40 = frequency31.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long41 = frequency16.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency16.addValue((long) 'a');
        double double45 = frequency16.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            frequency7.addValue((java.lang.Object) double45);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct((int) (byte) 10);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        frequency0.addValue(' ');
        double double14 = frequency0.getPct('a');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long19 = frequency15.getCount('a');
        long long20 = frequency15.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency15.valuesIterator();
        long long23 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double25 = frequency15.getCumPct(100);
        double double27 = frequency15.getPct((int) (short) 10);
        frequency15.addValue(10L);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long34 = frequency30.getCumFreq((int) '#');
        double double36 = frequency30.getCumPct((java.lang.Object) (short) 0);
        long long38 = frequency30.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency15.getCumFreq((java.lang.Object) "hi!");
        long long41 = frequency15.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double43 = frequency15.getCumPct(100);
        long long44 = frequency0.getCumFreq((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency2 = new org.apache.commons.math.stat.Frequency();
        long long4 = frequency2.getCumFreq((long) (short) 1);
        frequency2.addValue('a');
        long long8 = frequency2.getCount((int) (short) -1);
        long long10 = frequency2.getCumFreq(' ');
        long long12 = frequency2.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency2.getCumPct((int) (byte) 100);
        double double15 = frequency0.getCumPct((java.lang.Object) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCount((long) (short) 10);
        double double20 = frequency16.getCumPct((long) (byte) 10);
        double double21 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        double double23 = frequency0.getCumPct('#');
        long long24 = frequency0.getSumFreq();
        long long26 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        double double28 = frequency0.getPct(strComparable27);
        double double30 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct((int) (byte) 10);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        double double12 = frequency0.getCumPct('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct(' ');
        double double8 = frequency0.getPct((int) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((long) (short) 1);
        frequency9.addValue('a');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long18 = frequency14.getCount('a');
        double double19 = frequency9.getCumPct((java.lang.Object) long18);
        long long20 = frequency9.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long25 = frequency21.getCumFreq((int) '#');
        double double27 = frequency21.getCumPct((java.lang.Object) (short) 0);
        boolean boolean29 = frequency21.equals((java.lang.Object) 100.0d);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCount((long) (short) 10);
        double double34 = frequency30.getCumPct((long) (byte) 10);
        frequency30.addValue(0L);
        double double37 = frequency21.getCumPct((java.lang.Object) 0L);
        double double38 = frequency9.getPct((java.lang.Object) double37);
        double double40 = frequency9.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double41 = frequency0.getCumPct((java.lang.Object) double40);
        long long43 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long45 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long47 = frequency0.getCount('#');
        long long49 = frequency0.getCount('#');
        long long51 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (byte) -1);
        frequency0.clear();
        java.lang.String str6 = frequency0.toString();
        long long8 = frequency0.getCumFreq((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        long long8 = frequency0.getCount(0);
        long long10 = frequency0.getCount((java.lang.Object) 3L);
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor8 = frequency0.valuesIterator();
        long long10 = frequency0.getCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct(' ');
        double double8 = frequency0.getPct((int) (byte) 1);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        long long11 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct('a');
        double double12 = frequency0.getCumPct(' ');
        frequency0.clear();
        long long15 = frequency0.getCount((long) ' ');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency16.valuesIterator();
        frequency16.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency16.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor23 = frequency16.valuesIterator();
        long long25 = frequency16.getCount('a');
        long long27 = frequency16.getCount('4');
        java.lang.String str28 = frequency16.toString();
        long long30 = frequency16.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        boolean boolean31 = frequency0.equals((java.lang.Object) frequency16);
        long long33 = frequency16.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertNotNull(wildcardComparableItor23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCumFreq((long) (byte) -1);
        long long10 = frequency0.getCumFreq('a');
        boolean boolean12 = frequency0.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long17 = frequency13.getCount('a');
        long long18 = frequency13.getSumFreq();
        frequency13.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency13.valuesIterator();
        java.lang.String str22 = frequency13.toString();
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency13);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        long long26 = frequency24.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long28 = frequency24.getCumFreq((int) '#');
        double double30 = frequency24.getCumPct((java.lang.Object) (short) 0);
        long long32 = frequency24.getCumFreq((long) '4');
        long long34 = frequency24.getCount(0L);
        frequency13.addValue((java.lang.Object) 0L);
        long long37 = frequency13.getCount((long) (byte) 0);
        double double39 = frequency13.getPct((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        long long3 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long5 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nNaN\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        double double7 = frequency0.getPct((int) '4');
        double double9 = frequency0.getCumPct((-1));
        long long11 = frequency0.getCount((int) ' ');
        long long13 = frequency0.getCumFreq(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        frequency9.addValue(0L);
        double double16 = frequency0.getCumPct((java.lang.Object) 0L);
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Integer) 0);
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        double double5 = frequency0.getCumPct(' ');
        long long7 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency0.getCount((int) '4');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCount((long) (short) 10);
        long long14 = frequency10.getCumFreq((long) 'a');
        double double16 = frequency10.getPct((java.lang.Object) true);
        long long17 = frequency0.getCount((java.lang.Object) double16);
        double double19 = frequency0.getPct((int) (byte) 0);
        double double21 = frequency0.getPct('#');
        frequency0.clear();
        double double24 = frequency0.getPct((long) 0);
        long long26 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        java.lang.Class<?> wildcardClass27 = frequency0.getClass();
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency0.equals((java.lang.Object) frequency7);
        frequency0.clear();
        double double11 = frequency0.getPct('a');
        double double13 = frequency0.getCumPct((int) ' ');
        double double15 = frequency0.getPct((long) (short) 0);
        long long17 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((long) (short) 10);
        double double22 = frequency18.getCumPct((long) (byte) 10);
        frequency18.addValue(0L);
        double double26 = frequency18.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double28 = frequency18.getCumPct('a');
        long long30 = frequency18.getCount((int) (short) 0);
        long long31 = frequency0.getCumFreq((java.lang.Object) (short) 0);
        double double33 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long38 = frequency34.getCumFreq((int) '#');
        double double40 = frequency34.getCumPct((java.lang.Object) (short) 0);
        long long42 = frequency34.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency34.addValue((java.lang.Comparable<java.lang.String>) "");
        long long46 = frequency34.getCumFreq((long) (short) 0);
        double double47 = frequency0.getCumPct((java.lang.Object) long46);
        frequency0.addValue((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        long long4 = frequency0.getCumFreq((long) 100);
        java.lang.String str5 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCount((long) (short) 10);
        double double10 = frequency6.getCumPct((long) (byte) 10);
        double double12 = frequency6.getCumPct((int) (byte) 10);
        long long14 = frequency6.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount((long) (short) 10);
        double double19 = frequency15.getCumPct((long) (byte) 10);
        frequency15.addValue(0L);
        double double23 = frequency15.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double25 = frequency15.getCumPct((int) (short) 10);
        boolean boolean26 = frequency6.equals((java.lang.Object) frequency15);
        frequency15.addValue((java.lang.Integer) (-1));
        frequency15.addValue((java.lang.Integer) (-1));
        boolean boolean31 = frequency0.equals((java.lang.Object) (-1));
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        long long34 = frequency32.getCumFreq((long) (short) 1);
        double double36 = frequency32.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        long long37 = frequency32.getSumFreq();
        frequency32.addValue(10L);
        boolean boolean40 = frequency0.equals((java.lang.Object) frequency32);
        double double42 = frequency32.getPct(0L);
        double double44 = frequency32.getPct((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        long long8 = frequency0.getCount(100);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double12 = frequency0.getPct('4');
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((int) (short) 0);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq((long) (short) 1);
        frequency17.addValue('a');
        long long23 = frequency17.getCount((int) (short) -1);
        long long25 = frequency17.getCount((long) 1);
        long long27 = frequency17.getCount((int) (short) 0);
        frequency17.addValue('#');
        long long31 = frequency17.getCount('4');
        long long33 = frequency17.getCount((int) (short) 0);
        long long34 = frequency0.getCount((java.lang.Object) long33);
        double double36 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n1\t1\t33%\t67%\n100\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct((int) (short) 10);
        double double12 = frequency0.getCumPct((long) (byte) 0);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        long long16 = frequency0.getCumFreq(10);
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        frequency0.addValue('#');
        long long5 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency6.getSumFreq();
        long long10 = frequency0.getCount((java.lang.Object) long9);
        double double12 = frequency0.getPct(0);
        long long14 = frequency0.getCount((int) ' ');
        long long16 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCount((long) 1);
        long long10 = frequency0.getCount((int) (short) 0);
        frequency0.addValue('#');
        long long14 = frequency0.getCount('4');
        long long16 = frequency0.getCount((int) (short) 0);
        long long18 = frequency0.getCount((int) (short) 100);
        double double20 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long22 = frequency0.getCumFreq((int) (short) 1);
        double double24 = frequency0.getPct('#');
        double double26 = frequency0.getCumPct(' ');
        double double28 = frequency0.getCumPct((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5d + "'", double24 == 0.5d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double12 = frequency0.getPct((int) (byte) -1);
        double double14 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount((long) (short) 10);
        double double19 = frequency15.getCumPct((long) (byte) 10);
        double double21 = frequency15.getCumPct((int) (byte) 10);
        long long23 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long25 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        boolean boolean26 = frequency0.equals((java.lang.Object) long25);
        double double28 = frequency0.getCumPct('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCumFreq(' ');
        frequency0.addValue((java.lang.Integer) 1);
        double double17 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double19 = frequency0.getPct((int) (byte) 0);
        long long20 = frequency0.getSumFreq();
        double double22 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCumFreq(' ');
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double12 = frequency0.getCumPct((int) (byte) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        long long15 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCumFreq((long) '4');
        long long10 = frequency0.getCount(0L);
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        double double14 = frequency0.getPct(100);
        double double16 = frequency0.getCumPct('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCount((long) 1);
        long long10 = frequency0.getCount((int) (short) 0);
        frequency0.addValue('#');
        long long14 = frequency0.getCount('4');
        long long16 = frequency0.getCount((int) (short) 0);
        long long18 = frequency0.getCount((int) (short) 100);
        double double20 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long22 = frequency0.getCumFreq((int) (short) 1);
        double double24 = frequency0.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5d + "'", double24 == 0.5d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCumFreq(' ');
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((long) (short) 1);
        double double15 = frequency11.getPct((long) (byte) 100);
        frequency11.addValue((-1));
        double double19 = frequency11.getPct('4');
        long long21 = frequency11.getCount((int) (short) 100);
        long long22 = frequency0.getCount((java.lang.Object) long21);
        long long24 = frequency0.getCount((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor25 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        long long28 = frequency26.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long30 = frequency26.getCumFreq((int) '#');
        double double32 = frequency26.getCumPct((java.lang.Object) (short) 0);
        long long34 = frequency26.getCumFreq((long) '4');
        long long35 = frequency0.getCumFreq((java.lang.Object) long34);
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        long long38 = frequency36.getCount((-1L));
        double double40 = frequency36.getCumPct('4');
        double double42 = frequency36.getCumPct('a');
        long long43 = frequency0.getCount((java.lang.Object) 'a');
        long long45 = frequency0.getCount((int) (byte) 0);
        long long46 = frequency0.getSumFreq();
        java.lang.Object obj47 = null;
        boolean boolean48 = frequency0.equals(obj47);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCumFreq((long) (byte) -1);
        long long10 = frequency0.getCumFreq('a');
        boolean boolean12 = frequency0.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long17 = frequency13.getCount('a');
        long long18 = frequency13.getSumFreq();
        frequency13.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency13.valuesIterator();
        java.lang.String str22 = frequency13.toString();
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency13);
        long long25 = frequency13.getCount(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency13.valuesIterator();
        long long28 = frequency13.getCount(' ');
        long long30 = frequency13.getCumFreq((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct((int) (short) 10);
        double double12 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = frequency0.toString();
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        double double8 = frequency0.getCumPct((int) (short) 0);
        double double10 = frequency0.getCumPct('4');
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        long long14 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        long long4 = frequency0.getCumFreq((long) 'a');
        double double6 = frequency0.getPct((java.lang.Object) true);
        long long8 = frequency0.getCount(0);
        long long10 = frequency0.getCount(0);
        long long12 = frequency0.getCumFreq('a');
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = frequency0.getCount(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        long long4 = frequency0.getCumFreq((long) 'a');
        long long5 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        frequency6.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor8 = frequency6.valuesIterator();
        double double10 = frequency6.getCumPct((int) (short) 0);
        double double12 = frequency6.getPct('#');
        double double13 = frequency0.getPct((java.lang.Object) '#');
        frequency0.addValue('#');
        long long17 = frequency0.getCount((long) 0);
        long long19 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        double double21 = frequency0.getCumPct((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getCumPct((long) (byte) -1);
        long long15 = frequency0.getCount((int) '4');
        long long17 = frequency0.getCumFreq((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long22 = frequency18.getCount('a');
        long long23 = frequency18.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor24 = frequency18.valuesIterator();
        boolean boolean26 = frequency18.equals((java.lang.Object) false);
        long long28 = frequency18.getCount((long) (short) 1);
        frequency18.addValue(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor31 = frequency18.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        long long34 = frequency32.getCumFreq((long) (short) 1);
        double double36 = frequency32.getPct((long) (byte) 100);
        frequency32.addValue((-1));
        double double40 = frequency32.getPct('4');
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long43 = frequency41.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long45 = frequency41.getCount('a');
        long long46 = frequency41.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency41.valuesIterator();
        long long49 = frequency41.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double51 = frequency41.getPct((int) (short) 1);
        boolean boolean52 = frequency32.equals((java.lang.Object) frequency41);
        long long54 = frequency41.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double55 = frequency18.getCumPct((java.lang.Object) "hi!");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor56 = frequency18.valuesIterator();
        java.lang.String str57 = frequency18.toString();
        boolean boolean58 = frequency0.equals((java.lang.Object) frequency18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n" + "'", str57, "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue(0);
        double double8 = frequency0.getCumPct((long) (byte) 100);
        long long10 = frequency0.getCumFreq((int) (short) -1);
        frequency0.addValue((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        double double6 = frequency0.getCumPct((long) (-1));
        long long8 = frequency0.getCumFreq((long) 10);
        frequency0.clear();
        double double11 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long7 = frequency0.getCumFreq((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        long long10 = frequency8.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long12 = frequency8.getCumFreq((int) '#');
        long long14 = frequency8.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        boolean boolean16 = frequency8.equals((java.lang.Object) frequency15);
        frequency8.clear();
        double double19 = frequency8.getPct('a');
        double double20 = frequency0.getCumPct((java.lang.Object) double19);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency0.valuesIterator();
        long long23 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double12 = frequency0.getPct((int) (byte) 10);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double16 = frequency0.getCumPct((int) (byte) 0);
        long long18 = frequency0.getCount((int) (byte) 1);
        long long20 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        frequency0.clear();
        double double23 = frequency0.getCumPct((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCumFreq((long) (byte) -1);
        long long10 = frequency0.getCount('#');
        long long12 = frequency0.getCount(0);
        long long14 = frequency0.getCumFreq((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        long long5 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long7 = frequency0.getCount((long) (byte) 1);
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCount((long) (short) 10);
        double double14 = frequency10.getCumPct((long) (byte) 10);
        long long15 = frequency10.getSumFreq();
        double double17 = frequency10.getPct(' ');
        frequency0.addValue((java.lang.Object) double17);
        double double20 = frequency0.getCumPct((long) 10);
        double double22 = frequency0.getCumPct('a');
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        double double6 = frequency0.getPct((long) (short) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        double double9 = frequency0.getPct(' ');
        long long11 = frequency0.getCount((int) (short) 100);
        frequency0.clear();
        double double14 = frequency0.getCumPct('a');
        long long16 = frequency0.getCumFreq((long) (byte) 0);
        double double18 = frequency0.getPct((long) 100);
        double double20 = frequency0.getPct((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        long long8 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        frequency9.addValue(0L);
        double double17 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getCumPct('a');
        long long21 = frequency9.getCount((int) (short) 0);
        frequency9.addValue((long) 100);
        boolean boolean24 = frequency0.equals((java.lang.Object) frequency9);
        frequency0.clear();
        long long27 = frequency0.getCount(' ');
        long long29 = frequency0.getCount((int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double12 = frequency0.getPct((int) (byte) 10);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double16 = frequency0.getCumPct((int) (byte) 0);
        long long18 = frequency0.getCumFreq(0);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq((long) (short) 1);
        double double23 = frequency19.getPct((long) (byte) 100);
        frequency19.addValue((java.lang.Comparable<java.lang.String>) "");
        double double27 = frequency19.getPct((long) 100);
        long long28 = frequency19.getSumFreq();
        long long30 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double31 = frequency0.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        long long34 = frequency32.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long36 = frequency32.getCount('a');
        long long37 = frequency32.getSumFreq();
        frequency32.clear();
        long long40 = frequency32.getCumFreq(10);
        long long42 = frequency32.getCumFreq((int) (byte) 100);
        double double43 = frequency0.getPct((java.lang.Object) (byte) 100);
        long long45 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long47 = frequency0.getCumFreq((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2L + "'", long45 == 2L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor8 = frequency0.valuesIterator();
        java.lang.String str9 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long14 = frequency10.getCumFreq((int) '#');
        double double16 = frequency10.getCumPct((java.lang.Object) (short) 0);
        boolean boolean18 = frequency10.equals((java.lang.Object) 100.0d);
        boolean boolean19 = frequency0.equals((java.lang.Object) boolean18);
        long long20 = frequency0.getSumFreq();
        long long22 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double12 = frequency0.getPct((int) (byte) -1);
        double double14 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount((long) (short) 10);
        double double19 = frequency15.getCumPct((long) (byte) 10);
        double double21 = frequency15.getCumPct((int) (byte) 10);
        long long23 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long25 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        boolean boolean26 = frequency0.equals((java.lang.Object) long25);
        long long28 = frequency0.getCount(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        double double10 = frequency0.getPct('#');
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t67%\t67%\n100\t1\t33%\t100%\n");
        double double14 = frequency0.getCumPct((int) 'a');
        frequency0.addValue((int) (short) 100);
        long long18 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCount((int) (short) 0);
        frequency0.addValue((long) 100);
        long long16 = frequency0.getCount(2L);
        long long17 = frequency0.getSumFreq();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue((long) (byte) 10);
        long long8 = frequency0.getCount(100L);
        long long10 = frequency0.getCumFreq((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCount('a');
        long long16 = frequency11.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor17 = frequency11.valuesIterator();
        long long19 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double21 = frequency11.getCumPct(100);
        double double23 = frequency11.getCumPct('#');
        long long24 = frequency0.getCount((java.lang.Object) double23);
        long long26 = frequency0.getCumFreq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long12 = frequency0.getCount(' ');
        long long14 = frequency0.getCount((-1));
        long long16 = frequency0.getCount((long) (byte) 1);
        double double18 = frequency0.getCumPct((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getCumPct((long) (byte) -1);
        long long15 = frequency0.getCount((int) '4');
        frequency0.addValue((java.lang.Integer) 0);
        long long19 = frequency0.getCount((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.clear();
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.clear();
        double double11 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double13 = frequency0.getPct((int) (byte) 0);
        long long15 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct(0L);
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct('#');
        long long6 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq((long) (short) 1);
        double double11 = frequency7.getPct((long) (byte) 100);
        frequency7.addValue((-1));
        long long15 = frequency7.getCount(100);
        long long17 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency7.addValue(0);
        java.lang.String str20 = frequency7.toString();
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long25 = frequency21.getCumFreq((int) '#');
        double double27 = frequency21.getCumPct((java.lang.Object) (short) 0);
        long long29 = frequency21.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        double double31 = frequency21.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
        long long33 = frequency21.getCumFreq(' ');
        frequency21.addValue(0L);
        boolean boolean36 = frequency7.equals((java.lang.Object) 0L);
        java.lang.String str37 = frequency7.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double38 = frequency0.getPct((java.lang.Object) frequency7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n" + "'", str37, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        long long8 = frequency0.getCount(100);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double12 = frequency0.getPct(100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct((long) (byte) 1);
        long long12 = frequency0.getCount(' ');
        long long14 = frequency0.getCumFreq('a');
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        long long18 = frequency0.getCumFreq((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        double double5 = frequency0.getCumPct(' ');
        double double7 = frequency0.getPct((long) (short) 100);
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        java.lang.Class<?> wildcardClass10 = frequency0.getClass();
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        double double5 = frequency0.getCumPct(' ');
        long long7 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency0.getCount((int) '4');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCount((long) (short) 10);
        long long14 = frequency10.getCumFreq((long) 'a');
        double double16 = frequency10.getPct((java.lang.Object) true);
        long long17 = frequency0.getCount((java.lang.Object) double16);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long22 = frequency18.getCount('a');
        long long24 = frequency18.getCount(0);
        frequency18.addValue((long) 1);
        double double27 = frequency0.getCumPct((java.lang.Object) 1);
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCumFreq((long) (short) 1);
        frequency28.addValue((int) (short) -1);
        java.lang.String str33 = frequency28.toString();
        double double35 = frequency28.getPct(100);
        long long37 = frequency28.getCount(10L);
        long long39 = frequency28.getCount((int) '4');
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCount((-1L));
        double double44 = frequency40.getCumPct('4');
        double double46 = frequency40.getCumPct('a');
        double double47 = frequency28.getCumPct((java.lang.Object) 'a');
        frequency28.clear();
        long long50 = frequency28.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        double double52 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency28.addValue(1);
        boolean boolean55 = frequency0.equals((java.lang.Object) frequency28);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        long long4 = frequency0.getCumFreq((long) 'a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        frequency5.clear();
        frequency5.addValue('#');
        long long10 = frequency5.getCumFreq((int) (short) 0);
        frequency5.clear();
        double double13 = frequency5.getCumPct((long) 0);
        frequency5.addValue((int) (byte) 1);
        double double17 = frequency5.getPct('#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long22 = frequency18.getCount('a');
        double double24 = frequency18.getPct((long) (short) 10);
        long long26 = frequency18.getCumFreq(' ');
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCount((long) (short) 10);
        long long31 = frequency27.getCount(0L);
        double double33 = frequency27.getCumPct('a');
        boolean boolean34 = frequency18.equals((java.lang.Object) frequency27);
        frequency18.addValue((java.lang.Integer) 10);
        long long37 = frequency5.getCumFreq((java.lang.Object) 10);
        long long38 = frequency0.getCumFreq((java.lang.Object) 10);
        long long40 = frequency0.getCumFreq((-1));
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long43 = frequency41.getCount((long) (short) 10);
        double double45 = frequency41.getCumPct((long) (byte) 10);
        frequency41.addValue(0L);
        double double49 = frequency41.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency41.addValue((java.lang.Integer) 100);
        long long53 = frequency41.getCount((java.lang.Object) (byte) 10);
        double double55 = frequency41.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n\t1\t100%\t100%\n");
        double double56 = frequency0.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n\t1\t100%\t100%\n");
        long long58 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long7 = frequency3.getCount('a');
        long long8 = frequency3.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency3.valuesIterator();
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) long11);
        long long14 = frequency0.getCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        long long8 = frequency0.getCount(100);
        long long10 = frequency0.getCumFreq((long) (byte) -1);
        double double12 = frequency0.getCumPct((-1));
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((long) (short) 10);
        double double17 = frequency13.getCumPct((long) (byte) 10);
        frequency13.addValue(0L);
        double double21 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency13.addValue((java.lang.Integer) 100);
        long long24 = frequency13.getSumFreq();
        boolean boolean25 = frequency0.equals((java.lang.Object) frequency13);
        double double27 = frequency13.getPct(' ');
        frequency13.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.clear();
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.clear();
        frequency0.addValue((long) (short) 10);
        java.lang.String str12 = frequency0.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        double double8 = frequency0.getCumPct('a');
        double double10 = frequency0.getPct((long) '#');
        long long12 = frequency0.getCount('#');
        long long14 = frequency0.getCumFreq((int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.clear();
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.clear();
        frequency0.addValue((long) (short) 10);
        frequency0.addValue((java.lang.Integer) 1);
        long long15 = frequency0.getCumFreq(10L);
        double double17 = frequency0.getPct(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getPct((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCumFreq((int) '#');
        double double17 = frequency11.getCumPct((java.lang.Object) (short) 0);
        boolean boolean19 = frequency11.equals((java.lang.Object) 100.0d);
        long long20 = frequency11.getSumFreq();
        boolean boolean21 = frequency0.equals((java.lang.Object) long20);
        double double23 = frequency0.getCumPct('4');
        long long25 = frequency0.getCumFreq('a');
        long long27 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency0.equals((java.lang.Object) frequency7);
        frequency7.addValue(0L);
        long long12 = frequency7.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        long long14 = frequency7.getCumFreq('4');
        double double16 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        long long17 = frequency7.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency2 = new org.apache.commons.math.stat.Frequency();
        long long4 = frequency2.getCumFreq((long) (short) 1);
        frequency2.addValue('a');
        long long8 = frequency2.getCount((int) (short) -1);
        long long10 = frequency2.getCumFreq(' ');
        long long12 = frequency2.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency2.getCumPct((int) (byte) 100);
        double double15 = frequency0.getCumPct((java.lang.Object) (byte) 100);
        frequency0.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((long) (short) 10);
        double double22 = frequency18.getCumPct((long) (byte) 10);
        double double24 = frequency18.getCumPct(' ');
        long long25 = frequency0.getCount((java.lang.Object) ' ');
        long long27 = frequency0.getCount('4');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long32 = frequency28.getCumFreq((int) '#');
        long long34 = frequency28.getCount((java.lang.Object) Double.NaN);
        long long36 = frequency28.getCumFreq((long) (byte) -1);
        double double38 = frequency28.getPct('a');
        long long40 = frequency28.getCount('#');
        java.lang.String str41 = frequency28.toString();
        double double42 = frequency0.getPct((java.lang.Object) str41);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str41, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.clear();
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.clear();
        double double11 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double15 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double17 = frequency0.getPct('#');
        long long19 = frequency0.getCumFreq((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        long long5 = frequency0.getCumFreq('a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long7 = frequency3.getCount('a');
        long long8 = frequency3.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency3.valuesIterator();
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) long11);
        frequency0.addValue((int) (short) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency0.valuesIterator();
        frequency0.addValue(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        double double6 = frequency0.getCumPct('4');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long11 = frequency7.getCount('a');
        long long12 = frequency7.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency7.valuesIterator();
        boolean boolean15 = frequency7.equals((java.lang.Object) false);
        long long17 = frequency7.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double19 = frequency7.getPct((int) (byte) -1);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency7);
        long long22 = frequency0.getCount((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq((long) (short) 1);
        double double27 = frequency23.getCumPct((int) (byte) -1);
        long long29 = frequency23.getCumFreq((long) 1);
        long long30 = frequency0.getCumFreq((java.lang.Object) long29);
        double double32 = frequency0.getCumPct('a');
        long long34 = frequency0.getCount((-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        double double10 = frequency0.getPct((int) (byte) 100);
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getCumPct((int) '#');
        long long15 = frequency0.getCount((long) (short) 100);
        frequency0.addValue('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency0.getSumFreq();
        double double11 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((int) (short) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency0.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency0.valuesIterator();
        double double17 = frequency0.getPct('a');
        double double19 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double21 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long12 = frequency0.getCount('#');
        double double14 = frequency0.getCumPct('#');
        long long16 = frequency0.getCumFreq('#');
        long long18 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        long long5 = frequency0.getSumFreq();
        double double7 = frequency0.getPct(' ');
        java.lang.String str8 = frequency0.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor2 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Integer) 1);
        long long6 = frequency0.getCumFreq('#');
        java.lang.String str7 = frequency0.toString();
        frequency0.clear();
        long long10 = frequency0.getCumFreq('a');
        frequency0.addValue(10);
        long long14 = frequency0.getCount((long) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardComparableItor2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency9.valuesIterator();
        long long17 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getPct((int) (short) 1);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency9);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount((long) (short) 10);
        double double25 = frequency21.getCumPct((long) (byte) 10);
        frequency21.addValue(0L);
        boolean boolean29 = frequency21.equals((java.lang.Object) (byte) 1);
        long long31 = frequency21.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long33 = frequency21.getCount(100);
        double double34 = frequency9.getPct((java.lang.Object) 100);
        frequency9.clear();
        double double37 = frequency9.getCumPct((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        double double6 = frequency0.getCumPct('4');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long11 = frequency7.getCount('a');
        long long12 = frequency7.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency7.valuesIterator();
        boolean boolean15 = frequency7.equals((java.lang.Object) false);
        long long17 = frequency7.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double19 = frequency7.getPct((int) (byte) -1);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency7);
        frequency7.addValue(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor2 = frequency0.valuesIterator();
        double double4 = frequency0.getCumPct((int) (short) 0);
        frequency0.addValue((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardComparableItor2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        long long6 = frequency4.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long8 = frequency4.getCumFreq((int) '#');
        long long10 = frequency4.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        boolean boolean12 = frequency4.equals((java.lang.Object) frequency11);
        frequency11.addValue(0L);
        long long15 = frequency0.getCount((java.lang.Object) 0L);
        java.lang.String str16 = frequency0.toString();
        double double18 = frequency0.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq((long) (short) 1);
        frequency19.addValue('a');
        double double25 = frequency19.getCumPct('4');
        double double27 = frequency19.getCumPct((int) (byte) 1);
        double double29 = frequency19.getCumPct('4');
        long long30 = frequency19.getSumFreq();
        double double31 = frequency0.getCumPct((java.lang.Object) long30);
        double double33 = frequency0.getPct(' ');
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.addValue((long) (short) -1);
        double double14 = frequency0.getCumPct(0);
        double double16 = frequency0.getPct((long) (byte) 0);
        frequency0.addValue((long) (byte) 0);
        java.lang.String str19 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6666666666666666d + "'", double14 == 0.6666666666666666d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3333333333333333d + "'", double16 == 0.3333333333333333d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t25%\t25%\n0\t2\t50%\t75%\n100\t1\t25%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t25%\t25%\n0\t2\t50%\t75%\n100\t1\t25%\t100%\n");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        long long6 = frequency0.getCount('#');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency0.getCumPct((int) (byte) 1);
        long long14 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue((int) (short) -1);
        frequency0.clear();
        double double7 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        double double9 = frequency0.getCumPct('#');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long14 = frequency10.getCumFreq((int) '#');
        double double16 = frequency10.getCumPct((java.lang.Object) (short) 0);
        boolean boolean18 = frequency10.equals((java.lang.Object) 100.0d);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCount((long) (short) 10);
        double double23 = frequency19.getCumPct((long) (byte) 10);
        frequency19.addValue(0L);
        double double26 = frequency10.getCumPct((java.lang.Object) 0L);
        double double28 = frequency10.getCumPct((long) (short) 100);
        double double30 = frequency10.getPct((int) (short) 10);
        double double32 = frequency10.getCumPct((long) 10);
        long long34 = frequency10.getCumFreq(0);
        double double36 = frequency10.getCumPct((-1));
        frequency10.addValue((long) (short) 0);
        long long40 = frequency10.getCumFreq((long) (-1));
        boolean boolean41 = frequency0.equals((java.lang.Object) frequency10);
        long long43 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((long) (short) 1);
        double double13 = frequency9.getPct((long) (byte) 100);
        frequency9.addValue((-1));
        long long17 = frequency9.getCount(100);
        long long19 = frequency9.getCumFreq((long) (byte) -1);
        boolean boolean20 = frequency0.equals((java.lang.Object) long19);
        double double22 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long23 = frequency0.getSumFreq();
        long long25 = frequency0.getCount('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCumFreq((long) (byte) -1);
        long long10 = frequency0.getCumFreq('a');
        boolean boolean12 = frequency0.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long17 = frequency13.getCount('a');
        long long18 = frequency13.getSumFreq();
        frequency13.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency13.valuesIterator();
        java.lang.String str22 = frequency13.toString();
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency13);
        long long25 = frequency13.getCount(' ');
        frequency13.addValue((java.lang.Integer) (-1));
        double double29 = frequency13.getPct(0L);
        long long31 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        double double33 = frequency13.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        long long35 = frequency13.getCumFreq((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCount((-1L));
        long long16 = frequency12.getCumFreq((long) 100);
        java.lang.String str17 = frequency12.toString();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((long) (short) 10);
        double double22 = frequency18.getCumPct((long) (byte) 10);
        double double24 = frequency18.getCumPct((int) (byte) 10);
        long long26 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCount((long) (short) 10);
        double double31 = frequency27.getCumPct((long) (byte) 10);
        frequency27.addValue(0L);
        double double35 = frequency27.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double37 = frequency27.getCumPct((int) (short) 10);
        boolean boolean38 = frequency18.equals((java.lang.Object) frequency27);
        frequency27.addValue((java.lang.Integer) (-1));
        frequency27.addValue((java.lang.Integer) (-1));
        boolean boolean43 = frequency12.equals((java.lang.Object) (-1));
        double double45 = frequency12.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.lang.Class<?> wildcardClass46 = frequency12.getClass();
        boolean boolean47 = frequency0.equals((java.lang.Object) frequency12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((long) (short) 1);
        double double13 = frequency9.getPct((long) (byte) 100);
        frequency9.addValue((-1));
        long long17 = frequency9.getCount(100);
        long long19 = frequency9.getCumFreq((long) (byte) -1);
        boolean boolean20 = frequency0.equals((java.lang.Object) long19);
        double double22 = frequency0.getCumPct(2L);
        long long24 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        double double8 = frequency0.getCumPct('a');
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        long long12 = frequency0.getCumFreq((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long11 = frequency0.getSumFreq();
        frequency0.addValue(' ');
        double double15 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue(0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct((int) (byte) 0);
        double double12 = frequency0.getPct('#');
        long long14 = frequency0.getCount((long) 1);
        frequency0.addValue((int) (byte) 0);
        double double18 = frequency0.getCumPct((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCount((java.lang.Object) 10);
        frequency0.addValue((java.lang.Integer) 0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((long) (short) 1);
        frequency11.addValue('a');
        long long17 = frequency11.getCount((int) (short) -1);
        long long19 = frequency11.getCumFreq(' ');
        long long21 = frequency11.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double23 = frequency11.getCumPct((int) (byte) 100);
        long long25 = frequency11.getCumFreq((long) 10);
        double double26 = frequency0.getPct((java.lang.Object) long25);
        long long28 = frequency0.getCumFreq(' ');
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long34 = frequency30.getCumFreq((int) '#');
        double double36 = frequency30.getCumPct((java.lang.Object) (short) 0);
        boolean boolean38 = frequency30.equals((java.lang.Object) 100.0d);
        frequency30.addValue((java.lang.Integer) 1);
        frequency30.addValue(10L);
        double double44 = frequency30.getCumPct(100);
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        long long47 = frequency45.getCount((long) (short) 10);
        double double49 = frequency45.getCumPct((long) (byte) 10);
        double double51 = frequency45.getCumPct(0);
        frequency30.addValue((java.lang.Object) 0);
        double double54 = frequency30.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        long long56 = frequency30.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        double double57 = frequency0.getCumPct((java.lang.Object) long56);
        long long59 = frequency0.getCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue(0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct((int) (byte) 0);
        long long12 = frequency0.getCount(2L);
        double double14 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq((long) (short) 1);
        double double19 = frequency15.getCumPct((int) (short) 100);
        frequency15.addValue(0L);
        double double23 = frequency15.getPct((int) (short) 1);
        double double24 = frequency0.getCumPct((java.lang.Object) (short) 1);
        long long26 = frequency0.getCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue(0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        java.lang.String str8 = frequency0.toString();
        long long10 = frequency0.getCount('a');
        double double12 = frequency0.getCumPct((long) (byte) 10);
        double double14 = frequency0.getCumPct('#');
        double double16 = frequency0.getCumPct(0L);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long21 = frequency17.getCumFreq((int) '#');
        double double23 = frequency17.getCumPct((java.lang.Object) (short) 0);
        boolean boolean25 = frequency17.equals((java.lang.Object) 100.0d);
        frequency17.addValue((java.lang.Integer) 1);
        frequency17.addValue(10L);
        double double31 = frequency17.getCumPct(100);
        long long33 = frequency17.getCount((int) 'a');
        long long35 = frequency17.getCount(0L);
        boolean boolean36 = frequency0.equals((java.lang.Object) long35);
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        long long39 = frequency37.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long41 = frequency37.getCount('a');
        long long42 = frequency37.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor43 = frequency37.valuesIterator();
        long long45 = frequency37.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double47 = frequency37.getCumPct(100);
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency();
        long long50 = frequency48.getCumFreq((long) (short) 1);
        double double52 = frequency48.getPct((long) (byte) 100);
        frequency48.addValue(0);
        long long55 = frequency37.getCumFreq((java.lang.Object) 0);
        double double57 = frequency37.getCumPct((int) (byte) -1);
        double double58 = frequency0.getPct((java.lang.Object) double57);
        double double60 = frequency0.getPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue(0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct((int) (byte) 0);
        long long12 = frequency0.getCount(2L);
        java.lang.String str13 = frequency0.toString();
        double double15 = frequency0.getPct((int) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCount((long) (short) 10);
        double double20 = frequency16.getCumPct((long) (byte) 10);
        double double22 = frequency16.getCumPct((int) (byte) 10);
        frequency16.addValue((java.lang.Integer) 10);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor28 = frequency25.valuesIterator();
        frequency25.addValue((java.lang.Comparable<java.lang.String>) "");
        double double32 = frequency25.getPct((int) '4');
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCount((long) (short) 10);
        long long37 = frequency33.getCumFreq((long) 'a');
        boolean boolean38 = frequency25.equals((java.lang.Object) frequency33);
        long long40 = frequency33.getCumFreq((int) (byte) -1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor41 = frequency33.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor42 = frequency33.valuesIterator();
        boolean boolean43 = frequency16.equals((java.lang.Object) wildcardComparableItor42);
        long long44 = frequency0.getCumFreq((java.lang.Object) boolean43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor41);
        org.junit.Assert.assertNotNull(wildcardComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        java.lang.String str11 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency12.getCount('a');
        double double18 = frequency12.getPct((long) (short) 10);
        long long20 = frequency12.getCumFreq(' ');
        frequency12.addValue('#');
        // The following exception was thrown during execution in test generation
        try {
            double double23 = frequency0.getPct((java.lang.Object) frequency12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        double double3 = frequency0.getPct((java.lang.Object) 0L);
        long long5 = frequency0.getCumFreq((long) ' ');
        frequency0.clear();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        long long16 = frequency9.getCumFreq('4');
        double double18 = frequency9.getCumPct((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        frequency19.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency19.valuesIterator();
        double double23 = frequency19.getCumPct((int) (short) 0);
        double double25 = frequency19.getCumPct((int) (byte) 0);
        long long26 = frequency9.getCount((java.lang.Object) (byte) 0);
        double double28 = frequency9.getPct('#');
        double double30 = frequency9.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq((long) (short) 1);
        frequency31.addValue('a');
        long long37 = frequency31.getCount((int) (short) -1);
        long long39 = frequency31.getCumFreq(' ');
        long long41 = frequency31.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCumFreq((long) (short) 1);
        double double46 = frequency42.getPct((long) (byte) 100);
        frequency42.addValue((-1));
        double double50 = frequency42.getPct('4');
        long long52 = frequency42.getCount((int) (short) 100);
        long long53 = frequency31.getCount((java.lang.Object) long52);
        boolean boolean54 = frequency9.equals((java.lang.Object) frequency31);
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency();
        long long57 = frequency55.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long59 = frequency55.getCount('a');
        long long60 = frequency55.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor61 = frequency55.valuesIterator();
        long long63 = frequency55.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str64 = frequency55.toString();
        long long66 = frequency55.getCumFreq((long) (byte) 10);
        boolean boolean67 = frequency31.equals((java.lang.Object) (byte) 10);
        long long69 = frequency31.getCumFreq((int) ' ');
        long long70 = frequency0.getCount((java.lang.Object) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor61);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str64, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue(' ');
        double double4 = frequency0.getPct(0L);
        double double6 = frequency0.getCumPct(' ');
        long long8 = frequency0.getCumFreq((int) (short) 1);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (byte) -1);
        frequency0.clear();
        frequency0.clear();
        frequency0.clear();
        double double9 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((long) (short) 1);
        frequency10.addValue((int) (short) -1);
        java.lang.String str15 = frequency10.toString();
        long long17 = frequency10.getCount((java.lang.Object) 1.0f);
        double double19 = frequency10.getCumPct((long) '#');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((long) (short) 1);
        frequency20.addValue('a');
        long long26 = frequency20.getCount((int) (short) -1);
        long long28 = frequency20.getCumFreq(' ');
        long long30 = frequency20.getCount((int) (byte) 0);
        double double31 = frequency10.getCumPct((java.lang.Object) long30);
        long long32 = frequency0.getCumFreq((java.lang.Object) long30);
        long long34 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency35.getCount('a');
        long long40 = frequency35.getSumFreq();
        frequency35.addValue((java.lang.Integer) 100);
        boolean boolean43 = frequency0.equals((java.lang.Object) frequency35);
        long long45 = frequency0.getCount(2L);
        long long47 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct(' ');
        double double8 = frequency0.getPct((int) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((long) (short) 1);
        frequency9.addValue('a');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long18 = frequency14.getCount('a');
        double double19 = frequency9.getCumPct((java.lang.Object) long18);
        long long20 = frequency9.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long25 = frequency21.getCumFreq((int) '#');
        double double27 = frequency21.getCumPct((java.lang.Object) (short) 0);
        boolean boolean29 = frequency21.equals((java.lang.Object) 100.0d);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCount((long) (short) 10);
        double double34 = frequency30.getCumPct((long) (byte) 10);
        frequency30.addValue(0L);
        double double37 = frequency21.getCumPct((java.lang.Object) 0L);
        double double38 = frequency9.getPct((java.lang.Object) double37);
        double double40 = frequency9.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double41 = frequency0.getCumPct((java.lang.Object) double40);
        long long43 = frequency0.getCumFreq(' ');
        double double45 = frequency0.getCumPct((long) (short) 10);
        frequency0.clear();
        frequency0.addValue(' ');
        long long50 = frequency0.getCumFreq('a');
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        long long53 = frequency51.getCumFreq((long) (short) 1);
        frequency51.addValue('a');
        long long57 = frequency51.getCount((int) (short) -1);
        long long59 = frequency51.getCumFreq(' ');
        long long61 = frequency51.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency();
        long long64 = frequency62.getCumFreq((long) (short) 1);
        double double66 = frequency62.getPct((long) (byte) 100);
        frequency62.addValue((-1));
        double double70 = frequency62.getPct('4');
        long long72 = frequency62.getCount((int) (short) 100);
        long long73 = frequency51.getCount((java.lang.Object) long72);
        long long75 = frequency51.getCount('4');
        org.apache.commons.math.stat.Frequency frequency76 = new org.apache.commons.math.stat.Frequency();
        frequency76.clear();
        frequency76.addValue('#');
        long long81 = frequency76.getCumFreq((int) (short) 0);
        frequency76.clear();
        double double84 = frequency76.getCumPct((long) 0);
        double double85 = frequency51.getPct((java.lang.Object) double84);
        boolean boolean86 = frequency0.equals((java.lang.Object) double84);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        frequency0.addValue((java.lang.Integer) 10);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((long) (short) 10);
        double double15 = frequency11.getCumPct((long) (byte) 10);
        double double17 = frequency11.getCumPct(' ');
        double double19 = frequency11.getPct((long) 1);
        boolean boolean20 = frequency0.equals((java.lang.Object) double19);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount((-1L));
        frequency21.addValue(1);
        double double27 = frequency21.getPct((long) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor28 = frequency21.valuesIterator();
        java.lang.Class<?> wildcardClass29 = frequency21.getClass();
        boolean boolean30 = frequency0.equals((java.lang.Object) frequency21);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor2 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Integer) 1);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getCumPct('a');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(wildcardComparableItor2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue(0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        java.lang.String str8 = frequency0.toString();
        long long10 = frequency0.getCount('a');
        java.lang.Class<?> wildcardClass11 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((long) (short) 1);
        double double9 = frequency5.getPct((long) (byte) 100);
        frequency5.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        frequency5.clear();
        double double14 = frequency5.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        long long15 = frequency5.getSumFreq();
        frequency5.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n\t1\t50%\t100%\n");
        long long18 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCumFreq((long) (byte) -1);
        long long10 = frequency0.getCumFreq('a');
        boolean boolean12 = frequency0.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long17 = frequency13.getCount('a');
        long long18 = frequency13.getSumFreq();
        frequency13.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency13.valuesIterator();
        java.lang.String str22 = frequency13.toString();
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency13);
        double double25 = frequency0.getPct(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        long long7 = frequency0.getSumFreq();
        double double9 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency0.equals((java.lang.Object) frequency7);
        long long10 = frequency7.getCount((int) (short) -1);
        long long12 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t2\t100%\t100%\n");
        double double14 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency7.getPct(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor2 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Integer) 1);
        long long6 = frequency0.getCount((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long11 = frequency7.getCumFreq((int) '#');
        double double13 = frequency7.getCumPct((java.lang.Object) (short) 0);
        boolean boolean15 = frequency7.equals((java.lang.Object) 100.0d);
        double double17 = frequency7.getPct((int) (byte) 100);
        long long19 = frequency7.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long20 = frequency0.getCumFreq((java.lang.Object) long19);
        long long22 = frequency0.getCount((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(wildcardComparableItor2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        long long4 = frequency0.getCumFreq((long) 'a');
        double double6 = frequency0.getPct((java.lang.Object) true);
        long long8 = frequency0.getCount(0);
        long long10 = frequency0.getCount(0);
        long long12 = frequency0.getCumFreq('a');
        long long13 = frequency0.getSumFreq();
        double double15 = frequency0.getPct((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        double double13 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency0.valuesIterator();
        java.lang.Class<?> wildcardClass15 = wildcardComparableItor14.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue(' ');
        long long4 = frequency0.getCumFreq((int) '#');
        frequency0.addValue('#');
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nfalse\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCumFreq(' ');
        long long9 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        double double5 = frequency0.getCumPct(' ');
        double double7 = frequency0.getPct((long) (short) 100);
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        double double11 = frequency0.getPct((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct((java.lang.Object) (byte) 100);
        double double6 = frequency0.getCumPct('#');
        long long8 = frequency0.getCumFreq((int) (byte) -1);
        frequency0.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        long long3 = frequency0.getCount((long) (byte) 0);
        long long5 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCount((long) (short) 10);
        double double10 = frequency6.getCumPct((long) (byte) 10);
        frequency6.addValue(0L);
        double double14 = frequency6.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency6.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long17 = frequency6.getSumFreq();
        long long19 = frequency6.getCumFreq(' ');
        double double21 = frequency6.getPct('a');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq((long) (short) 1);
        double double26 = frequency22.getPct((long) (byte) 100);
        long long28 = frequency22.getCount((long) (byte) 1);
        boolean boolean29 = frequency6.equals((java.lang.Object) frequency22);
        boolean boolean30 = frequency0.equals((java.lang.Object) frequency6);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq((long) (short) 1);
        double double35 = frequency31.getPct((long) (byte) 100);
        long long37 = frequency31.getCumFreq((long) (short) 1);
        double double39 = frequency31.getPct((long) (byte) 1);
        double double41 = frequency31.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        long long43 = frequency31.getCount(' ');
        long long44 = frequency31.getSumFreq();
        long long46 = frequency31.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        double double48 = frequency31.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long50 = frequency31.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        long long9 = frequency0.getCount('a');
        double double11 = frequency0.getPct((long) (short) -1);
        frequency0.clear();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
        long long16 = frequency0.getCumFreq((int) (short) 0);
        long long18 = frequency0.getCount((int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue(' ');
        long long4 = frequency0.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double11 = frequency5.getPct('a');
        java.lang.String str12 = frequency5.toString();
        long long14 = frequency5.getCount(100L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = frequency0.getPct((java.lang.Object) frequency5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCount((int) (short) -1);
        long long12 = frequency0.getCumFreq((long) (short) -1);
        frequency0.addValue('4');
        long long15 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        double double10 = frequency0.getPct((int) (byte) 100);
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getCumPct((int) '#');
        double double15 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long20 = frequency16.getCount('a');
        long long21 = frequency16.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency16.valuesIterator();
        boolean boolean24 = frequency16.equals((java.lang.Object) false);
        long long26 = frequency16.getCount((long) (short) 1);
        frequency16.addValue((java.lang.Integer) 0);
        double double30 = frequency16.getCumPct(2L);
        java.lang.String str31 = frequency16.toString();
        long long32 = frequency0.getCumFreq((java.lang.Object) str31);
        double double34 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str31, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        frequency11.clear();
        frequency11.addValue('#');
        long long16 = frequency11.getCumFreq((int) (short) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor17 = frequency11.valuesIterator();
        double double19 = frequency11.getCumPct((long) '4');
        long long20 = frequency0.getCumFreq((java.lang.Object) '4');
        long long21 = frequency0.getSumFreq();
        long long23 = frequency0.getCumFreq(1);
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        double double25 = frequency0.getCumPct(strComparable24);
        long long27 = frequency0.getCount('#');
        java.lang.String str28 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        long long31 = frequency29.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long33 = frequency29.getCumFreq((int) '#');
        long long35 = frequency29.getCount((java.lang.Object) Double.NaN);
        long long37 = frequency29.getCumFreq((long) (byte) -1);
        long long39 = frequency29.getCumFreq('a');
        boolean boolean41 = frequency29.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long46 = frequency42.getCount('a');
        long long47 = frequency42.getSumFreq();
        frequency42.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor50 = frequency42.valuesIterator();
        java.lang.String str51 = frequency42.toString();
        boolean boolean52 = frequency29.equals((java.lang.Object) frequency42);
        long long54 = frequency42.getCount(' ');
        long long56 = frequency42.getCount(0);
        long long58 = frequency42.getCumFreq('a');
        // The following exception was thrown during execution in test generation
        try {
            double double59 = frequency0.getCumPct((java.lang.Object) frequency42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str51, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        long long3 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        long long6 = frequency4.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long8 = frequency4.getCount('a');
        double double9 = frequency0.getCumPct((java.lang.Object) 'a');
        long long10 = frequency0.getSumFreq();
        long long12 = frequency0.getCumFreq(0);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency15.getCumPct('#');
        double double21 = frequency15.getPct('a');
        long long23 = frequency15.getCumFreq(0);
        frequency15.clear();
        long long26 = frequency15.getCount((long) (-1));
        double double28 = frequency15.getPct((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = frequency0.getPct((java.lang.Object) frequency15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct('#');
        double double6 = frequency0.getPct('a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n1\t1\t33%\t67%\n100\t1\t33%\t100%\n");
        long long10 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        long long8 = frequency0.getCount(100);
        long long10 = frequency0.getCumFreq((long) (byte) -1);
        double double12 = frequency0.getCumPct((-1));
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((long) (short) 10);
        double double17 = frequency13.getCumPct((long) (byte) 10);
        frequency13.addValue(0L);
        double double21 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency13.addValue((java.lang.Integer) 100);
        long long24 = frequency13.getSumFreq();
        boolean boolean25 = frequency0.equals((java.lang.Object) frequency13);
        frequency13.addValue((long) 0);
        double double29 = frequency13.getCumPct((int) ' ');
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor31 = frequency30.valuesIterator();
        long long33 = frequency30.getCount('a');
        double double35 = frequency30.getCumPct(' ');
        long long37 = frequency30.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency30.getCount((int) '4');
        long long41 = frequency30.getCumFreq((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCumFreq((long) (short) 1);
        double double46 = frequency42.getPct((long) (byte) 100);
        frequency42.addValue((-1));
        long long50 = frequency42.getCount(100);
        long long52 = frequency42.getCount((java.lang.Comparable<java.lang.String>) "");
        double double54 = frequency42.getPct('4');
        boolean boolean55 = frequency30.equals((java.lang.Object) frequency42);
        double double57 = frequency42.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        double double59 = frequency42.getCumPct(100L);
        long long61 = frequency42.getCumFreq(10L);
        java.lang.String str62 = frequency42.toString();
        long long64 = frequency42.getCumFreq((long) (-1));
        frequency13.addValue((java.lang.Object) (-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor66 = frequency13.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor67 = frequency13.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.6666666666666666d + "'", double29 == 0.6666666666666666d);
        org.junit.Assert.assertNotNull(wildcardComparableItor31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str62, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor66);
        org.junit.Assert.assertNotNull(wildcardComparableItor67);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        long long9 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long14 = frequency10.getCount('a');
        long long15 = frequency10.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency10.valuesIterator();
        long long18 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double20 = frequency10.getPct((int) (short) 1);
        frequency10.addValue((java.lang.Integer) (-1));
        frequency0.addValue((java.lang.Object) (-1));
        long long25 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double27 = frequency0.getPct(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct(100);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCumFreq((int) '#');
        double double17 = frequency11.getCumPct((java.lang.Object) (short) 0);
        boolean boolean19 = frequency11.equals((java.lang.Object) 100.0d);
        double double21 = frequency11.getPct((int) (byte) 100);
        long long22 = frequency11.getSumFreq();
        double double24 = frequency11.getCumPct((int) '#');
        double double25 = frequency0.getCumPct((java.lang.Object) double24);
        long long27 = frequency0.getCount(' ');
        double double29 = frequency0.getCumPct('a');
        java.lang.String str30 = frequency0.toString();
        long long32 = frequency0.getCount('4');
        frequency0.addValue('4');
        frequency0.addValue('4');
        double double38 = frequency0.getPct((long) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        long long41 = frequency39.getCumFreq((long) (short) 1);
        frequency39.addValue((int) (short) -1);
        java.lang.String str44 = frequency39.toString();
        long long46 = frequency39.getCount((java.lang.Object) 1.0f);
        double double48 = frequency39.getCumPct((long) '#');
        long long50 = frequency39.getCumFreq((int) (byte) 0);
        long long52 = frequency39.getCount((int) (byte) 10);
        double double54 = frequency39.getCumPct((int) (byte) 0);
        long long55 = frequency0.getCount((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str44, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        long long4 = frequency0.getCumFreq((long) 'a');
        double double6 = frequency0.getPct((java.lang.Object) true);
        long long7 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((long) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        frequency10.addValue((-1));
        double double18 = frequency10.getPct('4');
        java.lang.String str19 = frequency10.toString();
        double double21 = frequency10.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        boolean boolean22 = frequency0.equals((java.lang.Object) frequency10);
        frequency0.addValue((java.lang.Integer) 1);
        double double26 = frequency0.getCumPct((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long31 = frequency27.getCumFreq((int) '#');
        double double33 = frequency27.getCumPct((java.lang.Object) (short) 0);
        boolean boolean35 = frequency27.equals((java.lang.Object) 100.0d);
        double double37 = frequency27.getPct((int) (byte) 100);
        long long39 = frequency27.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long41 = frequency27.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        long long42 = frequency27.getSumFreq();
        double double44 = frequency27.getPct((long) (byte) 10);
        frequency27.addValue((java.lang.Integer) 1);
        boolean boolean47 = frequency0.equals((java.lang.Object) frequency27);
        double double49 = frequency0.getCumPct((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double12 = frequency0.getPct((int) (byte) -1);
        double double14 = frequency0.getCumPct((int) ' ');
        long long16 = frequency0.getCumFreq(' ');
        long long18 = frequency0.getCumFreq((long) '#');
        frequency0.addValue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        long long4 = frequency0.getCumFreq((long) 100);
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        double double9 = frequency0.getCumPct((long) (short) 1);
        double double11 = frequency0.getCumPct('4');
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        boolean boolean8 = frequency0.equals((java.lang.Object) (byte) 1);
        double double10 = frequency0.getCumPct((int) (short) 10);
        long long12 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue((int) (short) -1);
        java.lang.String str5 = frequency0.toString();
        double double7 = frequency0.getPct(100);
        long long9 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (byte) -1);
        frequency0.clear();
        frequency0.addValue((-1));
        frequency0.addValue(0);
        double double11 = frequency0.getCumPct((int) (short) 10);
        long long13 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long18 = frequency14.getCumFreq((int) '#');
        long long20 = frequency14.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        boolean boolean22 = frequency14.equals((java.lang.Object) frequency21);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq((long) (short) 1);
        double double27 = frequency23.getPct((long) (byte) 100);
        java.lang.String str28 = frequency23.toString();
        frequency21.addValue((java.lang.Object) str28);
        long long31 = frequency21.getCumFreq(10);
        long long33 = frequency21.getCount('a');
        double double35 = frequency21.getCumPct('a');
        double double37 = frequency21.getPct((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) frequency21);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getPct((long) (byte) 1);
        double double10 = frequency0.getCumPct((int) (short) 0);
        frequency0.addValue((int) ' ');
        long long14 = frequency0.getCumFreq((int) (short) -1);
        long long15 = frequency0.getSumFreq();
        double double17 = frequency0.getCumPct(0L);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long25 = frequency21.getCount('a');
        long long26 = frequency21.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency21.valuesIterator();
        long long29 = frequency21.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency18.addValue((java.lang.Object) long29);
        frequency18.addValue((int) (short) 1);
        frequency18.addValue(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor35 = frequency18.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            double double36 = frequency0.getPct((java.lang.Object) wildcardComparableItor35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.TreeMap$KeyIterator cannot be cast to class java.lang.Comparable (java.util.TreeMap$KeyIterator and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor35);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (byte) -1);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double8 = frequency0.getPct((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        double double5 = frequency0.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCumFreq((long) (short) 1);
        frequency6.addValue('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCount('a');
        double double16 = frequency6.getCumPct((java.lang.Object) long15);
        long long17 = frequency6.getSumFreq();
        long long18 = frequency6.getSumFreq();
        long long20 = frequency6.getCumFreq(' ');
        long long21 = frequency0.getCumFreq((java.lang.Object) ' ');
        frequency0.addValue((-1L));
        double double25 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n\t1\t50%\t50%\nhi!\t1\t50%\t100%\n");
        long long27 = frequency0.getCumFreq((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCount((long) (byte) 10);
        long long15 = frequency0.getCumFreq(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor8 = frequency0.valuesIterator();
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCumFreq((int) ' ');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCumFreq((long) (short) 1);
        frequency12.addValue((int) (short) -1);
        java.lang.String str17 = frequency12.toString();
        long long19 = frequency12.getCount((java.lang.Object) 1.0f);
        double double21 = frequency12.getCumPct((long) '#');
        long long23 = frequency12.getCumFreq((int) (byte) 0);
        double double24 = frequency0.getPct((java.lang.Object) long23);
        long long26 = frequency0.getCount((int) (short) 1);
        double double28 = frequency0.getPct(0L);
        long long30 = frequency0.getCumFreq((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        frequency0.addValue('#');
        long long5 = frequency0.getCumFreq((int) (short) 0);
        frequency0.clear();
        double double8 = frequency0.getCumPct((long) 0);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency9.valuesIterator();
        boolean boolean17 = frequency9.equals((java.lang.Object) false);
        long long19 = frequency9.getCount((long) (short) 1);
        frequency0.addValue((java.lang.Object) (short) 1);
        long long22 = frequency0.getCumFreq('4');
        double double24 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n\t1\t50%\t100%\n");
        long long26 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq((long) (short) 1);
        double double31 = frequency27.getPct((long) (byte) 100);
        long long33 = frequency27.getCumFreq((long) (short) 1);
        long long34 = frequency27.getSumFreq();
        double double36 = frequency27.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency27.addValue((long) (short) 0);
        java.lang.String str39 = frequency27.toString();
        long long40 = frequency0.getCumFreq((java.lang.Object) str39);
        double double42 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        long long45 = frequency43.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor46 = frequency43.valuesIterator();
        frequency43.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor49 = frequency43.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor50 = frequency43.valuesIterator();
        long long52 = frequency43.getCount('a');
        long long54 = frequency43.getCount('4');
        java.lang.String str55 = frequency43.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double56 = frequency0.getPct((java.lang.Object) frequency43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor46);
        org.junit.Assert.assertNotNull(wildcardComparableItor49);
        org.junit.Assert.assertNotNull(wildcardComparableItor50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str55, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        double double5 = frequency0.getCumPct(' ');
        long long7 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency0.getCount((int) '4');
        long long11 = frequency0.getCumFreq('a');
        double double13 = frequency0.getCumPct((long) ' ');
        double double15 = frequency0.getPct(3L);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency9.valuesIterator();
        long long17 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getPct((int) (short) 1);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency9);
        long long22 = frequency0.getCumFreq((long) (short) 1);
        double double24 = frequency0.getPct((int) (short) -1);
        double double26 = frequency0.getCumPct('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        double double10 = frequency0.getPct((int) (byte) 100);
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount((long) (short) 10);
        double double19 = frequency15.getCumPct((long) (byte) 10);
        double double21 = frequency15.getCumPct(0);
        double double22 = frequency0.getPct((java.lang.Object) 0);
        double double24 = frequency0.getPct((long) (-1));
        double double26 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (byte) -1);
        long long6 = frequency0.getCumFreq((long) 1);
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        frequency9.addValue(0L);
        long long17 = frequency9.getCount((int) (byte) 10);
        double double18 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        frequency0.clear();
        frequency0.addValue(100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCumFreq(' ');
        long long14 = frequency0.getSumFreq();
        long long16 = frequency0.getCumFreq((long) 0);
        long long18 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq((long) (short) 1);
        double double23 = frequency19.getCumPct((int) (short) 100);
        frequency19.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        double double27 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long29 = frequency19.getCumFreq((int) ' ');
        double double31 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        long long32 = frequency19.getSumFreq();
        boolean boolean33 = frequency0.equals((java.lang.Object) frequency19);
        long long35 = frequency0.getCumFreq((int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long7 = frequency0.getCumFreq((int) (short) 1);
        long long9 = frequency0.getCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor8 = frequency0.valuesIterator();
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCumFreq((long) (short) 100);
        long long13 = frequency0.getCount('#');
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = frequency0.getCount(strComparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        long long10 = frequency0.getCount((long) (short) 1);
        java.lang.String str11 = frequency0.toString();
        frequency0.clear();
        long long14 = frequency0.getCumFreq(' ');
        double double16 = frequency0.getPct((long) (-1));
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount((long) (short) 10);
        double double21 = frequency17.getCumPct((long) (byte) 10);
        double double23 = frequency17.getCumPct(' ');
        double double25 = frequency17.getPct((int) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        long long28 = frequency26.getCumFreq((long) (short) 1);
        frequency26.addValue('a');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long35 = frequency31.getCount('a');
        double double36 = frequency26.getCumPct((java.lang.Object) long35);
        long long37 = frequency26.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        long long40 = frequency38.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long42 = frequency38.getCumFreq((int) '#');
        double double44 = frequency38.getCumPct((java.lang.Object) (short) 0);
        boolean boolean46 = frequency38.equals((java.lang.Object) 100.0d);
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency();
        long long49 = frequency47.getCount((long) (short) 10);
        double double51 = frequency47.getCumPct((long) (byte) 10);
        frequency47.addValue(0L);
        double double54 = frequency38.getCumPct((java.lang.Object) 0L);
        double double55 = frequency26.getPct((java.lang.Object) double54);
        double double57 = frequency26.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double58 = frequency17.getCumPct((java.lang.Object) double57);
        long long60 = frequency17.getCount(0);
        frequency17.addValue((java.lang.Object) false);
        double double64 = frequency17.getPct((int) '4');
        double double65 = frequency0.getCumPct((java.lang.Object) '4');
        double double67 = frequency0.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCount((java.lang.Object) 10);
        long long10 = frequency0.getCumFreq((long) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency12.getCount('a');
        long long17 = frequency12.getSumFreq();
        frequency12.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor20 = frequency12.valuesIterator();
        java.lang.String str21 = frequency12.toString();
        long long23 = frequency12.getCumFreq((int) ' ');
        long long24 = frequency0.getCumFreq((java.lang.Object) ' ');
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        frequency25.clear();
        frequency25.addValue('#');
        long long30 = frequency25.getCumFreq((int) (short) 0);
        double double32 = frequency25.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCumFreq((long) (short) 1);
        double double37 = frequency33.getPct((long) (byte) 100);
        frequency33.addValue((-1));
        double double41 = frequency33.getPct('4');
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long46 = frequency42.getCount('a');
        long long47 = frequency42.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor48 = frequency42.valuesIterator();
        long long50 = frequency42.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double52 = frequency42.getPct((int) (short) 1);
        boolean boolean53 = frequency33.equals((java.lang.Object) frequency42);
        long long55 = frequency33.getCumFreq((long) (short) 1);
        double double56 = frequency25.getCumPct((java.lang.Object) long55);
        long long57 = frequency0.getCumFreq((java.lang.Object) long55);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        long long60 = frequency58.getCount((long) (short) 10);
        double double62 = frequency58.getCumPct((long) (byte) 10);
        frequency58.addValue(0L);
        frequency58.addValue((java.lang.Integer) 10);
        long long67 = frequency58.getSumFreq();
        long long69 = frequency58.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double70 = frequency0.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        java.lang.Comparable<java.lang.String> strComparable71 = null;
        long long72 = frequency0.getCumFreq(strComparable71);
        double double74 = frequency0.getPct((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 2L + "'", long67 == 2L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        long long5 = frequency0.getCumFreq(' ');
        frequency0.clear();
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double12 = frequency0.getPct('#');
        long long14 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nNaN\t1\t100%\t100%\n");
        long long15 = frequency0.getSumFreq();
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        long long5 = frequency0.getCumFreq((int) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        double double8 = frequency0.getCumPct((long) '4');
        double double10 = frequency0.getCumPct(' ');
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct((int) (byte) 10);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long10 = frequency0.getCumFreq(' ');
        double double12 = frequency0.getCumPct((long) (byte) 100);
        long long14 = frequency0.getCount((int) (short) 0);
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCumFreq('#');
        double double12 = frequency0.getCumPct('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        java.lang.String str14 = frequency0.toString();
        long long16 = frequency0.getCount((int) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long21 = frequency17.getCumFreq((int) '#');
        long long23 = frequency17.getCumFreq((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        boolean boolean25 = frequency17.equals((java.lang.Object) frequency24);
        frequency17.clear();
        double double28 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        long long29 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        java.lang.Object obj30 = null;
        double double31 = frequency0.getPct(obj30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct((int) (byte) 10);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        frequency9.addValue(0L);
        double double17 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getCumPct((int) (short) 10);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency9);
        frequency9.addValue((java.lang.Integer) (-1));
        frequency9.addValue((java.lang.Integer) (-1));
        double double26 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n\t1\t50%\t100%\n");
        java.lang.String str27 = frequency9.toString();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCount((long) (short) 10);
        double double32 = frequency28.getCumPct((long) (byte) 10);
        frequency28.addValue(0L);
        boolean boolean36 = frequency28.equals((java.lang.Object) (byte) 1);
        long long38 = frequency28.getCount((int) (byte) 1);
        double double40 = frequency28.getCumPct((long) ' ');
        long long42 = frequency28.getCumFreq('a');
        long long43 = frequency9.getCumFreq((java.lang.Object) long42);
        java.lang.String str44 = frequency9.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3L + "'", long43 == 3L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n" + "'", str44, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n");
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        long long10 = frequency0.getCount((long) (short) 1);
        frequency0.addValue((java.lang.Integer) 0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long17 = frequency13.getCumFreq((int) '#');
        double double19 = frequency13.getCumPct((java.lang.Object) (short) 0);
        boolean boolean21 = frequency13.equals((java.lang.Object) 100.0d);
        double double23 = frequency13.getPct((int) (byte) 100);
        long long25 = frequency13.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = frequency0.equals((java.lang.Object) frequency13);
        frequency13.addValue(0L);
        double double30 = frequency13.getCumPct(' ');
        long long32 = frequency13.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long37 = frequency33.getCount('a');
        long long38 = frequency33.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor39 = frequency33.valuesIterator();
        long long41 = frequency33.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long42 = frequency33.getSumFreq();
        double double44 = frequency33.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency33.addValue((int) (short) 1);
        double double48 = frequency33.getPct((int) (byte) 100);
        boolean boolean49 = frequency13.equals((java.lang.Object) double48);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        frequency9.clear();
        long long17 = frequency9.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long19 = frequency9.getCumFreq(10);
        long long21 = frequency9.getCount(' ');
        boolean boolean22 = frequency0.equals((java.lang.Object) frequency9);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        frequency23.clear();
        long long26 = frequency23.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double28 = frequency23.getCumPct((java.lang.Object) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        long long31 = frequency29.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long33 = frequency29.getCumFreq((int) '#');
        double double35 = frequency29.getCumPct((java.lang.Object) (short) 0);
        boolean boolean37 = frequency29.equals((java.lang.Object) 100.0d);
        double double39 = frequency29.getPct((int) (byte) 100);
        long long41 = frequency29.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double43 = frequency29.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long44 = frequency23.getCumFreq((java.lang.Object) double43);
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        long long47 = frequency45.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long49 = frequency45.getCount('a');
        long long50 = frequency45.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor51 = frequency45.valuesIterator();
        long long53 = frequency45.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long55 = frequency45.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency56 = new org.apache.commons.math.stat.Frequency();
        frequency56.clear();
        frequency56.addValue('#');
        long long61 = frequency56.getCumFreq((int) (short) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor62 = frequency56.valuesIterator();
        double double64 = frequency56.getCumPct((long) '4');
        long long65 = frequency45.getCumFreq((java.lang.Object) '4');
        long long66 = frequency45.getSumFreq();
        long long68 = frequency45.getCumFreq(1);
        java.lang.Comparable<java.lang.String> strComparable69 = null;
        double double70 = frequency45.getCumPct(strComparable69);
        double double71 = frequency23.getPct((java.lang.Object) strComparable69);
        org.apache.commons.math.stat.Frequency frequency72 = new org.apache.commons.math.stat.Frequency();
        long long74 = frequency72.getCount((long) (short) 10);
        long long76 = frequency72.getCount(0L);
        frequency72.addValue((int) (short) 0);
        double double80 = frequency72.getCumPct(0);
        double double82 = frequency72.getCumPct('4');
        org.apache.commons.math.stat.Frequency frequency83 = new org.apache.commons.math.stat.Frequency();
        long long85 = frequency83.getCount((-1L));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor86 = frequency83.valuesIterator();
        frequency83.addValue((java.lang.Comparable<java.lang.String>) "");
        double double90 = frequency83.getPct((int) '4');
        double double92 = frequency83.getCumPct((-1));
        double double94 = frequency83.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long96 = frequency83.getCount((int) (short) 100);
        frequency72.addValue((java.lang.Object) long96);
        frequency23.addValue((java.lang.Object) long96);
        long long99 = frequency0.getCumFreq((java.lang.Object) long96);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor62);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor86);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 0L + "'", long96 == 0L);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + 0L + "'", long99 == 0L);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        boolean boolean8 = frequency0.equals((java.lang.Object) false);
        long long10 = frequency0.getCount((long) (short) 1);
        frequency0.addValue(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency0.valuesIterator();
        long long16 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue(0L);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCumFreq(' ');
        double double15 = frequency0.getPct('a');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq((long) (short) 1);
        double double20 = frequency16.getPct((long) (byte) 100);
        long long22 = frequency16.getCount((long) (byte) 1);
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency16);
        frequency0.addValue((long) 0);
        double double27 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        long long6 = frequency0.getCount(100);
        long long8 = frequency0.getCumFreq(1L);
        java.lang.String str9 = frequency0.toString();
        frequency0.addValue((long) (-1));
        long long13 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        long long15 = frequency0.getCumFreq('#');
        long long17 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCount((long) 1);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency9.valuesIterator();
        boolean boolean17 = frequency9.equals((java.lang.Object) false);
        double double18 = frequency0.getPct((java.lang.Object) boolean17);
        long long19 = frequency0.getSumFreq();
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        long long3 = frequency0.getCount((long) (byte) 0);
        long long5 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCount((long) (short) 10);
        double double10 = frequency6.getCumPct((long) (byte) 10);
        frequency6.addValue(0L);
        double double14 = frequency6.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency6.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long17 = frequency6.getSumFreq();
        long long19 = frequency6.getCumFreq(' ');
        double double21 = frequency6.getPct('a');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq((long) (short) 1);
        double double26 = frequency22.getPct((long) (byte) 100);
        long long28 = frequency22.getCount((long) (byte) 1);
        boolean boolean29 = frequency6.equals((java.lang.Object) frequency22);
        boolean boolean30 = frequency0.equals((java.lang.Object) frequency6);
        long long32 = frequency0.getCumFreq((int) (byte) 100);
        double double34 = frequency0.getPct((-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (byte) -1);
        frequency0.clear();
        java.lang.String str6 = frequency0.toString();
        long long8 = frequency0.getCount('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long7 = frequency3.getCount('a');
        long long8 = frequency3.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency3.valuesIterator();
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) long11);
        double double14 = frequency0.getCumPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long19 = frequency15.getCount('a');
        long long20 = frequency15.getSumFreq();
        long long22 = frequency15.getCumFreq('4');
        long long24 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long25 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.addValue((long) 'a');
        double double29 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((long) (short) 1);
        frequency30.addValue('a');
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency35.getCount('a');
        double double40 = frequency30.getCumPct((java.lang.Object) long39);
        long long41 = frequency30.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long46 = frequency42.getCumFreq((int) '#');
        double double48 = frequency42.getCumPct((java.lang.Object) (short) 0);
        boolean boolean50 = frequency42.equals((java.lang.Object) 100.0d);
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        long long53 = frequency51.getCount((long) (short) 10);
        double double55 = frequency51.getCumPct((long) (byte) 10);
        frequency51.addValue(0L);
        double double58 = frequency42.getCumPct((java.lang.Object) 0L);
        double double59 = frequency30.getPct((java.lang.Object) double58);
        double double61 = frequency30.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor62 = frequency30.valuesIterator();
        double double64 = frequency30.getCumPct(100);
        frequency30.addValue('a');
        double double68 = frequency30.getPct(100L);
        long long70 = frequency30.getCumFreq(0);
        boolean boolean71 = frequency0.equals((java.lang.Object) frequency30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor62);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long7 = frequency3.getCount('a');
        long long8 = frequency3.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency3.valuesIterator();
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) long11);
        double double14 = frequency0.getCumPct((int) (short) 100);
        double double16 = frequency0.getCumPct((int) '#');
        long long18 = frequency0.getCount((int) (short) 1);
        double double20 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.addValue((long) 10);
        long long26 = frequency0.getCount((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCumFreq((int) '#');
        double double6 = frequency0.getCumPct((java.lang.Object) (short) 0);
        boolean boolean8 = frequency0.equals((java.lang.Object) 100.0d);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        frequency9.addValue(0L);
        double double16 = frequency0.getCumPct((java.lang.Object) 0L);
        double double18 = frequency0.getCumPct((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCount((long) (short) 10);
        long long23 = frequency19.getCount(0L);
        frequency19.addValue((int) (short) 0);
        double double27 = frequency19.getPct((long) 10);
        double double29 = frequency19.getCumPct((long) (short) 100);
        boolean boolean30 = frequency0.equals((java.lang.Object) double29);
        frequency0.addValue('#');
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCumFreq((long) (short) 1);
        double double37 = frequency33.getPct((long) (byte) 100);
        long long39 = frequency33.getCumFreq((long) (short) 1);
        double double41 = frequency33.getPct((long) (byte) 1);
        double double43 = frequency33.getCumPct((int) (short) 0);
        frequency33.addValue((int) ' ');
        long long47 = frequency33.getCumFreq((int) (short) -1);
        long long48 = frequency33.getSumFreq();
        boolean boolean49 = frequency0.equals((java.lang.Object) long48);
        long long51 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCumFreq(' ');
        frequency0.addValue((java.lang.Integer) 1);
        double double17 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double19 = frequency0.getPct((int) (byte) 0);
        double double21 = frequency0.getCumPct('4');
        long long23 = frequency0.getCumFreq((long) (short) 0);
        frequency0.addValue(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCumFreq((long) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCumFreq((long) (short) 1);
        double double16 = frequency12.getPct((long) (byte) 100);
        frequency12.addValue((-1));
        double double20 = frequency12.getPct('4');
        java.lang.String str21 = frequency12.toString();
        long long23 = frequency12.getCumFreq(' ');
        double double24 = frequency0.getCumPct((java.lang.Object) ' ');
        long long26 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
        double double28 = frequency0.getCumPct((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        long long5 = frequency0.getCumFreq(' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10.0\t1\t100%\t100%\n");
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue((int) (short) -1);
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCount((java.lang.Object) 1.0f);
        double double9 = frequency0.getCumPct((long) '#');
        double double11 = frequency0.getPct((long) (short) -1);
        long long13 = frequency0.getCount((int) (byte) 100);
        double double15 = frequency0.getPct(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct(' ');
        double double8 = frequency0.getPct((int) (byte) 1);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        frequency0.addValue(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct('#');
        long long6 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        frequency0.addValue('#');
        long long5 = frequency0.getCumFreq((int) (short) 0);
        frequency0.clear();
        double double8 = frequency0.getCumPct((long) 0);
        frequency0.addValue((int) (byte) 1);
        long long12 = frequency0.getCumFreq('a');
        long long14 = frequency0.getCount((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        long long3 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = frequency0.equals((java.lang.Object) 2L);
        frequency0.addValue((int) (byte) 1);
        long long9 = frequency0.getCount((int) (short) 10);
        double double11 = frequency0.getPct((int) (byte) 1);
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        frequency0.addValue((int) '4');
        double double6 = frequency0.getPct((long) (byte) -1);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        double double13 = frequency0.getCumPct((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        long long5 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) (-1));
        long long8 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        long long13 = frequency9.getCumFreq((long) 'a');
        double double15 = frequency9.getPct((java.lang.Object) true);
        long long16 = frequency9.getSumFreq();
        double double18 = frequency9.getPct('#');
        long long19 = frequency9.getSumFreq();
        double double20 = frequency0.getCumPct((java.lang.Object) long19);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct((int) (byte) 10);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        frequency9.addValue(0L);
        double double17 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getCumPct((int) (short) 10);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency9);
        frequency9.addValue((java.lang.Integer) (-1));
        frequency9.addValue((java.lang.Integer) (-1));
        double double26 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n\t1\t50%\t100%\n");
        java.lang.String str27 = frequency9.toString();
        double double29 = frequency9.getPct((int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        long long7 = frequency0.getSumFreq();
        long long9 = frequency0.getCount('4');
        frequency0.addValue((long) '#');
        double double13 = frequency0.getCumPct('a');
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        frequency0.clear();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount('a');
        long long14 = frequency9.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency9.valuesIterator();
        long long17 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long19 = frequency9.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        frequency20.clear();
        frequency20.addValue('#');
        long long25 = frequency20.getCumFreq((int) (short) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency20.valuesIterator();
        double double28 = frequency20.getCumPct((long) '4');
        long long29 = frequency9.getCumFreq((java.lang.Object) '4');
        long long31 = frequency9.getCumFreq((int) (byte) -1);
        frequency9.addValue((long) (byte) 1);
        boolean boolean34 = frequency0.equals((java.lang.Object) frequency9);
        double double36 = frequency0.getCumPct((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        long long7 = frequency0.getCumFreq('4');
        double double9 = frequency0.getCumPct((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        frequency10.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency10.valuesIterator();
        double double14 = frequency10.getCumPct((int) (short) 0);
        double double16 = frequency10.getCumPct((int) (byte) 0);
        long long17 = frequency0.getCount((java.lang.Object) (byte) 0);
        double double19 = frequency0.getPct('#');
        double double21 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq((long) (short) 1);
        frequency22.addValue('a');
        long long28 = frequency22.getCount((int) (short) -1);
        long long30 = frequency22.getCumFreq(' ');
        long long32 = frequency22.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCumFreq((long) (short) 1);
        double double37 = frequency33.getPct((long) (byte) 100);
        frequency33.addValue((-1));
        double double41 = frequency33.getPct('4');
        long long43 = frequency33.getCount((int) (short) 100);
        long long44 = frequency22.getCount((java.lang.Object) long43);
        boolean boolean45 = frequency0.equals((java.lang.Object) frequency22);
        long long47 = frequency0.getCount('a');
        double double49 = frequency0.getCumPct((long) (byte) 100);
        long long51 = frequency0.getCount('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct((int) (byte) 10);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount((long) (short) 10);
        double double13 = frequency9.getCumPct((long) (byte) 10);
        frequency9.addValue(0L);
        double double17 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency9.getCumPct((int) (short) 10);
        boolean boolean20 = frequency0.equals((java.lang.Object) frequency9);
        long long22 = frequency9.getCumFreq(10);
        double double24 = frequency9.getCumPct('#');
        double double26 = frequency9.getPct((long) (-1));
        long long28 = frequency9.getCumFreq(10L);
        double double30 = frequency9.getPct(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        long long6 = frequency0.getCount((int) (short) -1);
        long long8 = frequency0.getCumFreq(' ');
        double double10 = frequency0.getPct('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((-1L));
        long long4 = frequency0.getCumFreq((long) 100);
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n");
        double double9 = frequency0.getCumPct((long) (short) 1);
        double double11 = frequency0.getCumPct('4');
        long long13 = frequency0.getCumFreq((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        double double6 = frequency0.getPct((long) (short) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        double double9 = frequency0.getPct(' ');
        long long11 = frequency0.getCount((int) (short) 100);
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((-1));
        double double8 = frequency0.getPct('4');
        java.lang.String str9 = frequency0.toString();
        double double11 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long13 = frequency0.getCumFreq('#');
        long long15 = frequency0.getCount(10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        long long3 = frequency0.getCount('a');
        double double5 = frequency0.getCumPct(' ');
        double double7 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        double double9 = frequency0.getPct((long) (byte) 1);
        double double11 = frequency0.getCumPct((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        frequency0.clear();
        long long9 = frequency0.getCount('4');
        double double11 = frequency0.getPct('#');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCumFreq((long) (short) 1);
        double double16 = frequency12.getPct((long) (byte) 100);
        long long18 = frequency12.getCumFreq((long) (short) 1);
        double double20 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double22 = frequency12.getCumPct('a');
        double double24 = frequency12.getCumPct((long) 100);
        frequency12.addValue((long) '4');
        double double27 = frequency0.getPct((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getPct((long) (byte) 100);
        frequency0.addValue(0);
        double double8 = frequency0.getCumPct((long) (byte) 100);
        long long10 = frequency0.getCumFreq((int) (short) -1);
        frequency0.addValue((int) (byte) -1);
        frequency0.addValue((long) (byte) 10);
        long long16 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct((int) (byte) 10);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        frequency9.clear();
        long long12 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double14 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long16 = frequency9.getCount(1);
        double double17 = frequency0.getCumPct((java.lang.Object) long16);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq((long) (short) 1);
        double double22 = frequency18.getPct((long) (byte) 100);
        long long24 = frequency18.getCount((long) (byte) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor25 = frequency18.valuesIterator();
        boolean boolean26 = frequency0.equals((java.lang.Object) frequency18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency0.getSumFreq();
        double double11 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long12 = frequency0.getSumFreq();
        double double14 = frequency0.getCumPct((long) (byte) 100);
        double double16 = frequency0.getPct(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount('a');
        long long5 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency0.valuesIterator();
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getCumPct(100);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((long) (short) 1);
        double double15 = frequency11.getPct((long) (byte) 100);
        frequency11.addValue(0);
        long long18 = frequency0.getCumFreq((java.lang.Object) 0);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq((long) (short) 1);
        frequency19.addValue('a');
        double double25 = frequency19.getCumPct('4');
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        long long28 = frequency26.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long30 = frequency26.getCount('a');
        long long31 = frequency26.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor32 = frequency26.valuesIterator();
        boolean boolean34 = frequency26.equals((java.lang.Object) false);
        long long36 = frequency26.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double38 = frequency26.getPct((int) (byte) -1);
        boolean boolean39 = frequency19.equals((java.lang.Object) frequency26);
        long long41 = frequency19.getCount((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCumFreq((long) (short) 1);
        double double46 = frequency42.getCumPct((int) (byte) -1);
        long long48 = frequency42.getCumFreq((long) 1);
        long long49 = frequency19.getCumFreq((java.lang.Object) long48);
        double double51 = frequency19.getCumPct('a');
        long long52 = frequency0.getCumFreq((java.lang.Object) double51);
        frequency0.clear();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n\t1\t100%\t100%\n");
        long long57 = frequency0.getCount((int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency5.getCount('a');
        double double10 = frequency0.getCumPct((java.lang.Object) long9);
        long long12 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((long) (short) 1);
        frequency13.addValue('a');
        boolean boolean19 = frequency13.equals((java.lang.Object) (short) 100);
        double double21 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        boolean boolean23 = frequency13.equals((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        boolean boolean24 = frequency0.equals((java.lang.Object) frequency13);
        java.lang.String str25 = frequency13.toString();
        // The following exception was thrown during execution in test generation
        try {
            frequency13.addValue((int) '4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (short) 10);
        double double4 = frequency0.getCumPct((long) (byte) 10);
        double double6 = frequency0.getCumPct(' ');
        frequency0.addValue((int) (byte) 0);
        double double10 = frequency0.getCumPct(1);
        double double12 = frequency0.getPct((int) (short) -1);
        long long14 = frequency0.getCount(0);
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t25%\t25%\n0\t2\t50%\t75%\n100\t1\t25%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((long) (short) 1);
        double double4 = frequency0.getCumPct((int) (byte) -1);
        frequency0.clear();
        frequency0.addValue((-1));
        frequency0.addValue(0);
        long long11 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t50%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency0.valuesIterator();
        double double14 = frequency0.getCumPct('4');
        frequency0.addValue((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }
}

