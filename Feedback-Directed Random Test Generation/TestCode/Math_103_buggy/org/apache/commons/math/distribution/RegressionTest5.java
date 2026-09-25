package org.apache.commons.math.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        normalDistributionImpl0.setMean((double) 10.0f);
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.getDomainUpperBound(107.9999995d);
        double double18 = normalDistributionImpl0.getDomainLowerBound((-232.5545660123448d));
        double double20 = normalDistributionImpl0.getDomainUpperBound((-96.51647299895313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 0.6335779670147943d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6335779670147943d + "'", double3 == 0.6335779670147943d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6335779670147943d + "'", double4 == 0.6335779670147943d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.016874569913920223d, 0.09784496952643981d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        normalDistributionImpl0.setMean((double) 0);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        normalDistributionImpl0.setMean(0.1586552539314552d);
        normalDistributionImpl0.setStandardDeviation((double) (short) 10);
        double double16 = normalDistributionImpl0.getDomainUpperBound(5.235623379731981d);
        double double18 = normalDistributionImpl0.getDomainUpperBound(0.6911813891867865d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability(0.8238384604739418d, 0.005584755914161965d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, 0.5d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.9772498680518191d);
        double double6 = normalDistributionImpl2.getInitialDomain(0.13817976716257963d);
        normalDistributionImpl2.setStandardDeviation(0.016874569913920223d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.5d + "'", double6 == 99.5d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7132926880482577d, 0.5067296854432923d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.626163656191395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double10 = normalDistributionImpl0.cumulativeProbability(0.022750131947946728d);
        double double13 = normalDistributionImpl0.cumulativeProbability((-0.46292344209430747d), 1.3877787807814457E-15d);
        double double15 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        normalDistributionImpl0.setStandardDeviation(0.7825286244460141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5090752066718058d + "'", double10 == 0.5090752066718058d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.17829037808686254d + "'", double13 == 0.17829037808686254d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation((double) (byte) 1);
        normalDistributionImpl2.setStandardDeviation(99.0d);
        normalDistributionImpl2.setMean(1.0000000000000027d);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getInitialDomain((-22.0d));
        double double13 = normalDistributionImpl2.getInitialDomain(0.5002593139679923d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0000000000000027d + "'", double9 == 1.0000000000000027d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-98.0d) + "'", double11 == (-98.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.9999999999999923d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(98.00000024999669d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(52.043795312542315d, 21.999999874017963d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setStandardDeviation(0.9672144728093757d);
        double double14 = normalDistributionImpl0.getDomainUpperBound(0.49225246095967057d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.4815117313668972d, 0.5039892761931579d);
        double double19 = normalDistributionImpl0.getDomainLowerBound(0.5000000000000011d);
        normalDistributionImpl0.setMean((-1.0000002290142127d));
        double double23 = normalDistributionImpl0.getDomainUpperBound(51.15865525393146d);
        double double25 = normalDistributionImpl0.cumulativeProbability((-1.6289393745373808d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999999857d + "'", double10 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.008142728696505674d + "'", double17 == 0.008142728696505674d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2577627251990481d + "'", double25 == 0.2577627251990481d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((-134.0d));
        double double7 = normalDistributionImpl0.cumulativeProbability((-0.40879584134842484d));
        double double8 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3413447460212585d + "'", double7 == 0.3413447460212585d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 52.0d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability((-2.6645352591003757E-15d));
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0025554529259099734d, (-1.7976931348623157E308d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989295186509837d, 0.6949742691024806d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getInitialDomain(96.91197076958201d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability(1.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setStandardDeviation(0.9672144728093757d);
        double double14 = normalDistributionImpl0.getDomainUpperBound(0.49225246095967057d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.4815117313668972d, 0.5039892761931579d);
        double double19 = normalDistributionImpl0.getDomainUpperBound(0.9999999177855301d);
        double double21 = normalDistributionImpl0.getDomainUpperBound(0.5078982664276976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999999857d + "'", double10 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.008142728696505674d + "'", double17 == 0.008142728696505674d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7132926880482577d, 0.9331927987311419d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 32.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(100.84134474606854d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15865525393145702d + "'", double4 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl0.getInitialDomain((double) 0);
        normalDistributionImpl0.setMean(2.476482021675316d);
        double double18 = normalDistributionImpl0.getDomainUpperBound(1.2187179204246186d);
        normalDistributionImpl0.setMean((-0.5335252424840331d));
        double double22 = normalDistributionImpl0.getDomainLowerBound(0.027951429579604725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.7976931348623157E308d) + "'", double22 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100L, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainLowerBound(9.0d);
        normalDistributionImpl2.setMean((double) (byte) 10);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getDomainUpperBound(52.0d);
        double double8 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-0.6928655717427847d));
        double double11 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.6928655717427847d) + "'", double11 == (-0.6928655717427847d));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d));
        normalDistributionImpl0.setMean((double) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(0.19461854718438854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.15865525393145702d + "'", double5 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getInitialDomain((double) (-1L));
        double double6 = normalDistributionImpl0.getInitialDomain(0.841344746068543d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) '4');
        double double15 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.cumulativeProbability(0.5437953125423168d);
        double double19 = normalDistributionImpl0.getDomainLowerBound(0.016520735180357682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2537871964019838d + "'", double17 == 0.2537871964019838d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (byte) 1);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.9999999999999857d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(5.5067062021407764E-14d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8413447460685395d + "'", double4 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        normalDistributionImpl0.setStandardDeviation((double) 100.0f);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        normalDistributionImpl0.setMean(0.04516050823921858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double5 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double7 = normalDistributionImpl0.getDomainLowerBound(0.15865525393145702d);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.6928655717427847d);
        normalDistributionImpl0.setMean(0.0d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.14960132485978395d, 0.6852679956977004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5039893591935787d + "'", double10 == 0.5039893591935787d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.19395216967774953d + "'", double15 == 0.19395216967774953d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getInitialDomain((double) (-1L));
        double double6 = normalDistributionImpl0.getInitialDomain(0.841344746068543d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) '4');
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(4.440892098500626E-16d);
        normalDistributionImpl0.setStandardDeviation(0.5190016920722009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-379.0d) + "'", double16 == (-379.0d));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5179888577970047d, 8.142728712651917E-5d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.9300927213513706d);
        double double10 = normalDistributionImpl0.getDomainLowerBound((-0.4375000003543076d));
        double double12 = normalDistributionImpl0.getDomainUpperBound((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4764820216753156d + "'", double8 == 0.4764820216753156d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.841344746068543d);
        double double7 = normalDistributionImpl0.getDomainLowerBound(53.0d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 100L);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.2537871964019838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5335252424840331d + "'", double5 == 0.5335252424840331d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999999982d + "'", double11 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-6.626193209403548d) + "'", double13 == (-6.626193209403548d));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.8462824029134881d);
        double double13 = normalDistributionImpl0.getInitialDomain(4.440892098500626E-16d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.8462824029134881d) + "'", double13 == (-0.8462824029134881d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getInitialDomain((double) 100L);
        double double10 = normalDistributionImpl0.getInitialDomain((-2.0d));
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.6949742691024806d);
        double double15 = normalDistributionImpl0.cumulativeProbability(1.3877787807814457E-15d, 0.44398253538906635d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.17147239464672015d + "'", double15 == 0.17147239464672015d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) '4');
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getDomainLowerBound(35.0d);
        double double13 = normalDistributionImpl0.getInitialDomain(0.849856080355926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 53.0d + "'", double13 == 53.0d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double8 = normalDistributionImpl0.cumulativeProbability((-2.6645352591003757E-15d));
        double double10 = normalDistributionImpl0.getDomainLowerBound((-0.47034574041634564d));
        double double11 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5437953125423168d);
        normalDistributionImpl0.setMean(0.8128379310305311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.49999999999999895d + "'", double8 == 0.49999999999999895d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, (double) 10.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.4764820216753156d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(1.5437953125423167d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.022750131947946728d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.32081094552894474d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5190016920722009d + "'", double4 == 0.5190016920722009d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5009075981689676d + "'", double8 == 0.5009075981689676d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        double double6 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        normalDistributionImpl0.setStandardDeviation(0.34134474606854304d);
        double double10 = normalDistributionImpl0.getDomainLowerBound((double) 100L);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.5039893563146316d);
        double double14 = normalDistributionImpl0.getDomainUpperBound(0.7999225850214973d);
        double double16 = normalDistributionImpl0.getInitialDomain(0.08814090355467952d);
        normalDistributionImpl0.setMean(1.3877787807814457E-15d);
        double double19 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9300927213513706d + "'", double12 == 0.9300927213513706d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.34134474606854304d) + "'", double16 == (-0.34134474606854304d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.3877787807814457E-15d + "'", double19 == 1.3877787807814457E-15d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.getDomainUpperBound(0.5000000000000006d);
        normalDistributionImpl0.setMean((-0.5258523486818338d));
        normalDistributionImpl0.setMean(0.06698251522395969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, 0.5d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.9772498680518191d);
        double double6 = normalDistributionImpl2.getInitialDomain(0.13817976716257963d);
        normalDistributionImpl2.setMean(0.0d);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.5d + "'", double6 == 99.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.940977201627452d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(102.39008757114912d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 53.70604135981212d + "'", double4 == 53.70604135981212d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.34134474606854304d);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainUpperBound((double) (short) 100);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.getDomainUpperBound(0.009999598292389552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.40879584134842484d) + "'", double10 == (-0.40879584134842484d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getDomainLowerBound(0.5335252424840331d);
        normalDistributionImpl0.setStandardDeviation(0.46052205565941057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-70.0d), 0.9772498680518209d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(1.5039893591935787d, 0.3735777632460221d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double3 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 1L);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (-1L));
        normalDistributionImpl0.setMean(1.5630297531363655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34134474606854304d + "'", double6 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) ' ');
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl0.getDomainLowerBound(0.003310888947959781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getDomainLowerBound(1.8413447447184879d);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.33328158569624255d);
        double double7 = normalDistributionImpl0.getDomainUpperBound(0.460172162722971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6305391309595061d + "'", double5 == 0.6305391309595061d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        double double6 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1));
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getInitialDomain(2.476482021675316d);
        double double13 = normalDistributionImpl0.getDomainLowerBound((double) 10L);
        double double15 = normalDistributionImpl0.getDomainLowerBound(0.5020761703704258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getDomainUpperBound(0.8413447460685395d);
        normalDistributionImpl0.setMean(101.84134474471848d);
        double double7 = normalDistributionImpl0.getInitialDomain(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(0.4753219195694117d, 0.5549508274208408d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.84134474471848d + "'", double7 == 100.84134474471848d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0034831747140742775d, (-0.46927155433491896d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.cumulativeProbability(0.10716473441117447d, 0.19286557206378513d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.00000022901422d), 101.84134474471848d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound(98.0d);
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getInitialDomain(0.04127665625834687d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.00000022901422d) + "'", double3 == (-1.00000022901422d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.00000022901422d) + "'", double5 == (-1.00000022901422d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.00000022901422d) + "'", double6 == (-1.00000022901422d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-102.8413449737327d) + "'", double8 == (-102.8413449737327d));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (byte) 1);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.7132926880482577d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double8 = normalDistributionImpl0.cumulativeProbability((-2.6645352591003757E-15d));
        double double10 = normalDistributionImpl0.getDomainLowerBound((-0.47034574041634564d));
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.49999999999999895d + "'", double8 == 0.49999999999999895d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        normalDistributionImpl0.setMean(1.0000002290141978d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) (-1.0f), (-0.6928655717427847d));
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.15865525393145702d + "'", double7 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.02249038756436722d + "'", double12 == 0.02249038756436722d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0000002290141978d + "'", double13 == 1.0000002290141978d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6928655717427847d, 0.2944537810110329d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.getDomainLowerBound((double) (byte) 0);
        double double18 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-0.6928655717427847d));
        double double22 = normalDistributionImpl0.inverseCumulativeProbability(0.4629234412743151d);
        double double24 = normalDistributionImpl0.getInitialDomain(0.0013557027715216385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.841344746068543d + "'", double18 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.7711708656947708d) + "'", double22 == (-0.7711708656947708d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.5342103178113278d) + "'", double24 == (-1.5342103178113278d));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(1.7976931348623157E308d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(1.0d);
        double double11 = normalDistributionImpl0.getInitialDomain(1.8413447447184879d);
        normalDistributionImpl0.setMean(1.5630297531363655d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.7067088325868973d, 26.207446677893802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double16 = normalDistributionImpl0.getDomainUpperBound((double) 1);
        double double18 = normalDistributionImpl0.getDomainLowerBound((double) (byte) -1);
        normalDistributionImpl0.setMean(52.0d);
        double double22 = normalDistributionImpl0.getInitialDomain(0.34134474606854304d);
        double double24 = normalDistributionImpl0.getDomainUpperBound(2.476482021675316d);
        double double26 = normalDistributionImpl0.inverseCumulativeProbability(0.5190016920722009d);
        double double28 = normalDistributionImpl0.inverseCumulativeProbability(0.5012252868335773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 51.15865525393146d + "'", double22 == 51.15865525393146d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.7976931348623157E308d + "'", double24 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 52.040088554316235d + "'", double26 == 52.040088554316235d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 52.00258406774183d + "'", double28 == 52.00258406774183d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        double double9 = normalDistributionImpl0.getDomainLowerBound((-0.0020007765459500422d));
        normalDistributionImpl0.setMean((double) 0.0f);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double16 = normalDistributionImpl0.cumulativeProbability((-2.6645352591003757E-15d), 0.5039893572282204d);
        double double17 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.cumulativeProbability(0.5630297531363655d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.841344746068543d + "'", double7 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.19286557206378513d + "'", double16 == 0.19286557206378513d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(98.0d, 1.0000002290141978d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability(1.0000000000000533d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1L), 0.15865525393145702d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.9999886040743466d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5033599228868442d);
        double double9 = normalDistributionImpl2.getDomainUpperBound((-0.001405534133834767d));
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.0353568855141011d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.15865525393145702d + "'", double3 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0000000000000027d + "'", double5 == 1.0000000000000027d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999992d + "'", double7 == 0.9999999999999992d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.7711708656947708d), 97.0d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(10.425045648316452d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(53.0d, 0.36296768069508856d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5039893591935787d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.46278541759824826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 53.0d + "'", double6 == 53.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.966091985533374d + "'", double8 == 52.966091985533374d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.cumulativeProbability(0.9772498680518209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8357772673710575d + "'", double6 == 0.8357772673710575d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double13 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl0.getInitialDomain(0.18900172977391094d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.0d) + "'", double17 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.00000022901422d), 101.84134474471848d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.5000000000000003d, 0.38553437808934676d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 100.0d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.cumulativeProbability(51.15865525393146d);
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.9561622798114716d);
        normalDistributionImpl2.setStandardDeviation(99.96689121910049d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-102.0d) + "'", double6 == (-102.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7024938097501251d + "'", double9 == 0.7024938097501251d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-2.0d) + "'", double11 == (-2.0d));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9912764293221792d, 0.46093430348510783d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.cumulativeProbability((double) 1);
        normalDistributionImpl0.setMean((double) 10L);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.841344746068543d + "'", double5 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double13 = normalDistributionImpl0.getInitialDomain(99.13261503789165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), (double) '#');
        double double4 = normalDistributionImpl2.cumulativeProbability(21.999999874017963d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        normalDistributionImpl2.setMean(0.539827837277029d);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.004362394360148403d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7444554667841599d + "'", double4 == 0.7444554667841599d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5113968002624507d + "'", double6 == 0.5113968002624507d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.539827837277029d + "'", double10 == 0.539827837277029d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.000000000000005d, 0.5390767201695538d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.16604236570913622d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.46092327983045134d + "'", double4 == 0.46092327983045134d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.767427300468364d, (-8.659739592076221E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.34134474606854304d);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainUpperBound((double) 10L);
        double double15 = normalDistributionImpl0.getInitialDomain(0.8413447460685395d);
        double double16 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-17.0d));
        double double21 = normalDistributionImpl0.cumulativeProbability((-0.5258523486818338d), 0.9672144727105174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.40879584134842484d) + "'", double10 == (-0.40879584134842484d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-3.3306690738754696E-15d) + "'", double21 == (-3.3306690738754696E-15d));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double10 = normalDistributionImpl0.getInitialDomain((-0.5335252424840331d));
        normalDistributionImpl0.setMean((-101.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.5923483481864061d, 0.06163769114152339d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) (-1), (double) 10);
        double double13 = normalDistributionImpl0.cumulativeProbability(97.0d);
        double double15 = normalDistributionImpl0.getDomainUpperBound(0.841344746068543d);
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.9310327308617734d);
        normalDistributionImpl0.setMean(0.49920180713065715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039893563146316d + "'", double8 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.04379531254231683d + "'", double11 == 0.04379531254231683d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8364569406723077d + "'", double13 == 0.8364569406723077d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 147.35266612983446d + "'", double17 == 147.35266612983446d);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 1.7976931348623157E308d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((double) 1L);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) 0, (double) 0.0f);
        normalDistributionImpl0.setStandardDeviation((double) ' ');
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 10.0f);
        double double14 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        normalDistributionImpl0.setMean((-102.0d));
        double double18 = normalDistributionImpl0.getInitialDomain(0.5369622222718954d);
        normalDistributionImpl0.setMean((-2.0d));
        double double22 = normalDistributionImpl0.getDomainLowerBound(1.1586552539314552d);
        double double24 = normalDistributionImpl0.getInitialDomain(0.4999999999999987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-70.0d) + "'", double18 == (-70.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-2.0d) + "'", double22 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-34.0d) + "'", double24 == (-34.0d));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8357772673710575d, 0.3216748491581869d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-100.00000003096761d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.03384577445442183d, (double) '#');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double8 = normalDistributionImpl0.getInitialDomain((double) (byte) 100);
        double double9 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', Double.POSITIVE_INFINITY);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(Double.NEGATIVE_INFINITY);
        normalDistributionImpl2.setMean(0.5079783137169019d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl0.getInitialDomain((double) 0);
        normalDistributionImpl0.setMean(2.476482021675316d);
        double double18 = normalDistributionImpl0.getDomainLowerBound((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.inverseCumulativeProbability(10.033845774454422d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.4909243752691879d, (-2.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double8 = normalDistributionImpl0.getInitialDomain((double) (byte) 100);
        double double10 = normalDistributionImpl0.getDomainUpperBound((-0.6928655717427847d));
        normalDistributionImpl0.setMean(1.515285376253715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0511737486529345d, 0.32170962220701427d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(99.13261503789165d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) '4');
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) '#');
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.5179888577970047d);
        normalDistributionImpl0.setMean(39.40780143634536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 760.5d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4835270010468724d, (double) 'a');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.008142728696505674d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double8 = normalDistributionImpl2.getInitialDomain((-0.8462824029134881d));
        normalDistributionImpl2.setMean(53.70604135981212d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-232.5545660123448d) + "'", double4 == (-232.5545660123448d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5390767201695538d + "'", double6 == 0.5390767201695538d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-96.51647299895313d) + "'", double8 == (-96.51647299895313d));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getInitialDomain((double) 100L);
        double double10 = normalDistributionImpl0.getInitialDomain((-2.0d));
        double double12 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.460172162722971d, 0.5000324847875128d);
        double double16 = normalDistributionImpl0.getMean();
        double double18 = normalDistributionImpl0.inverseCumulativeProbability(0.5347246918126093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5630297531363648d + "'", double12 == 0.5630297531363648d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.014170223115925196d + "'", double15 == 0.014170223115925196d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08715192668818052d + "'", double18 == 0.08715192668818052d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 1.0f);
        double double12 = normalDistributionImpl0.getInitialDomain(9.0d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.9331927987311419d);
        double double16 = normalDistributionImpl0.getDomainUpperBound(0.7825286244460141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.5000000483185494d + "'", double14 == 1.5000000483185494d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7545032643707585d, 0.007820771634638013d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.32170962220701427d);
        double double4 = normalDistributionImpl2.getInitialDomain(99.0d);
        normalDistributionImpl2.setMean((-32.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.32170962220702d + "'", double4 == 52.32170962220702d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6928655717427847d, 1.2187179204246186d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.0511737486529345d, 0.9912764293221792d);
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.022750131948267915d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29745625306511186d + "'", double5 == 0.29745625306511186d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.744570269210809d) + "'", double7 == (-1.744570269210809d));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 100.0d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.833281577979647d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.15865525393145702d, 0.8002173982368572d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 98.0d + "'", double4 == 98.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0025586716559338196d + "'", double7 == 0.0025586716559338196d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        normalDistributionImpl0.setStandardDeviation(0.9772498680518191d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.07830046923741085d);
        normalDistributionImpl0.setStandardDeviation(1.515285376253715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5319303980493209d + "'", double12 == 0.5319303980493209d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getDomainLowerBound(0.5335252424840331d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 760.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-7.0d));
        double double7 = normalDistributionImpl2.cumulativeProbability(0.0034831747140742775d, 7.9999995d);
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.46093430348510783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4910770351978331d + "'", double4 == 0.4910770351978331d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0041974136675052565d + "'", double7 == 0.0041974136675052565d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.34134474606854304d);
        normalDistributionImpl0.setStandardDeviation(0.5335252424840331d);
        double double14 = normalDistributionImpl0.getInitialDomain((double) (byte) 0);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.18900172977391094d);
        double double20 = normalDistributionImpl0.cumulativeProbability((-1.178290427844811d), 0.29745625306511186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.40879584134842484d) + "'", double10 == (-0.40879584134842484d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.5335252424840331d) + "'", double14 == (-0.5335252424840331d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5335252424840331d + "'", double15 == 0.5335252424840331d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.47034574041634564d) + "'", double17 == (-0.47034574041634564d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6978125443140764d + "'", double20 == 0.6978125443140764d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getInitialDomain(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation(1.0000002290141978d);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double15 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl0.getInitialDomain((double) 0);
        double double16 = normalDistributionImpl0.getDomainLowerBound((-1.3664220329852057d));
        double double18 = normalDistributionImpl0.getDomainUpperBound(0.005584755914161965d);
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0L, (double) '#');
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getDomainLowerBound(39.40780143634536d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.4375000003543076d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.36296768069508856d + "'", double5 == 0.36296768069508856d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.001405534133834767d), (-1.4629234420943074d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        normalDistributionImpl0.setStandardDeviation(0.626163656191395d);
        double double7 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.9999999999999982d), 0.332638201661949d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getDomainLowerBound(0.5039893572282204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability(0.4835270010468724d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6856392036308133d + "'", double8 == 0.6856392036308133d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.getInitialDomain(0.539827837277029d);
        double double19 = normalDistributionImpl0.getInitialDomain(1.2187179204246186d);
        double double21 = normalDistributionImpl0.cumulativeProbability(0.49836914509065217d);
        double double23 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.841344746068543d + "'", double17 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.841344746068543d + "'", double19 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7231913165985566d + "'", double21 == 0.7231913165985566d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.7976931348623157E308d) + "'", double23 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(7.724986805186719d);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.6689335370786698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.16195705239834d + "'", double7 == 8.16195705239834d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (byte) 1);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, (double) 10L);
        normalDistributionImpl2.setMean(0.6335779670147943d);
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.07830046923741085d);
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1586552539314552d + "'", double5 == 0.1586552539314552d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6335779670147943d + "'", double10 == 0.6335779670147943d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getDomainUpperBound(0.3190540115866386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        normalDistributionImpl0.setStandardDeviation((double) 100.0f);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double16 = normalDistributionImpl0.getInitialDomain(0.08814090355467952d);
        double double17 = normalDistributionImpl0.getStandardDeviation();
        double double18 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.841344746068543d) + "'", double16 == (-0.841344746068543d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.841344746068543d + "'", double17 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getDomainUpperBound(0.8413447460685395d);
        normalDistributionImpl0.setStandardDeviation(0.49219648948333194d);
        double double7 = normalDistributionImpl0.getInitialDomain(0.5113968002624507d);
        normalDistributionImpl0.setStandardDeviation(1.2745375447524006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.49219648948333194d + "'", double7 == 0.49219648948333194d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 52.0d);
        double double4 = normalDistributionImpl2.getInitialDomain((double) ' ');
        double double6 = normalDistributionImpl2.cumulativeProbability((-40.37958411457447d));
        normalDistributionImpl2.setStandardDeviation(0.15865525393146046d);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.9672144419306778d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getDomainLowerBound(100.84134474606854d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.21871792042461863d + "'", double6 == 0.21871792042461863d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15865525393146046d + "'", double11 == 0.15865525393146046d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getInitialDomain((double) 10);
        double double9 = normalDistributionImpl0.getInitialDomain((double) 10.0f);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.00000022901422d), 0.7077893259378197d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        normalDistributionImpl0.setMean((double) 0);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 1.0f);
        double double14 = normalDistributionImpl0.cumulativeProbability(1.0000000000000027d);
        normalDistributionImpl0.setMean((-52.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8413447460685436d + "'", double14 == 0.8413447460685436d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double16 = normalDistributionImpl0.getDomainUpperBound((double) 1);
        double double18 = normalDistributionImpl0.getDomainLowerBound((double) (byte) -1);
        normalDistributionImpl0.setMean(52.0d);
        double double22 = normalDistributionImpl0.getInitialDomain(0.34134474606854304d);
        double double24 = normalDistributionImpl0.getDomainLowerBound(0.9576315821652975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 51.15865525393146d + "'", double22 == 51.15865525393146d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getInitialDomain((double) (-1));
        normalDistributionImpl0.setStandardDeviation(0.44398253538906635d);
        double double12 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl0.getInitialDomain(1.0d);
        normalDistributionImpl0.setMean(6.382190473113489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.5560174646109337d) + "'", double14 == (-0.5560174646109337d));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getInitialDomain((double) 'a');
        double double7 = normalDistributionImpl0.cumulativeProbability(0.34134474606854304d);
        normalDistributionImpl0.setStandardDeviation(0.04280052354076347d);
        double double11 = normalDistributionImpl0.getDomainUpperBound((-0.9999999999999857d));
        double double13 = normalDistributionImpl0.getDomainUpperBound((-0.9119542294420955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6335779670147943d + "'", double7 == 0.6335779670147943d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 10);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        double double9 = normalDistributionImpl0.getDomainUpperBound(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double9 = normalDistributionImpl0.getDomainUpperBound(9.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.49920180713065715d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.34190547287645184d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.5204210845008567d);
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999982d + "'", double7 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6911813891867865d + "'", double11 == 0.6911813891867865d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.40726829578897483d) + "'", double13 == (-0.40726829578897483d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6986149411797485d + "'", double15 == 0.6986149411797485d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (byte) 1);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.9999999999999857d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(5.5067062021407764E-14d);
        normalDistributionImpl2.setStandardDeviation(32.0d);
        double double9 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.cumulativeProbability(0.004362394360148403d, 0.42504564831645186d);
        double double15 = normalDistributionImpl2.cumulativeProbability((-1.8073111898240968d), 0.49430730119340394d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8413447460685395d + "'", double4 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.005244479707643412d + "'", double12 == 0.005244479707643412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.028681936061948743d + "'", double15 == 0.028681936061948743d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double10 = normalDistributionImpl0.getDomainUpperBound(53.70604135981212d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.7231913165985566d);
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5923483481864061d + "'", double12 == 0.5923483481864061d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, 0.5d);
        normalDistributionImpl2.setStandardDeviation(0.9672144728093757d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.5649821857285307d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.5101471806611929d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation((double) '#');
        normalDistributionImpl0.setMean((-2.0d));
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.1384397057178155d);
        double double14 = normalDistributionImpl0.getDomainLowerBound(0.9999999999999857d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability((-0.6928655717427847d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) (byte) 1);
        double double8 = normalDistributionImpl0.getDomainUpperBound(1.0d);
        double double10 = normalDistributionImpl0.getInitialDomain(39.40780143634536d);
        double double12 = normalDistributionImpl0.getDomainLowerBound(6.382190473113489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.5630297531363648d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) '4');
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getInitialDomain(32.0d);
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double15 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 53.0d + "'", double11 == 53.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.33251112969510455d + "'", double15 == 0.33251112969510455d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7545032645970242d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.34134474606854326d), 0.08715192668818052d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) (-1), (double) 10);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.6887295588242259d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.getInitialDomain(5.235623381230277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039893563146316d + "'", double8 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.04379531254231683d + "'", double11 == 0.04379531254231683d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6887295588242259d + "'", double15 == 0.6887295588242259d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.31127044117577407d) + "'", double17 == (-0.31127044117577407d));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double13 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        normalDistributionImpl0.setMean(1.0d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl0.inverseCumulativeProbability((-32.77319104410122d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getDomainLowerBound(0.5335252424840331d);
        normalDistributionImpl0.setStandardDeviation(1.1586552539314552d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.8462824029134881d);
        normalDistributionImpl0.setMean((-94.72091334973283d));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.cumulativeProbability((double) 10, 0.9672144728093757d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.767427300468364d + "'", double12 == 0.767427300468364d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        normalDistributionImpl0.setMean((double) 0);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        normalDistributionImpl0.setMean(0.1586552539314552d);
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-0.1586552539314552d));
        double double17 = normalDistributionImpl0.getDomainLowerBound(0.5037571362866299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1586552539314552d + "'", double13 == 0.1586552539314552d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.1586552539314552d) + "'", double17 == (-0.1586552539314552d));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.03384577445442183d);
        double double15 = normalDistributionImpl0.getMean();
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double19 = normalDistributionImpl0.cumulativeProbability((-1.8725197565179101d), (-0.9772498680518209d));
        double double20 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.8270546735473194d) + "'", double14 == (-1.8270546735473194d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.13365536701172376d + "'", double19 == 0.13365536701172376d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) '4');
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getInitialDomain(0.05677831757821927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 51.0d + "'", double11 == 51.0d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 1L);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) (byte) 1);
        double double8 = normalDistributionImpl0.getDomainUpperBound(1.0d);
        double double10 = normalDistributionImpl0.getDomainLowerBound(1.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.014170223115925196d);
        double double14 = normalDistributionImpl0.getInitialDomain(0.19395216967774953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1621083255529453d + "'", double12 == 0.1621083255529453d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.19197964081699703d, 0.17147239464672015d);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.0000000000000417d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((-0.029504510652332394d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999987750020665d + "'", double4 == 0.9999987750020665d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9772498680518209d, (double) '#');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5649821857285307d);
        normalDistributionImpl2.setMean(1.4909243752691879d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getDomainUpperBound(10.0d);
        double double13 = normalDistributionImpl0.getDomainLowerBound((double) (short) 0);
        double double15 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double5 = normalDistributionImpl0.getDomainLowerBound(107.9999995d);
        double double7 = normalDistributionImpl0.getDomainLowerBound(1.0547118733938987E-15d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(51.46017216272297d, 99.15865525393146d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        normalDistributionImpl0.setMean(1.0000002290141978d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(35.53982783727703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.15865525393145702d + "'", double7 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.158655198516732d + "'", double11 == 0.158655198516732d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain(0.6928655717427847d);
        double double10 = normalDistributionImpl0.getInitialDomain(0.18900172977391094d);
        double double12 = normalDistributionImpl0.getDomainLowerBound((-0.1890019411112967d));
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1621083255529453d, 1.5039893591935787d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 1.0f);
        double double12 = normalDistributionImpl0.getInitialDomain(9.0d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getInitialDomain(0.6887295588242259d);
        normalDistributionImpl0.setMean((double) 100);
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getInitialDomain((double) 100L);
        double double10 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.5560172947841925d);
        normalDistributionImpl0.setMean(0.9672144419306778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double3 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 1L);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (-1L));
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getDomainUpperBound(35.0d);
        double double14 = normalDistributionImpl0.getDomainLowerBound((-0.46927155433491896d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34134474606854304d + "'", double6 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        double double10 = normalDistributionImpl0.getDomainLowerBound(0.8534106012131258d);
        double double12 = normalDistributionImpl0.getDomainLowerBound((-34.000000000000014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setStandardDeviation(101.84134474471848d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 32.00000000186288d);
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1272380622324158d + "'", double11 == 0.1272380622324158d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, 0.5d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.9772498680518191d);
        double double6 = normalDistributionImpl2.getInitialDomain(0.13817976716257963d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.9915778227237985d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.5d + "'", double6 == 99.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 101.19504378557457d + "'", double8 == 101.19504378557457d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        normalDistributionImpl0.setStandardDeviation((double) 10.0f);
        double double7 = normalDistributionImpl0.getInitialDomain(5.235623381230277d);
        double double9 = normalDistributionImpl0.getDomainLowerBound(37.31586539168706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.9672144728093757d);
        normalDistributionImpl0.setStandardDeviation(0.36296768069508856d);
        double double16 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.4994750760983072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) '4');
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getDomainLowerBound((-0.022750131743965903d));
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        normalDistributionImpl0.setStandardDeviation(0.40129367431689333d);
        normalDistributionImpl0.setMean(0.6188441725398591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        normalDistributionImpl0.setMean((double) 0);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        normalDistributionImpl0.setMean(0.1586552539314552d);
        normalDistributionImpl0.setStandardDeviation((double) (short) 10);
        double double16 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double18 = normalDistributionImpl0.getDomainLowerBound(0.6335779670147943d);
        double double20 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.1586552539314552d + "'", double18 == 0.1586552539314552d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + Double.NEGATIVE_INFINITY + "'", double20 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.009999799155206771d, 0.0017356300738194386d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.1384397057178155d, 0.46056912736572214d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1L), 0.15865525393145702d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.9999886040743466d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5033599228868442d);
        double double9 = normalDistributionImpl2.getDomainUpperBound((-0.001405534133834767d));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.00000022901422d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.15865525393145702d + "'", double3 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0000000000000027d + "'", double5 == 1.0000000000000027d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999992d + "'", double7 == 0.9999999999999992d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.5630297531363655d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getInitialDomain((double) (byte) 1);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.49430730119340394d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5630297531363655d + "'", double9 == 0.5630297531363655d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.5630297531363655d + "'", double11 == 1.5630297531363655d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4726052731926137d + "'", double13 == 0.4726052731926137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5630297531363655d + "'", double14 == 0.5630297531363655d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double4 = normalDistributionImpl0.getDomainLowerBound(98.0d);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.8462824029134881d);
        normalDistributionImpl0.setMean(1.0d);
        double double11 = normalDistributionImpl0.getDomainLowerBound(0.9300927213513706d);
        normalDistributionImpl0.setMean(0.0331087808995042d);
        normalDistributionImpl0.setMean((-6.626193209403548d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 100);
        normalDistributionImpl0.setMean(0.02249038756436722d);
        normalDistributionImpl0.setMean((-0.041303421663107937d));
        normalDistributionImpl0.setStandardDeviation(0.7564642865046136d);
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.041303421663107937d) + "'", double12 == (-0.041303421663107937d));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getInitialDomain((double) 100L);
        double double10 = normalDistributionImpl0.getInitialDomain((-2.0d));
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.6949742691024806d);
        double double15 = normalDistributionImpl0.cumulativeProbability(1.3877787807814457E-15d, 0.44398253538906635d);
        double double17 = normalDistributionImpl0.getInitialDomain((-46.292344127341295d));
        double double19 = normalDistributionImpl0.getDomainLowerBound(0.49836914509065217d);
        normalDistributionImpl0.setStandardDeviation(0.50001417944551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.17147239464672015d + "'", double15 == 0.17147239464672015d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.getDomainLowerBound((double) (byte) 0);
        double double18 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-0.6928655717427847d));
        double double22 = normalDistributionImpl0.cumulativeProbability(5.235623381230277d);
        double double24 = normalDistributionImpl0.getInitialDomain((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.841344746068543d + "'", double18 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9999999999990825d + "'", double22 == 0.9999999999990825d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.1484791743257583d + "'", double24 == 0.1484791743257583d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        double double5 = normalDistributionImpl0.getDomainUpperBound(0.49664007711314156d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.cumulativeProbability(0.6949742691024806d, 0.5351176567327576d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (short) 100);
        double double9 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.14292619921699057d, 0.00455177468255985d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getInitialDomain(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation(1.0000002290141978d);
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation(0.5385119190840452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double8 = normalDistributionImpl0.cumulativeProbability(0.841344746068543d);
        normalDistributionImpl0.setMean((-34.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7999225850214973d + "'", double8 == 0.7999225850214973d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        normalDistributionImpl0.setMean((double) 10.0f);
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.32170962220701427d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.5039893591935787d);
        normalDistributionImpl0.setStandardDeviation(0.30994345175360016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3877787807814457E-15d + "'", double14 == 1.3877787807814457E-15d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getDomainLowerBound((-1.7976931348623157E308d));
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.5549508274208408d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.44398253538906635d, 1.7763568394002505E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.13817976725466335d + "'", double12 == 0.13817976725466335d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        normalDistributionImpl0.setMean((double) 10.0f);
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.4629234412743151d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4629234412743151d + "'", double16 == 0.4629234412743151d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) 0, (double) 0.0f);
        normalDistributionImpl0.setStandardDeviation((double) ' ');
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 10.0f);
        double double14 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        normalDistributionImpl0.setMean((-102.0d));
        normalDistributionImpl0.setStandardDeviation(98.0d);
        double double20 = normalDistributionImpl0.getDomainLowerBound(0.5000000000001014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-102.0d) + "'", double20 == (-102.0d));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999982d, (double) (byte) 10);
        normalDistributionImpl2.setMean(0.03384577445442183d);
        double double6 = normalDistributionImpl2.getInitialDomain((double) ' ');
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.6305391309595061d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.803342433257463d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.5560172947841925d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.033845774454422d + "'", double6 == 10.033845774454422d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.3666614970371613d + "'", double8 == 3.3666614970371613d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03384577445442183d + "'", double10 == 0.03384577445442183d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability(5.5067062021407764E-14d, 0.9672144728093757d);
        normalDistributionImpl0.setMean(0.8002173982368572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.33328158569624255d + "'", double6 == 0.33328158569624255d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getDomainUpperBound(10.0d);
        normalDistributionImpl0.setStandardDeviation(0.9999999999999909d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.5012252868335773d);
        double double17 = normalDistributionImpl0.getDomainUpperBound((-94.72091334973283d));
        double double19 = normalDistributionImpl0.getDomainLowerBound(96.53707655872569d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl0.cumulativeProbability(32.00000000186288d, 2.4424906541753444E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.9969286478819417d) + "'", double15 == (-0.9969286478819417d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double8 = normalDistributionImpl0.getDomainUpperBound(10.0d);
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 100);
        double double7 = normalDistributionImpl0.getDomainUpperBound((double) '#');
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.6887295588242259d);
        normalDistributionImpl0.setStandardDeviation(0.04280052354076347d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.49225246299399095d + "'", double9 == 0.49225246299399095d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.04280052354076347d + "'", double12 == 0.04280052354076347d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(1.7976931348623157E308d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.49999999999999895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) 0, (double) 0.0f);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.9999999999999982d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.4482834616034214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.9999995d + "'", double7 == 107.9999995d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.87000062751792d + "'", double9 == 99.87000062751792d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getDomainUpperBound(35.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.23715036381503607d, 33.0d);
        double double13 = normalDistributionImpl0.getInitialDomain(32.00000000186288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.10801563252206647d + "'", double11 == 0.10801563252206647d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getDomainLowerBound((-1.7976931348623157E308d));
        double double11 = normalDistributionImpl0.cumulativeProbability(0.14292619921699057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.556825766495652d + "'", double11 == 0.556825766495652d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getInitialDomain((double) (-1));
        double double10 = normalDistributionImpl0.getDomainLowerBound(0.8932864061550885d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.039410860501703615d, 0.5009075981689676d);
        double double15 = normalDistributionImpl0.getDomainLowerBound(5.046384359168599E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.08261711626635315d + "'", double13 == 0.08261711626635315d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getInitialDomain(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation(1.0000002290141978d);
        double double11 = normalDistributionImpl0.getDomainLowerBound((double) 100L);
        normalDistributionImpl0.setMean(0.9999887564842955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 0.7444554667841599d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.022750131947946728d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(960.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.6335779670147943d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04379531254231683d, 52.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(4.440892098500626E-16d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.5335252424840331d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4996640038501735d + "'", double4 == 0.4996640038501735d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5037571362866299d + "'", double6 == 0.5037571362866299d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.00000022901422d), 101.84134474471848d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound(98.0d);
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getDomainUpperBound(99.96689121910049d);
        normalDistributionImpl2.setStandardDeviation(0.7545032645970242d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.00000022901422d) + "'", double3 == (-1.00000022901422d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.00000022901422d) + "'", double5 == (-1.00000022901422d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.00000022901422d) + "'", double6 == (-1.00000022901422d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-87.5162637075864d), 0.38553437808934676d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation((double) '#');
        normalDistributionImpl0.setMean((-2.0d));
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.1384397057178155d);
        normalDistributionImpl0.setStandardDeviation(0.5560172947841925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.539827837277029d, 0.6188441725398591d);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.000000000000005d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7714405704162621d + "'", double4 == 0.7714405704162621d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.5d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.0511737486529345d, 0.833281577979647d);
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5039893563146316d + "'", double10 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0031201203477648765d + "'", double15 == 0.0031201203477648765d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getDomainLowerBound(0.841344746068543d);
        double double10 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.0511737486529345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5204064650154359d + "'", double12 == 0.5204064650154359d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 760.0d);
        double double5 = normalDistributionImpl2.cumulativeProbability(2.4424906541753444E-15d, 0.4764820216753156d);
        double double7 = normalDistributionImpl2.getInitialDomain((-180.67351318541074d));
        double double9 = normalDistributionImpl2.getInitialDomain((-0.001405534133834767d));
        double double11 = normalDistributionImpl2.cumulativeProbability(32.00000000186288d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.5009623880051235E-4d + "'", double5 == 2.5009623880051235E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-750.0d) + "'", double7 == (-750.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-750.0d) + "'", double9 == (-750.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5115467165525207d + "'", double11 == 0.5115467165525207d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double8 = normalDistributionImpl0.getDomainUpperBound(10.0d);
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getInitialDomain((double) (-1L));
        double double6 = normalDistributionImpl0.getInitialDomain(0.841344746068543d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.5039893591935787d);
        normalDistributionImpl0.setMean(0.19791591811047926d);
        double double18 = normalDistributionImpl0.getDomainUpperBound(0.5000000000001014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.00999980637267d + "'", double14 == 35.00999980637267d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 100.0d);
        double double4 = normalDistributionImpl2.getInitialDomain((double) 0.0f);
        double double6 = normalDistributionImpl2.getInitialDomain((-3.004834203322146d));
        double double8 = normalDistributionImpl2.getDomainUpperBound((-0.5560174646109337d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-102.0d) + "'", double4 == (-102.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-102.0d) + "'", double6 == (-102.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(52.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getDomainUpperBound((-96.51647299895313d));
        double double12 = normalDistributionImpl0.getDomainUpperBound(Double.NaN);
        double double14 = normalDistributionImpl0.getInitialDomain(101.84134474471848d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.getDomainLowerBound(0.5971351358203263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) 0L);
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.9999999999999982d);
        double double12 = normalDistributionImpl0.getInitialDomain((-232.5545660123448d));
        double double14 = normalDistributionImpl0.getDomainLowerBound(0.4835270010468724d);
        double double16 = normalDistributionImpl0.getDomainLowerBound(0.9999999999999982d);
        double double17 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.9999999999999982d) + "'", double12 == (-0.9999999999999982d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        double double6 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1));
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getInitialDomain(2.476482021675316d);
        double double13 = normalDistributionImpl0.getDomainLowerBound((double) 10L);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.5039893591935787d, 9.0d);
        normalDistributionImpl0.setStandardDeviation(98.00000024999669d);
        double double20 = normalDistributionImpl0.inverseCumulativeProbability(6.374484273763414E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.03384577445442183d + "'", double16 == 0.03384577445442183d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-630.1534266828165d) + "'", double20 == (-630.1534266828165d));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0012125417630083346d, 0.514962869602436d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain((double) 10.0f);
        double double12 = normalDistributionImpl0.cumulativeProbability((-0.40879584134842484d));
        normalDistributionImpl0.setMean((double) (short) 0);
        normalDistributionImpl0.setStandardDeviation(1.5d);
        double double18 = normalDistributionImpl0.getDomainLowerBound((-70.0d));
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3413447460212585d + "'", double12 == 0.3413447460212585d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double13 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl0.getInitialDomain(0.18900172977391094d);
        double double19 = normalDistributionImpl0.getDomainLowerBound(50.99999977098578d);
        double double21 = normalDistributionImpl0.getDomainUpperBound(0.8364569406723077d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl0.inverseCumulativeProbability(101.68745699125691d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.0d) + "'", double17 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.44398253538906635d);
        double double12 = normalDistributionImpl0.getDomainUpperBound(0.1885575583850198d);
        normalDistributionImpl0.setMean(0.24419695862220786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9256280559645881d + "'", double10 == 0.9256280559645881d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.5630297531363655d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getInitialDomain(0.5369622222718954d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5630297531363655d + "'", double9 == 0.5630297531363655d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.5630297531363655d + "'", double11 == 1.5630297531363655d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5630297531363655d + "'", double13 == 0.5630297531363655d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((-134.0d));
        double double7 = normalDistributionImpl0.cumulativeProbability((-0.40879584134842484d));
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3413447460212585d + "'", double7 == 0.3413447460212585d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(51.0d, 0.32170962220701427d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound((-180.67351318541074d));
        double double7 = normalDistributionImpl2.getInitialDomain(0.7109004840784187d);
        normalDistributionImpl2.setMean(99.96689121910049d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 51.0d + "'", double3 == 51.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 51.32170962220702d + "'", double7 == 51.32170962220702d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5d);
        double double8 = normalDistributionImpl0.getInitialDomain(Double.POSITIVE_INFINITY);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getInitialDomain(0.15865525393145702d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.9327407950362647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.5d + "'", double8 == 1.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.5d) + "'", double11 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.9965192453062046d + "'", double13 == 1.9965192453062046d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.07830046923741085d, 0.0331087808995042d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double7 = normalDistributionImpl0.getInitialDomain(0.0353568855141011d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(35.97724986805182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) '4');
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getDomainUpperBound(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.1586552539314552d);
        double double15 = normalDistributionImpl0.getInitialDomain(0.5649821857469615d);
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.3413447460212585d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.99999977098578d + "'", double13 == 50.99999977098578d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 53.0d + "'", double15 == 53.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 51.59120415852272d + "'", double17 == 51.59120415852272d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) '4');
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getDomainLowerBound((-0.022750131743965903d));
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.getDomainUpperBound((-0.4308696242628095d));
        double double17 = normalDistributionImpl0.getDomainLowerBound(0.5067296854432923d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.cumulativeProbability(0.531586558835401d, 0.9772498680518191d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getDomainLowerBound(99.0d);
        normalDistributionImpl0.setMean(1.3877787807814457E-15d);
        double double11 = normalDistributionImpl0.getInitialDomain(0.5009075981689676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0000000000000013d + "'", double11 == 1.0000000000000013d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        double double5 = normalDistributionImpl0.getDomainUpperBound(0.49664007711314156d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 10);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        double double11 = normalDistributionImpl0.getInitialDomain(0.07830046923741085d);
        normalDistributionImpl0.setStandardDeviation((double) 10);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getInitialDomain(0.6887295588242259d);
        normalDistributionImpl0.setStandardDeviation(1.000000000000008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getDomainLowerBound(0.9672144419306778d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability((-630.1534266828165d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        double double6 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1));
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getInitialDomain(2.476482021675316d);
        double double13 = normalDistributionImpl0.getDomainLowerBound((double) 10L);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.5039893591935787d, 9.0d);
        double double18 = normalDistributionImpl0.getDomainUpperBound((double) (short) -1);
        double double20 = normalDistributionImpl0.getInitialDomain(0.9772498680518191d);
        double double22 = normalDistributionImpl0.getDomainLowerBound(0.5204210845008567d);
        normalDistributionImpl0.setMean(0.039410860501703615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.03384577445442183d + "'", double16 == 0.03384577445442183d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) 0L);
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getDomainUpperBound(0.15865525393145702d);
        double double12 = normalDistributionImpl0.getInitialDomain(0.6188441725398591d);
        normalDistributionImpl0.setMean(0.7444554667841599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double10 = normalDistributionImpl0.getDomainUpperBound(53.70604135981212d);
        double double12 = normalDistributionImpl0.getDomainLowerBound(6.5503158452884236E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) (byte) 1);
        double double8 = normalDistributionImpl0.getDomainUpperBound(1.0d);
        double double10 = normalDistributionImpl0.getInitialDomain(0.9683995573223384d);
        double double12 = normalDistributionImpl0.cumulativeProbability(5.235623381230277d);
        double double14 = normalDistributionImpl0.getInitialDomain(0.8357772673710571d);
        double double16 = normalDistributionImpl0.getDomainLowerBound((-134.0d));
        normalDistributionImpl0.setMean(1.4439826508193312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999886040743466d + "'", double12 == 0.9999886040743466d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double9 = normalDistributionImpl0.getDomainUpperBound(9.0d);
        double double10 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999982d + "'", double7 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.cumulativeProbability(0.9986521648862225d, 0.5007483786067086d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability(0.4835270010468724d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6856392036308133d + "'", double8 == 0.6856392036308133d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double8 = normalDistributionImpl0.getDomainUpperBound(10.0d);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 'a');
        normalDistributionImpl0.setStandardDeviation(0.4815117313668972d);
        double double13 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4815117313668972d + "'", double14 == 0.4815117313668972d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl0.setStandardDeviation((double) (short) 10);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.19146246127401323d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(0.9310327308617734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.841344746068543d + "'", double7 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-8.72519706073979d) + "'", double11 == (-8.72519706073979d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getInitialDomain(0.0d);
        normalDistributionImpl0.setMean(0.5039893563146316d);
        double double15 = normalDistributionImpl0.cumulativeProbability((-1.0d));
        normalDistributionImpl0.setMean(0.5649821857469615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.06629205366693347d + "'", double15 == 0.06629205366693347d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.009999799155206771d);
        normalDistributionImpl0.setMean(0.6233479763570439d);
        normalDistributionImpl0.setMean((-1.6693833595271779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5039892761931579d + "'", double13 == 0.5039892761931579d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double5 = normalDistributionImpl0.cumulativeProbability(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4753219195694117d, 0.841344746068543d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.5749543516835338d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) (-1), (double) 10);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getInitialDomain(0.34134474606854304d);
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(0.026049931177070385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039893563146316d + "'", double8 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.04379531254231683d + "'", double11 == 0.04379531254231683d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-101.0d) + "'", double14 == (-101.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-195.23076923159354d) + "'", double16 == (-195.23076923159354d));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound(1.7976931348623157E308d);
        double double6 = normalDistributionImpl0.cumulativeProbability(0.7825286244460141d, 0.8413447460685395d);
        double double8 = normalDistributionImpl0.getInitialDomain(0.23715036381503607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.016874569913920223d + "'", double6 == 0.016874569913920223d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4835270010468724d, (double) 'a');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.008142728696505674d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.5078982664276976d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-232.5545660123448d) + "'", double4 == (-232.5545660123448d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4835270010468724d + "'", double6 == 0.4835270010468724d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        normalDistributionImpl0.setMean(1.0000002290141978d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) (-1.0f), (-0.6928655717427847d));
        normalDistributionImpl0.setStandardDeviation(10.187591005088953d);
        double double16 = normalDistributionImpl0.getDomainUpperBound((-1.4439825353890663d));
        double double17 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.15865525393145702d + "'", double7 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.02249038756436722d + "'", double12 == 0.02249038756436722d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0000002290141978d + "'", double16 == 1.0000002290141978d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0000002290141978d + "'", double17 == 1.0000002290141978d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double7 = normalDistributionImpl0.cumulativeProbability((-8.72519706073979d));
        double double9 = normalDistributionImpl0.getInitialDomain(0.5347246918126093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.841344746068543d + "'", double5 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.771561172376096E-16d + "'", double7 == 7.771561172376096E-16d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getInitialDomain((double) (-1));
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.cumulativeProbability((-0.9999999999999982d), 0.5037571362866299d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.32170962220701427d);
        double double16 = normalDistributionImpl0.getDomainUpperBound(0.4920216871848292d);
        double double18 = normalDistributionImpl0.getDomainUpperBound((-17.0d));
        double double20 = normalDistributionImpl0.getInitialDomain((-3.1086244689504383E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4336780442119579d + "'", double12 == 0.4336780442119579d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.4629234420943074d) + "'", double14 == (-1.4629234420943074d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-2.0d) + "'", double20 == (-2.0d));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double16 = normalDistributionImpl0.getDomainUpperBound((double) 1);
        double double17 = normalDistributionImpl0.getMean();
        double double19 = normalDistributionImpl0.cumulativeProbability((-1.3664220329852057d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.05217799096267245d + "'", double19 == 0.05217799096267245d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation((double) '#');
        normalDistributionImpl0.setMean((double) '4');
        double double12 = normalDistributionImpl0.getDomainUpperBound((-101.0d));
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.4965191939515398d);
        double double16 = normalDistributionImpl0.cumulativeProbability(96.91197076958201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 51.69461808527802d + "'", double14 == 51.69461808527802d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9002888457443755d + "'", double16 == 0.9002888457443755d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49836914509065217d, 0.4629234412743151d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4629234412743151d + "'", double3 == 0.4629234412743151d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double11 = normalDistributionImpl0.getInitialDomain(0.005584755914161965d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.7207300628691058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.15865525393145702d + "'", double9 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7644621939160263d + "'", double13 == 0.7644621939160263d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double6 = normalDistributionImpl0.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        double double6 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        normalDistributionImpl0.setStandardDeviation(0.34134474606854304d);
        double double10 = normalDistributionImpl0.getDomainLowerBound((double) 100L);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.5039893563146316d);
        double double14 = normalDistributionImpl0.getDomainUpperBound(0.7999225850214973d);
        double double16 = normalDistributionImpl0.getInitialDomain(3.905597674495054E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9300927213513706d + "'", double12 == 0.9300927213513706d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.34134474606854304d) + "'", double16 == (-0.34134474606854304d));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(0.6335779670147943d);
        normalDistributionImpl0.setStandardDeviation(0.24419695862220786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5039893563146316d + "'", double10 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double8 = normalDistributionImpl0.getDomainUpperBound(10.0d);
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainUpperBound(2.6645352591003757E-15d);
        double double15 = normalDistributionImpl0.getDomainLowerBound((-1.0d));
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double18 = normalDistributionImpl0.getInitialDomain(0.0017356300738194386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getInitialDomain(0.004362394360148403d);
        double double11 = normalDistributionImpl0.getDomainUpperBound(0.9576315821652975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, 0.5d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.9772498680518191d);
        double double6 = normalDistributionImpl2.getInitialDomain(0.13817976716257963d);
        normalDistributionImpl2.setMean(0.0d);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainUpperBound(760.0d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.5d + "'", double6 == 99.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl0.setStandardDeviation((double) (short) 10);
        normalDistributionImpl0.setMean(0.34134474606854304d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.5369622222718954d, 98.0000002260757d);
        double double16 = normalDistributionImpl0.getInitialDomain((-0.841344746068543d));
        normalDistributionImpl0.setMean((-8.72519706073979d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.841344746068543d + "'", double7 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.49219648948333194d + "'", double14 == 0.49219648948333194d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.658655253931457d) + "'", double16 == (-9.658655253931457d));
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 32.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15865525393145702d + "'", double4 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        double double5 = normalDistributionImpl0.getInitialDomain((double) (byte) 0);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.5267022066435871d);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0000000000000004d + "'", double10 == 1.0000000000000004d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) 0, (double) 0.0f);
        normalDistributionImpl0.setStandardDeviation((double) ' ');
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 10.0f);
        double double14 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        normalDistributionImpl0.setMean((-102.0d));
        normalDistributionImpl0.setStandardDeviation(98.0d);
        double double20 = normalDistributionImpl0.getDomainLowerBound(5.235623379731981d);
        double double23 = normalDistributionImpl0.cumulativeProbability(0.03384577445442183d, 0.46278541759824826d);
        double double25 = normalDistributionImpl0.inverseCumulativeProbability(0.19286557206378513d);
        double double27 = normalDistributionImpl0.inverseCumulativeProbability(0.8128379310305311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-102.0d) + "'", double20 == (-102.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0010132069500200513d + "'", double23 == 0.0010132069500200513d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-187.0037217162737d) + "'", double25 == (-187.0037217162737d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-14.936528911248349d) + "'", double27 == (-14.936528911248349d));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.49601064080642143d), 0.1586552539314552d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1L), 0.15865525393145702d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.803342433257463d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.841344746068543d) + "'", double4 == (-0.841344746068543d));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.getInitialDomain(0.539827837277029d);
        double double19 = normalDistributionImpl0.getInitialDomain(1.2187179204246186d);
        double double21 = normalDistributionImpl0.cumulativeProbability(0.49836914509065217d);
        double double23 = normalDistributionImpl0.getInitialDomain(0.08261711626635315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.841344746068543d + "'", double17 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.841344746068543d + "'", double19 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7231913165985566d + "'", double21 == 0.7231913165985566d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.841344746068543d) + "'", double23 == (-0.841344746068543d));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9772498680518209d, (double) '#');
        normalDistributionImpl2.setStandardDeviation(0.5389722223307996d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 1.7976931348623157E308d);
        normalDistributionImpl2.setMean(0.0353568855141011d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((-18.900193952494813d));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0353568855141011d + "'", double6 == 0.0353568855141011d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 0.6335779670147943d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getDomainUpperBound((-0.4375000003543076d));
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6335779670147943d + "'", double3 == 0.6335779670147943d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6335779670147943d + "'", double6 == 0.6335779670147943d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.7545032645970242d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.cumulativeProbability(0.5649821857469615d, 0.03384577445442183d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7747264570828358d + "'", double5 == 0.7747264570828358d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9772498680518209d, (double) '#');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.0331087808995042d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double8 = normalDistributionImpl2.getInitialDomain((-22.0d));
        double double10 = normalDistributionImpl2.getInitialDomain(98.0000002260757d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-1.354472090042691E-14d));
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.4914968739893107d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9772498680518209d + "'", double4 == 0.9772498680518209d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-34.02275013194818d) + "'", double8 == (-34.02275013194818d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.97724986805182d + "'", double10 == 35.97724986805182d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9772498680518209d + "'", double14 == 0.9772498680518209d);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.02249038756436722d, 1.4439826508193312d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.8534106012131258d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02249038756436722d + "'", double4 == 0.02249038756436722d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(52.0d);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5039893591935787d);
        double double8 = normalDistributionImpl0.getInitialDomain(0.49800529690925915d);
        normalDistributionImpl0.setStandardDeviation(0.38553437808934676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.4960106408064213d) + "'", double8 == (-0.4960106408064213d));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getDomainUpperBound((double) 100.0f);
        normalDistributionImpl0.setMean(0.49800211262029165d);
        double double11 = normalDistributionImpl0.getDomainUpperBound((-18.43250397293373d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.49800211262029165d + "'", double11 == 0.49800211262029165d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005244479707643412d, (-1.7444554667841599d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        double double15 = normalDistributionImpl0.cumulativeProbability(1.3877787807814457E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5000000000000006d + "'", double15 == 0.5000000000000006d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (byte) 1);
        normalDistributionImpl2.setStandardDeviation(0.9999999999999857d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((-0.9772498680518209d));
        double double9 = normalDistributionImpl2.cumulativeProbability(0.0d, 2.4424906541753444E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.992007221626409E-16d + "'", double9 == 9.992007221626409E-16d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.34134474606854304d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 0.0f);
        double double15 = normalDistributionImpl0.getInitialDomain(0.5630297531363648d);
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, 0.5d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.9772498680518191d);
        double double6 = normalDistributionImpl2.getInitialDomain(0.13817976716257963d);
        normalDistributionImpl2.setMean(0.0d);
        double double9 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(101.68745699125691d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.5d + "'", double6 == 99.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04379531254231683d, 52.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(4.440892098500626E-16d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.5335252424840331d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4996640038501735d + "'", double4 == 0.4996640038501735d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5037571362866299d + "'", double6 == 0.5037571362866299d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5d);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.5022461518692317d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.49800529690925915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5056303509274056d + "'", double8 == 0.5056303509274056d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.49920422912796364d + "'", double10 == 0.49920422912796364d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainLowerBound((-0.46292344209430747d));
        double double10 = normalDistributionImpl0.cumulativeProbability(0.8469122021505918d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.0439242982498218d, 0.022750119583482997d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.967620067014014d + "'", double10 == 0.967620067014014d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4996640038501735d, 51.0d);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.5155415382220611d);
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.7545032645970242d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4996640038501735d + "'", double3 == 0.4996640038501735d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4996640038501735d + "'", double7 == 0.4996640038501735d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getInitialDomain((double) 10);
        double double9 = normalDistributionImpl0.getInitialDomain((double) 10.0f);
        double double11 = normalDistributionImpl0.getInitialDomain(0.539827837277029d);
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.6261504832985307d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) 0L);
        normalDistributionImpl0.setStandardDeviation((double) (byte) 10);
        double double9 = normalDistributionImpl0.getInitialDomain(0.009999799155206771d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.3413447460685406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.513615041133066d + "'", double11 == 0.513615041133066d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49685365230961037d, 0.19197964081699703d);
        normalDistributionImpl2.setStandardDeviation(0.0331087808995042d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double4 = normalDistributionImpl0.getDomainLowerBound(98.0d);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.8462824029134881d);
        normalDistributionImpl0.setMean((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1L), 0.15865525393145702d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.9999886040743466d);
        normalDistributionImpl2.setStandardDeviation(0.49219648948333194d);
        double double9 = normalDistributionImpl2.getInitialDomain(0.8222040420136734d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.15865525393145702d + "'", double3 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0000000000000027d + "'", double5 == 1.0000000000000027d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.507803510516668d) + "'", double9 == (-0.507803510516668d));
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        double double6 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1));
        double double10 = normalDistributionImpl0.getInitialDomain(0.5369622222718954d);
        normalDistributionImpl0.setStandardDeviation(0.940977201627452d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.5390767201695538d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-36.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7166405168138941d + "'", double14 == 0.7166405168138941d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), (double) '#');
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound(0.9999999999999982d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3413447460212585d);
        double double9 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.34134474606854304d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.9999886040743466d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5152853762537151d + "'", double7 == 0.5152853762537151d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5227841717602993d + "'", double13 == 0.5227841717602993d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.8369480692852422d), 0.8238384604739418d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.8414052544692371d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9994251344632319d + "'", double4 == 0.9994251344632319d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getInitialDomain((double) 100L);
        double double10 = normalDistributionImpl0.getInitialDomain((-2.0d));
        double double12 = normalDistributionImpl0.getInitialDomain(0.6335779670147943d);
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.getDomainUpperBound(35.13447460685071d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability((-2.6645352591003757E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(52.0d);
        double double5 = normalDistributionImpl0.getInitialDomain(0.4629234412743151d);
        double double6 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 51.0d + "'", double5 == 51.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double8 = normalDistributionImpl0.cumulativeProbability((-2.6645352591003757E-15d));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.5039893591935787d);
        double double12 = normalDistributionImpl0.cumulativeProbability(2.5396351688300456E-13d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.6233479763570439d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.49999999999999895d + "'", double8 == 0.49999999999999895d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.009999806372665464d + "'", double10 == 0.009999806372665464d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5000000000001014d + "'", double12 == 0.5000000000001014d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7334720615445417d + "'", double14 == 0.7334720615445417d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 1.7976931348623157E308d);
        normalDistributionImpl2.setMean(0.0353568855141011d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (short) 0);
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.6928655717427847d);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.3216748491581869d);
        double double12 = normalDistributionImpl0.cumulativeProbability(1.4439826508193312d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.02599295576838051d);
        normalDistributionImpl0.setMean(0.626163656191395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.32081094552894474d) + "'", double10 == (-0.32081094552894474d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9814232506553946d + "'", double12 == 0.9814232506553946d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.514962869602436d + "'", double14 == 0.514962869602436d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5390767201695538d, 0.17788278853017964d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(52.00258406774183d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        normalDistributionImpl0.setMean((double) 0);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        normalDistributionImpl0.setMean(0.1586552539314552d);
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-0.1586552539314552d));
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1586552539314552d + "'", double13 == 0.1586552539314552d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.5630297531363655d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getInitialDomain((double) (byte) 1);
        normalDistributionImpl0.setMean(1.1586552539314552d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability((double) 100, (-8.659739592076221E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5630297531363655d + "'", double9 == 0.5630297531363655d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.5630297531363655d + "'", double11 == 1.5630297531363655d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.cumulativeProbability(51.32170962220702d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(7.9999995d);
        double double11 = normalDistributionImpl0.getDomainUpperBound(0.9915778227237985d);
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.4981527531313652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 100.0d);
        double double4 = normalDistributionImpl2.getInitialDomain((double) 0.0f);
        normalDistributionImpl2.setMean(1.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain(0.11934043119744797d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-102.0d) + "'", double4 == (-102.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-99.0d) + "'", double9 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-99.0d) + "'", double13 == (-99.0d));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9781456977501894d, 0.05217799096267245d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getInitialDomain((double) (-1L));
        double double6 = normalDistributionImpl0.getInitialDomain(0.841344746068543d);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10, (double) '#');
        double double11 = normalDistributionImpl0.getDomainUpperBound(101.84134474471848d);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.13595523010244326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5067062021407764E-14d + "'", double9 == 5.5067062021407764E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5540716632722232d + "'", double14 == 0.5540716632722232d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        normalDistributionImpl0.setStandardDeviation((double) 10.0f);
        normalDistributionImpl0.setMean(0.4909247933281008d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.2699178146740115d);
        double double14 = normalDistributionImpl0.cumulativeProbability((-0.9999999999999982d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4911838148984376d + "'", double12 == 0.4911838148984376d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4407403300940993d + "'", double14 == 0.4407403300940993d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getInitialDomain((double) 100L);
        double double10 = normalDistributionImpl0.getInitialDomain((-2.0d));
        double double12 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        normalDistributionImpl0.setStandardDeviation(0.7024938097501251d);
        double double16 = normalDistributionImpl0.getDomainUpperBound(0.8364569406723077d);
        double double18 = normalDistributionImpl0.inverseCumulativeProbability(0.49920180713065715d);
        double double21 = normalDistributionImpl0.cumulativeProbability(0.49810058103165455d, 0.5038101483228419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5630297531363648d + "'", double12 == 0.5630297531363648d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.001405534133834767d) + "'", double18 == (-0.001405534133834767d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.002514462601602485d + "'", double21 == 0.002514462601602485d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(101.84134474471848d);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability((-34.000000000000014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3692453862100339d + "'", double10 == 0.3692453862100339d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0013557027715216385d, 0.5020761703704258d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((-0.30502572933164634d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0013557027715216385d + "'", double4 == 0.0013557027715216385d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double12 = normalDistributionImpl0.getDomainUpperBound(0.4960106436853684d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9300927213513706d, 0.9999999999999857d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9300927213513706d + "'", double3 == 0.9300927213513706d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double16 = normalDistributionImpl0.getDomainUpperBound((double) 1);
        double double17 = normalDistributionImpl0.getMean();
        double double19 = normalDistributionImpl0.getDomainUpperBound(0.6949742691024806d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl0.cumulativeProbability(0.0012125417630083346d, (-98.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0511737486529345d, 0.9672144419306778d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.5007483786067086d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(6.382190473113489d, 0.1621083255529453d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0511737486529345d + "'", double3 == 0.0511737486529345d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0183881905836123d + "'", double5 == 1.0183881905836123d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double12 = normalDistributionImpl0.getDomainUpperBound(102.39008757114912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100L, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainLowerBound((-40.37958411457447d));
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5067316599261309d);
        double double9 = normalDistributionImpl2.cumulativeProbability(1.3905847309170216E-4d, 0.49999999999999895d);
        double double11 = normalDistributionImpl2.getInitialDomain(0.9427557549587601d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.31206695063009127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 101.68745699125691d + "'", double6 == 101.68745699125691d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0012125417630083346d + "'", double9 == 0.0012125417630083346d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.15941154281637548d + "'", double13 == 0.15941154281637548d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.841344746068543d);
        double double16 = normalDistributionImpl0.getDomainUpperBound((double) 1);
        double double17 = normalDistributionImpl0.getMean();
        double double19 = normalDistributionImpl0.getDomainLowerBound(4.440892098500626E-16d);
        double double21 = normalDistributionImpl0.cumulativeProbability(0.6677388737830613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7863023356349992d + "'", double21 == 0.7863023356349992d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9300927213513706d, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.5d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9300927213513706d + "'", double4 == 0.9300927213513706d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999999857d + "'", double5 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.getDomainUpperBound((-2.1315790155210035d));
        normalDistributionImpl0.setStandardDeviation(0.5179888577970047d);
        double double8 = normalDistributionImpl0.getDomainLowerBound((-0.4899999965724752d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 52.0d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (byte) 1);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.9999999999999857d);
        normalDistributionImpl2.setMean(0.1586552539314552d);
        double double8 = normalDistributionImpl2.getInitialDomain(0.18406016874421915d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.5381679378900157d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8413447460685395d + "'", double4 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.8413447460685448d) + "'", double8 == (-0.8413447460685448d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1586552539314552d + "'", double10 == 0.1586552539314552d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double8 = normalDistributionImpl0.getDomainUpperBound(10.0d);
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainUpperBound(2.6645352591003757E-15d);
        double double15 = normalDistributionImpl0.getDomainUpperBound(51.0d);
        normalDistributionImpl0.setStandardDeviation(0.06698251522395969d);
        double double19 = normalDistributionImpl0.getDomainUpperBound(10.187591005088953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        normalDistributionImpl0.setMean((double) 0);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        normalDistributionImpl0.setMean(0.1586552539314552d);
        normalDistributionImpl0.setStandardDeviation((double) (short) 10);
        double double16 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-8.72519706073979d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.0331087808995042d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.514962869602436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.841344746068543d + "'", double5 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.8369480692852422d) + "'", double7 == (-1.8369480692852422d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.34134474606854304d);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(5.5067062021407764E-14d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.1586552539314552d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability(1.0000000000000533d, 0.5437953125423168d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.40879584134842484d) + "'", double10 == (-0.40879584134842484d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-7.430135797091524d) + "'", double13 == (-7.430135797091524d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.00000022901422d) + "'", double15 == (-1.00000022901422d));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999909d, 0.5051019631384582d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain((-100.00000003096761d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5051019631384582d + "'", double3 == 0.5051019631384582d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.49489803686153266d + "'", double5 == 0.49489803686153266d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 100.0d);
        double double4 = normalDistributionImpl2.getInitialDomain((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.8413447460685395d);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-102.0d) + "'", double4 == (-102.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 98.00000024999669d + "'", double6 == 98.00000024999669d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-2.0d) + "'", double7 == (-2.0d));
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getInitialDomain((double) (-1));
        normalDistributionImpl0.setStandardDeviation(0.44398253538906635d);
        double double12 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl0.getDomainUpperBound(0.0353568855141011d);
        double double16 = normalDistributionImpl0.getInitialDomain(0.12319301195953247d);
        normalDistributionImpl0.setMean(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.4439825353890663d) + "'", double16 == (-1.4439825353890663d));
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getInitialDomain((double) 10);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getDomainLowerBound((-94.72091334973283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039893563146316d + "'", double8 == 0.5039893563146316d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.44398253538906635d);
        double double12 = normalDistributionImpl0.getDomainUpperBound(0.1885575583850198d);
        normalDistributionImpl0.setStandardDeviation(0.5155415382220611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9256280559645881d + "'", double10 == 0.9256280559645881d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.833281577979647d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability((-4.130342569396469d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7976570282728996d + "'", double14 == 0.7976570282728996d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.940977201627452d);
        double double6 = normalDistributionImpl2.cumulativeProbability((-9.992007221626409E-16d));
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.8413447460685426d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 53.70604135981212d + "'", double4 == 53.70604135981212d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5113968002624507d + "'", double6 == 0.5113968002624507d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        normalDistributionImpl0.setMean((double) 10.0f);
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.getDomainUpperBound(107.9999995d);
        double double18 = normalDistributionImpl0.getDomainLowerBound((-232.5545660123448d));
        double double20 = normalDistributionImpl0.getDomainLowerBound(0.004362394360148403d);
        double double22 = normalDistributionImpl0.getDomainUpperBound(0.8469122021505918d);
        double double24 = normalDistributionImpl0.getInitialDomain(0.5056303509274056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.7976931348623157E308d) + "'", double20 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 110.0d + "'", double24 == 110.0d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double4 = normalDistributionImpl0.getDomainLowerBound(98.0d);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.8462824029134881d);
        normalDistributionImpl0.setMean(1.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.9991109747008919d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (byte) 1);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, (double) 10L);
        normalDistributionImpl2.setMean(0.6335779670147943d);
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.07830046923741085d);
        normalDistributionImpl2.setMean(0.01687456986807709d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1586552539314552d + "'", double5 == 0.1586552539314552d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getDomainUpperBound(52.0d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        double double10 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        normalDistributionImpl0.setMean((double) 10.0f);
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        normalDistributionImpl0.setStandardDeviation(0.6911813891867865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double9 = normalDistributionImpl0.getDomainUpperBound(9.0d);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getInitialDomain(0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999982d + "'", double7 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5d);
        double double8 = normalDistributionImpl0.getInitialDomain(Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5039892761931579d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.5d + "'", double8 == 1.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5015914867204091d + "'", double10 == 0.5015914867204091d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.308537538725987d + "'", double12 == 0.308537538725987d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl0.getInitialDomain((double) 0);
        normalDistributionImpl0.setMean(2.476482021675316d);
        double double18 = normalDistributionImpl0.getDomainUpperBound(1.2187179204246186d);
        normalDistributionImpl0.setStandardDeviation(0.8266417287151979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.841344746068543d);
        double double9 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9672144728093757d + "'", double8 == 0.9672144728093757d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain((double) 10.0f);
        double double12 = normalDistributionImpl0.cumulativeProbability((-0.40879584134842484d));
        normalDistributionImpl0.setMean((double) (short) 0);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.9300927213513706d);
        double double19 = normalDistributionImpl0.cumulativeProbability(0.833281577979647d, 0.8414392316437053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3413447460212585d + "'", double12 == 0.3413447460212585d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.8238384604739418d + "'", double16 == 0.8238384604739418d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.002292014215110605d + "'", double19 == 0.002292014215110605d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4996640038501735d, 51.0d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((-0.40879584134842484d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double4 = normalDistributionImpl0.getDomainLowerBound(98.0d);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.8462824029134881d);
        normalDistributionImpl0.setMean(1.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.9300927213513706d);
        normalDistributionImpl0.setMean(0.8413448014832712d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.476482021675316d + "'", double11 == 2.476482021675316d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl0.setStandardDeviation((double) (short) 10);
        normalDistributionImpl0.setMean(0.34134474606854304d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.5369622222718954d, 98.0000002260757d);
        double double16 = normalDistributionImpl0.getInitialDomain((-0.841344746068543d));
        double double18 = normalDistributionImpl0.getDomainUpperBound((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.cumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.841344746068543d + "'", double7 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.49219648948333194d + "'", double14 == 0.49219648948333194d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.658655253931457d) + "'", double16 == (-9.658655253931457d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain(0.4999999998764571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.841344746068543d + "'", double6 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double4 = normalDistributionImpl0.getDomainLowerBound(98.0d);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.8462824029134881d);
        normalDistributionImpl0.setMean(1.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.9300927213513706d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.9772498680518191d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.476482021675316d + "'", double11 == 2.476482021675316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4909247933281008d + "'", double13 == 0.4909247933281008d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 1.0547118733938987E-15d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5d);
        double double8 = normalDistributionImpl0.getInitialDomain(Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl0.getDomainUpperBound((-9.658655253931457d));
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability(1.5039893591935787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.5d + "'", double8 == 1.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8423081287276433d + "'", double13 == 0.8423081287276433d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        double double6 = normalDistributionImpl0.getInitialDomain((double) (short) 100);
        double double8 = normalDistributionImpl0.getDomainUpperBound((double) (-1));
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.cumulativeProbability((-0.40879584134842484d));
        double double13 = normalDistributionImpl0.cumulativeProbability(0.3071343450311962d);
        double double15 = normalDistributionImpl0.getDomainUpperBound(2.6645352591003757E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.49836914509065217d + "'", double11 == 0.49836914509065217d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5012252868335773d + "'", double13 == 0.5012252868335773d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.34134474606854304d);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainUpperBound((double) (short) 100);
        double double15 = normalDistributionImpl0.getInitialDomain((-1.8270546735473194d));
        double double17 = normalDistributionImpl0.getDomainLowerBound(0.9999999999990821d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.40879584134842484d) + "'", double10 == (-0.40879584134842484d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.getDomainUpperBound((double) 1.0f);
        normalDistributionImpl0.setMean(0.0d);
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-0.49601064080642143d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 1.0f);
        double double12 = normalDistributionImpl0.getInitialDomain(9.0d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.9331927987311419d);
        normalDistributionImpl0.setStandardDeviation(1.0000002290141978d);
        double double18 = normalDistributionImpl0.getDomainUpperBound(52.32170962220702d);
        normalDistributionImpl0.setStandardDeviation(0.039427479282331035d);
        java.lang.Class<?> wildcardClass21 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.5000000483185494d + "'", double14 == 1.5000000483185494d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        normalDistributionImpl0.setMean((double) 10.0f);
        double double14 = normalDistributionImpl0.getDomainLowerBound(0.5101471806611929d);
        double double16 = normalDistributionImpl0.getDomainLowerBound(0.8897051145146662d);
        double double18 = normalDistributionImpl0.getInitialDomain(0.010041739966106134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.8462824029134881d);
        double double13 = normalDistributionImpl0.getInitialDomain(4.440892098500626E-16d);
        normalDistributionImpl0.setMean(4.440892098500626E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability((-0.06747965909999347d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.8462824029134881d) + "'", double13 == (-0.8462824029134881d));
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getDomainLowerBound(0.841344746068543d);
        double double10 = normalDistributionImpl0.getDomainLowerBound(51.0d);
        double double12 = normalDistributionImpl0.getInitialDomain(0.6856392036308133d);
        double double14 = normalDistributionImpl0.getDomainLowerBound(0.04280052354076347d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.19461854718438854d, 35.00999980637267d);
        double double19 = normalDistributionImpl0.getInitialDomain(0.32170962220701427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.4228457910695388d + "'", double17 == 0.4228457910695388d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getInitialDomain(9.0d);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.9672144728093757d);
        normalDistributionImpl0.setMean(7.382190473113489d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.49999999999999895d);
        double double12 = normalDistributionImpl0.getDomainUpperBound((-0.019421416088233195d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.8413447447184879d + "'", double6 == 1.8413447447184879d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.9463653739014717E-12d + "'", double10 == 2.9463653739014717E-12d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.382190473113489d + "'", double12 == 7.382190473113489d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl0.setStandardDeviation((double) (short) 10);
        normalDistributionImpl0.setMean(0.34134474606854304d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(0.2699178146740115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.841344746068543d + "'", double7 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.34134474606854304d + "'", double13 == 0.34134474606854304d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) (-1), (double) 10);
        double double13 = normalDistributionImpl0.cumulativeProbability(97.0d);
        double double15 = normalDistributionImpl0.getDomainUpperBound(0.841344746068543d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039893563146316d + "'", double8 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.04379531254231683d + "'", double11 == 0.04379531254231683d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8364569406723077d + "'", double13 == 0.8364569406723077d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0d, (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 100L);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double10 = normalDistributionImpl2.getDomainUpperBound((-0.8462824029134881d));
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8462824029134881d + "'", double4 == 0.8462824029134881d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5369622222718954d + "'", double8 == 0.5369622222718954d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double5 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double7 = normalDistributionImpl0.getDomainLowerBound(0.15865525393145702d);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.6928655717427847d);
        normalDistributionImpl0.setStandardDeviation(0.5039893563146316d);
        normalDistributionImpl0.setStandardDeviation(0.05217799096267245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5039893591935787d + "'", double10 == 0.5039893591935787d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 100.0d);
        double double4 = normalDistributionImpl2.getInitialDomain((double) 0.0f);
        normalDistributionImpl2.setMean(1.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-102.0d) + "'", double4 == (-102.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getDomainUpperBound(52.0d);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.5039893563146316d);
        normalDistributionImpl0.setMean((-2.3263551811044527d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.009999799155206771d + "'", double10 == 0.009999799155206771d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        double double12 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        double double14 = normalDistributionImpl0.getDomainLowerBound(0.44398253538906635d);
        double double15 = normalDistributionImpl0.getMean();
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getInitialDomain(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        normalDistributionImpl0.setStandardDeviation(0.49225246095967057d);
        double double13 = normalDistributionImpl0.getDomainLowerBound((-2.3263629885792905d));
        double double14 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.49225246095967057d + "'", double15 == 0.49225246095967057d);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5039892790723633d, 0.9300927213513706d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) (byte) -1);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.539827837277029d);
        double double17 = normalDistributionImpl0.getInitialDomain(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.8999998369039381d) + "'", double15 == (-0.8999998369039381d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, 10.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-0.40879584134842484d));
        double double6 = normalDistributionImpl2.getDomainLowerBound(1.7976931348623157E308d);
        double double8 = normalDistributionImpl2.getInitialDomain((-0.46292344209430747d));
        normalDistributionImpl2.setStandardDeviation(0.09278327366891166d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.44398253538906635d + "'", double4 == 0.44398253538906635d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, (double) 10.0f);
        double double4 = normalDistributionImpl2.getDomainUpperBound(1.0000002290142112d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4835270010468724d, 7.9999995d);
        normalDistributionImpl2.setMean((-2.1230560519281454d));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(67.62041538542553d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.5039893563146316d);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) (short) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) 1);
        double double11 = normalDistributionImpl0.getDomainUpperBound((double) (byte) 1);
        double double13 = normalDistributionImpl0.getInitialDomain(0.46056912736572214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6928655717427847d + "'", double5 == 0.6928655717427847d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.841344746068543d + "'", double9 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.940977201627452d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.49920180713065715d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 53.70604135981212d + "'", double4 == 53.70604135981212d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0700271791082514d) + "'", double6 == (-1.0700271791082514d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) '4');
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) '#');
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.cumulativeProbability(52.0d);
        normalDistributionImpl0.setMean(0.705083040947035d);
        double double16 = normalDistributionImpl0.getMean();
        double double19 = normalDistributionImpl0.cumulativeProbability(0.48914731097705527d, 0.5002593139679923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.705083040947035d + "'", double16 == 0.705083040947035d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.004336001496166086d + "'", double19 == 0.004336001496166086d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 1.0f);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.2203028302957341d);
        normalDistributionImpl0.setStandardDeviation(0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5871823419737664d + "'", double12 == 0.5871823419737664d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double10 = normalDistributionImpl0.getInitialDomain((-0.5335252424840331d));
        normalDistributionImpl0.setMean((-101.0d));
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.getInitialDomain(1.4439826508193312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-91.0d) + "'", double15 == (-91.0d));
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setStandardDeviation(0.539827837277029d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.17829037808686254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999999857d + "'", double5 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.4976672751450391d) + "'", double9 == (-0.4976672751450391d));
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-0.6928655717427847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999987750020665d, 0.002292014215110605d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (byte) 1);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.9999999999999857d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(5.5067062021407764E-14d);
        normalDistributionImpl2.setStandardDeviation(32.0d);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getInitialDomain(51.0d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((-18.900193952494813d));
        double double15 = normalDistributionImpl2.getDomainLowerBound((-1.0d));
        double double17 = normalDistributionImpl2.getDomainLowerBound((-1.0d));
        double double19 = normalDistributionImpl2.getDomainUpperBound((-232.5545660123448d));
        normalDistributionImpl2.setStandardDeviation(2.9463653739014717E-12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8413447460685395d + "'", double4 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (-1.0f));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double11 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5000000000000011d);
        double double14 = normalDistributionImpl0.getMean();
        double double16 = normalDistributionImpl0.getInitialDomain(0.460172162722971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5000000000000011d + "'", double14 == 0.5000000000000011d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.4999999999999989d) + "'", double16 == (-0.4999999999999989d));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 10);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        double double11 = normalDistributionImpl0.getInitialDomain(0.07830046923741085d);
        normalDistributionImpl0.setStandardDeviation(147.35266612983446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), 0.18900172977391094d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.07830046923741085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) 0, (double) 0.0f);
        normalDistributionImpl0.setStandardDeviation((double) ' ');
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 10.0f);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        double double17 = normalDistributionImpl0.getInitialDomain(0.7077893259378197d);
        double double19 = normalDistributionImpl0.getDomainUpperBound(0.880659578717579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5067296854432923d + "'", double15 == 0.5067296854432923d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5d, 0.3398414547151753d);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double4 = normalDistributionImpl0.getDomainLowerBound(98.0d);
        double double6 = normalDistributionImpl0.getInitialDomain(0.8611490636815822d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(0.6335779670147943d);
        double double16 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double19 = normalDistributionImpl0.cumulativeProbability((double) 0L, 0.5056303509274056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5039893563146316d + "'", double10 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2875808442933052d + "'", double19 == 0.2875808442933052d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 100.0d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-102.0d) + "'", double6 == (-102.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 32.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, 10.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-0.40879584134842484d));
        double double7 = normalDistributionImpl2.cumulativeProbability(0.32170962220701427d, 35.0d);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.4996640038501735d);
        normalDistributionImpl2.setStandardDeviation(0.2447303362493224d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.44398253538906635d + "'", double4 == 0.44398253538906635d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5267022066435871d + "'", double7 == 0.5267022066435871d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9915778227237985d + "'", double9 == 0.9915778227237985d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl0.setStandardDeviation((double) (short) 10);
        normalDistributionImpl0.setMean(0.34134474606854304d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.5369622222718954d, 98.0000002260757d);
        double double15 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.841344746068543d + "'", double7 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.49219648948333194d + "'", double14 == 0.49219648948333194d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.34134474606854304d + "'", double15 == 0.34134474606854304d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation((double) (short) 1);
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 100);
        double double7 = normalDistributionImpl0.getDomainUpperBound((double) '#');
        double double9 = normalDistributionImpl0.getInitialDomain(53.0d);
        double double11 = normalDistributionImpl0.getInitialDomain((-7.430135797091524d));
        normalDistributionImpl0.setStandardDeviation(39.40780143634536d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.5039892761931579d);
        double double17 = normalDistributionImpl0.cumulativeProbability(35.00999980637267d);
        double double20 = normalDistributionImpl0.cumulativeProbability(0.5267022066435871d, 0.8266417287151979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5051019631384582d + "'", double15 == 0.5051019631384582d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8128379310305311d + "'", double17 == 0.8128379310305311d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0030359630547768246d + "'", double20 == 0.0030359630547768246d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double3 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 1L);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (-1L));
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.7564642865046136d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.705083040947035d);
        double double17 = normalDistributionImpl0.getDomainUpperBound((-0.9999999999999982d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34134474606854304d + "'", double6 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.30502572933164634d) + "'", double13 == (-0.30502572933164634d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.4609232721052431d) + "'", double15 == (-0.4609232721052431d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1L), 0.15865525393145702d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.9999886040743466d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5033599228868442d);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.19280260220500278d);
        normalDistributionImpl2.setMean(0.2783150483469078d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.15865525393145702d + "'", double3 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0000000000000027d + "'", double5 == 1.0000000000000027d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999992d + "'", double7 == 0.9999999999999992d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.1376518024449882d) + "'", double9 == (-1.1376518024449882d));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain((double) 10.0f);
        double double12 = normalDistributionImpl0.cumulativeProbability((-0.40879584134842484d));
        normalDistributionImpl0.setMean((double) (short) 0);
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(0.514962869602436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3413447460212585d + "'", double12 == 0.3413447460212585d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.037515147385465346d + "'", double16 == 0.037515147385465346d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-9.992007221626409E-16d), 0.8238384604739418d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0511737486529345d, 0.46093430348510783d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05217799096267245d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04127665625834687d, (double) 1L);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.016874569913920223d);
        normalDistributionImpl2.setMean(0.8418283911019668d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5051019631384582d, 0.9668549164996936d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(7.9999995d);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.5152853762537151d);
        double double15 = normalDistributionImpl0.getDomainLowerBound(1.000000000000008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain(7.9999995d);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) (byte) 0);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.3735777632460221d, 0.8127202298034107d);
        normalDistributionImpl0.setStandardDeviation(0.5000000000001014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14617000022041837d + "'", double15 == 0.14617000022041837d);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1L), (double) (short) 100);
        normalDistributionImpl2.setMean(0.5d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.6956388019232028d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5007804853998638d + "'", double6 == 0.5007804853998638d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 100);
        double double7 = normalDistributionImpl0.getDomainUpperBound((double) '#');
        double double9 = normalDistributionImpl0.getInitialDomain(53.0d);
        double double11 = normalDistributionImpl0.getInitialDomain((-7.430135797091524d));
        normalDistributionImpl0.setStandardDeviation(39.40780143634536d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.5039892761931579d);
        double double17 = normalDistributionImpl0.cumulativeProbability(35.00999980637267d);
        double double18 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5051019631384582d + "'", double15 == 0.5051019631384582d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8128379310305311d + "'", double17 == 0.8128379310305311d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(35.00999980637267d, 51.32170962220702d);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.08261711626635315d, 1.000000000000012d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 35.97724986805182d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, 10.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.000000000000008d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(9.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5000000000000003d + "'", double4 == 0.5000000000000003d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getDomainUpperBound(7.9999995d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.49225246095967057d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.5047406331493426d, 0.9772498680518191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6887295588242259d + "'", double9 == 0.6887295588242259d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14264777626070912d + "'", double12 == 0.14264777626070912d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        normalDistributionImpl0.setMean((double) 10.0f);
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.32170962220701427d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.NEGATIVE_INFINITY + "'", double14 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 100);
        double double7 = normalDistributionImpl0.getDomainUpperBound((double) '#');
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.6887295588242259d);
        normalDistributionImpl0.setStandardDeviation(0.04280052354076347d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(0.7825286244460141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.49225246299399095d + "'", double9 == 0.49225246299399095d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.0031201203477648765d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        normalDistributionImpl0.setStandardDeviation((double) 10);
        double double8 = normalDistributionImpl0.getInitialDomain(98.0d);
        double double10 = normalDistributionImpl0.getInitialDomain(0.5335252424840331d);
        normalDistributionImpl0.setMean((-91.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1);
        double double9 = normalDistributionImpl0.getDomainUpperBound(Double.NEGATIVE_INFINITY);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.0511737486529345d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.9999999177855301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8534106012131258d + "'", double11 == 0.8534106012131258d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.977249863612982d + "'", double13 == 0.977249863612982d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0d, (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 100L);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double10 = normalDistributionImpl2.getDomainUpperBound((-0.8462824029134881d));
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.5630297531363655d);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.1356441779506904d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.6911813891867865d);
        normalDistributionImpl2.setMean(0.3692453862100339d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8462824029134881d + "'", double4 == 0.8462824029134881d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5369622222718954d + "'", double8 == 0.5369622222718954d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 16.3895596312079d + "'", double12 == 16.3895596312079d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.940977201627452d);
        double double6 = normalDistributionImpl2.cumulativeProbability((-9.992007221626409E-16d));
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 53.70604135981212d + "'", double4 == 53.70604135981212d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5113968002624507d + "'", double6 == 0.5113968002624507d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) 0, (double) 0.0f);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) 0.0f);
        double double12 = normalDistributionImpl0.getDomainUpperBound(0.5549508274208408d);
        double double14 = normalDistributionImpl0.getInitialDomain((double) 0L);
        normalDistributionImpl0.setStandardDeviation(0.11934043119744797d);
        normalDistributionImpl0.setMean(53.846912201184615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4996640038501735d, 51.0d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.8127202298034107d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.2510486035059047d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4996640038501735d + "'", double4 == 0.4996640038501735d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4996640038501735d + "'", double6 == 0.4996640038501735d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getInitialDomain((double) (-1L));
        double double6 = normalDistributionImpl0.getInitialDomain(0.841344746068543d);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10, (double) '#');
        double double11 = normalDistributionImpl0.getDomainUpperBound(0.841344746068543d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getDomainUpperBound(39.40780143634536d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5067062021407764E-14d + "'", double9 == 5.5067062021407764E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, 10.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.49664007711314156d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((-3.004834203322146d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9157782272521799d + "'", double4 == 0.9157782272521799d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(53.70604135981212d, (-0.45620468745768317d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.getDomainUpperBound((double) 1.0f);
        normalDistributionImpl0.setMean(0.0d);
        double double7 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.9772498680518209d);
        double double11 = normalDistributionImpl0.getDomainUpperBound(0.9157782272521799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double5 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double7 = normalDistributionImpl0.getDomainLowerBound(0.15865525393145702d);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.6928655717427847d);
        double double12 = normalDistributionImpl0.getDomainUpperBound(99.5d);
        double double14 = normalDistributionImpl0.getDomainUpperBound(2.6645352591003757E-15d);
        normalDistributionImpl0.setMean((-0.022750131743965903d));
        normalDistributionImpl0.setMean(0.7747264570828358d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability(0.6956388019232028d, 0.4965191939515398d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5039893591935787d + "'", double10 == 0.5039893591935787d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getDomainUpperBound(35.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.23715036381503607d, 33.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-0.40879584134842484d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.10801563252206647d + "'", double11 == 0.10801563252206647d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) (-1), (double) 10);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getInitialDomain(0.34134474606854304d);
        normalDistributionImpl0.setStandardDeviation(0.4835270010468724d);
        double double17 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039893563146316d + "'", double8 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.04379531254231683d + "'", double11 == 0.04379531254231683d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-101.0d) + "'", double14 == (-101.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double4 = normalDistributionImpl0.getDomainLowerBound(98.0d);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.8462824029134881d);
        normalDistributionImpl0.setMean(1.0d);
        double double11 = normalDistributionImpl0.getDomainLowerBound(0.9300927213513706d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getInitialDomain(0.33251112969510455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.5000000000000003d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainUpperBound((-0.34134474606854326d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999857d, (double) (short) 100);
        double double4 = normalDistributionImpl2.getDomainLowerBound(1.0183881905836123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999857d + "'", double4 == 0.9999999999999857d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation(1.4439826508193312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getDomainUpperBound(0.8413447460685395d);
        double double5 = normalDistributionImpl0.getInitialDomain((double) 10L);
        double double7 = normalDistributionImpl0.getInitialDomain(96.53707655872569d);
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double7 = normalDistributionImpl0.getDomainUpperBound(21.999999874017963d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.49225246299399095d);
        double double12 = normalDistributionImpl0.cumulativeProbability((-32.0d), 1.476482021675313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.019421416088233195d) + "'", double9 == (-0.019421416088233195d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9300927309585233d + "'", double12 == 0.9300927309585233d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.841344746068543d);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        double double10 = normalDistributionImpl0.getDomainUpperBound(100.00279864555097d);
        double double12 = normalDistributionImpl0.getInitialDomain(0.5267022066435871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5335252424840331d + "'", double5 == 0.5335252424840331d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.460172162722971d + "'", double8 == 0.460172162722971d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (-1L));
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 100);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getDomainLowerBound((double) (byte) 10);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double11 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.15865525393145702d + "'", double10 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound((double) 1);
        double double8 = normalDistributionImpl0.getInitialDomain((double) '4');
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.9672144728093757d);
        normalDistributionImpl0.setStandardDeviation(0.36296768069508856d);
        double double17 = normalDistributionImpl0.getDomainLowerBound((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getInitialDomain(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation(1.5630297531363655d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.16361323103784767d);
        normalDistributionImpl0.setStandardDeviation((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.5313248142171119d) + "'", double11 == (-1.5313248142171119d));
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        normalDistributionImpl0.setStandardDeviation(32.0d);
        double double14 = normalDistributionImpl0.getDomainUpperBound(10.0d);
        double double16 = normalDistributionImpl0.cumulativeProbability(5.235623379731981d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5649821857285307d + "'", double16 == 0.5649821857285307d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 100.0d);
        double double4 = normalDistributionImpl2.getInitialDomain((double) 0.0f);
        normalDistributionImpl2.setMean(1.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain(0.11934043119744797d);
        double double11 = normalDistributionImpl2.getInitialDomain(0.40129367431689333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-102.0d) + "'", double4 == (-102.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-99.0d) + "'", double9 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.0d) + "'", double11 == (-99.0d));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.getDomainUpperBound((double) ' ');
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(7.9999995d);
        normalDistributionImpl0.setMean((-8.544393640231267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl2.cumulativeProbability(Double.NEGATIVE_INFINITY);
        normalDistributionImpl2.setMean(0.0353568855141011d);
        double double10 = normalDistributionImpl2.getInitialDomain(0.9999999999999363d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.0d), 100.0d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.833281577979647d);
        normalDistributionImpl2.setMean((-0.041303421663107937d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 98.0d + "'", double4 == 98.0d);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double12 = normalDistributionImpl0.getInitialDomain(0.02249038756436722d);
        normalDistributionImpl0.setStandardDeviation(0.8788527073490968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        normalDistributionImpl0.setStandardDeviation(0.42504564831645186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        double double12 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        double double14 = normalDistributionImpl0.getDomainLowerBound(0.44398253538906635d);
        normalDistributionImpl0.setStandardDeviation(1.3905847309170216E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getDomainUpperBound(0.8413447460685395d);
        normalDistributionImpl0.setMean(101.84134474471848d);
        double double7 = normalDistributionImpl0.getInitialDomain(0.0d);
        normalDistributionImpl0.setStandardDeviation(0.05677831757821927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.84134474471848d + "'", double7 == 100.84134474471848d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getInitialDomain(0.7564642865046136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.0d + "'", double14 == 99.0d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(7.724986805186719d);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.5204210845008567d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(0.9999887564842955d, 0.0018759100508895345d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.906008766956347E-13d + "'", double7 == 2.906008766956347E-13d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 1.0547118733938987E-15d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.getInitialDomain((-9.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.440892098500626E-16d + "'", double13 == 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.0d));
        double double4 = normalDistributionImpl0.getDomainLowerBound(98.0d);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.8462824029134881d);
        normalDistributionImpl0.setMean(1.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.9300927213513706d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.9772498680518191d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double17 = normalDistributionImpl0.getDomainLowerBound(99.97789930231127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.476482021675316d + "'", double11 == 2.476482021675316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4909247933281008d + "'", double13 == 0.4909247933281008d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.15865525393145702d + "'", double15 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation((double) (byte) 1);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.9999999999999363d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-3.1962966645961592d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.40780143634536d + "'", double6 == 39.40780143634536d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04379531254231683d, 52.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(4.440892098500626E-16d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.5335252424840331d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4996640038501735d + "'", double4 == 0.4996640038501735d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5037571362866299d + "'", double6 == 0.5037571362866299d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.04379531254231683d + "'", double9 == 0.04379531254231683d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl0.getInitialDomain((double) 0);
        double double16 = normalDistributionImpl0.getInitialDomain(1.5630297531363655d);
        double double18 = normalDistributionImpl0.getInitialDomain(0.7714405704162621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        normalDistributionImpl0.setStandardDeviation((double) 100.0f);
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.9999887564842955d);
        double double17 = normalDistributionImpl0.cumulativeProbability((-750.0d));
        double double19 = normalDistributionImpl0.getDomainLowerBound((-232.5545660123448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5039893114617363d + "'", double15 == 0.5039893114617363d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.175237850427948E-14d + "'", double17 == 3.175237850427948E-14d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double8 = normalDistributionImpl0.getDomainUpperBound(0.9999999999999982d);
        double double10 = normalDistributionImpl0.getInitialDomain(0.5630297531363655d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 1.0547118733938987E-15d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.getDomainLowerBound(0.5630297531363655d);
        double double18 = normalDistributionImpl0.getDomainLowerBound(0.022750131948267915d);
        double double20 = normalDistributionImpl0.inverseCumulativeProbability((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.440892098500626E-16d + "'", double13 == 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + Double.POSITIVE_INFINITY + "'", double20 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (byte) 1);
        normalDistributionImpl2.setStandardDeviation(0.9999999999999857d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double3 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 1L);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (-1L));
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getDomainLowerBound((-1.8369480692852422d));
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(52.040088554316235d, 0.49920422912796364d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34134474606854304d + "'", double6 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, 10.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.000000000000008d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(5.235623379731981d);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5000000000000003d + "'", double4 == 0.5000000000000003d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability(0.49920180713065715d);
        double double4 = normalDistributionImpl0.getDomainUpperBound(0.9761185640963397d);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.02249038756436722d, 0.08261711626635315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0020007765459500422d) + "'", double2 == (-0.0020007765459500422d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.023950394341926695d + "'", double7 == 0.023950394341926695d);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation((double) '#');
        normalDistributionImpl0.setMean((-2.0d));
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) 0, (double) 0.0f);
        normalDistributionImpl0.setStandardDeviation((double) ' ');
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 10.0f);
        double double14 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        normalDistributionImpl0.setMean(98.00000024999669d);
        double double18 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double20 = normalDistributionImpl0.getDomainLowerBound((-80.50483525694472d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 66.00000024999669d + "'", double18 == 66.00000024999669d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.7976931348623157E308d) + "'", double20 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(52.0d);
        normalDistributionImpl0.setStandardDeviation(0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', 0.841344746068543d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getDomainUpperBound(53.0d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.21329268804825774d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability((-42.38017106515004d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 760.0d + "'", double8 == 760.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-80.50483525694472d) + "'", double13 == (-80.50483525694472d));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 760.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.8462824029134881d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.841344746068543d);
        normalDistributionImpl0.setStandardDeviation(0.6335779670147943d);
        double double8 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-1.5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5335252424840331d + "'", double5 == 0.5335252424840331d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, 0.5d);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double6 = normalDistributionImpl2.getDomainLowerBound((-2.0d));
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double8 = normalDistributionImpl0.cumulativeProbability((-2.6645352591003757E-15d));
        double double10 = normalDistributionImpl0.getDomainLowerBound((-0.47034574041634564d));
        double double11 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5437953125423168d);
        double double15 = normalDistributionImpl0.getInitialDomain((-0.32081094552894474d));
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.49999999999999895d + "'", double8 == 0.49999999999999895d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.45620468745768317d) + "'", double15 == (-0.45620468745768317d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5437953125423168d + "'", double16 == 0.5437953125423168d);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.49225246299399095d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(51.59120415852272d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.34134474606854304d), 97.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.5079783137169019d, (-1.3664220329852057d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.49836914509065217d);
        double double6 = normalDistributionImpl2.getInitialDomain((-0.350537382458959d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(10.0d);
        normalDistributionImpl0.setMean(0.5039893563146316d);
        double double7 = normalDistributionImpl0.getDomainUpperBound(0.0025554529259099734d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.13817976716257963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5039893563146316d + "'", double7 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5039893563146316d + "'", double9 == 0.5039893563146316d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.02249038756436722d);
        normalDistributionImpl0.setStandardDeviation(1.2745375447524006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getInitialDomain(1.7976931348623157E308d);
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.9672144728093757d);
        double double9 = normalDistributionImpl0.getDomainUpperBound((-7.430135797091524d));
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.9672144728093757d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.9912764293221792d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.84134474471848d + "'", double7 == 101.84134474471848d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.84134474471848d + "'", double11 == 101.84134474471848d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-32.77319104410122d), 1.0000002290142112d);
        normalDistributionImpl2.setStandardDeviation(0.009999799155206771d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getInitialDomain((double) (-1L));
        double double6 = normalDistributionImpl0.getInitialDomain(0.841344746068543d);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10, (double) '#');
        double double11 = normalDistributionImpl0.getDomainUpperBound(101.84134474471848d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-0.9969286478819417d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5067062021407764E-14d + "'", double9 == 5.5067062021407764E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5039893563146316d, 0.7024938097501251d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-9.658655253931457d));
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0013557027715216385d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-2.220446049250313E-16d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.220446049250313E-16d) + "'", double4 == (-2.220446049250313E-16d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23715036381503607d + "'", double6 == 0.23715036381503607d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23655474849709124d + "'", double8 == 0.23655474849709124d);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 1.0000000000000417d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.6689335370786698d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2482310621583611d + "'", double5 == 0.2482310621583611d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(1.7976931348623157E308d);
        double double9 = normalDistributionImpl0.getInitialDomain((-1.5d));
        double double12 = normalDistributionImpl0.cumulativeProbability(0.5155415382220611d, Double.NaN);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999982d + "'", double4 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.6335779670147943d, 0.49920180713065715d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl0.getInitialDomain((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getInitialDomain((double) 10.0f);
        double double12 = normalDistributionImpl0.cumulativeProbability((-0.40879584134842484d));
        normalDistributionImpl0.setMean((double) (short) 0);
        normalDistributionImpl0.setStandardDeviation(1.5d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3413447460212585d + "'", double12 == 0.3413447460212585d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
        double double12 = normalDistributionImpl0.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl0.getDomainLowerBound(0.5039893591935787d);
        double double16 = normalDistributionImpl0.getInitialDomain((-36.0d));
        double double19 = normalDistributionImpl0.cumulativeProbability(5.046384359168599E-4d, 0.8226803460673109d);
        double double21 = normalDistributionImpl0.getDomainUpperBound(2.5396351688300456E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2944537810110329d + "'", double19 == 0.2944537810110329d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        normalDistributionImpl0.setStandardDeviation((double) 10.0f);
        normalDistributionImpl0.setMean(0.4909247933281008d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.5039893591935787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5909248654627104d + "'", double12 == 0.5909248654627104d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4835270010468724d, (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.17147239464672015d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((-0.5258523486818338d));
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.6188441725398591d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4835270010468724d + "'", double4 == 0.4835270010468724d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4835270010468724d + "'", double8 == 0.4835270010468724d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getDomainLowerBound(0.8462824029134881d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.5871823419737664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-70.0d), 0.9772498680518209d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5549508274208408d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double8 = normalDistributionImpl2.getInitialDomain(2.0d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-70.0d) + "'", double4 == (-70.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-70.0d) + "'", double6 == (-70.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-69.02275013194819d) + "'", double8 == (-69.02275013194819d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainUpperBound((double) 0L);
        normalDistributionImpl0.setStandardDeviation((double) 10.0f);
        normalDistributionImpl0.setMean(0.5630297531363655d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(1.0d);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation((double) '#');
        normalDistributionImpl0.setMean((-2.0d));
        double double12 = normalDistributionImpl0.getDomainUpperBound(0.158655198516732d);
        double double14 = normalDistributionImpl0.getDomainLowerBound(0.2783150483469078d);
        normalDistributionImpl0.setMean(0.19286557206378513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.841344746068543d + "'", double3 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-2.0d) + "'", double12 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.49225246299399095d);
        normalDistributionImpl2.setMean(0.7825286244460141d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(98.0000002260757d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 37.31586539168706d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100);
        normalDistributionImpl0.setStandardDeviation((double) 10);
        double double7 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.46278541759824826d);
        double double10 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (short) 10);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) 10);
        double double11 = normalDistributionImpl0.getInitialDomain(0.07830046923741085d);
        normalDistributionImpl0.setStandardDeviation((double) 10);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(1.0d);
        normalDistributionImpl0.setMean(0.46278541759824826d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.7564642865046136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.615498348592001d + "'", double8 == 0.615498348592001d);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getDomainLowerBound(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.0331087808995042d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getDomainUpperBound(0.5101471806611929d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.833281577979647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.841344746068543d + "'", double5 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.8369480692852422d) + "'", double7 == (-1.8369480692852422d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9672146087506314d + "'", double13 == 0.9672146087506314d);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(52.0d);
        normalDistributionImpl0.setMean(0.0d);
        double double7 = normalDistributionImpl0.getDomainLowerBound(0.6233479763570439d);
        double double9 = normalDistributionImpl0.getDomainUpperBound((-52.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(1.7976931348623157E308d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (short) 0);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.016874569913920223d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(5.235623381230277d, 0.6928655727543339d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-2.1230560519281454d) + "'", double9 == (-2.1230560519281454d));
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0);
        double double5 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.09278327366891166d, 0.7444554667841599d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(98.00000024999669d, (-34.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) 1L);
        double double4 = normalDistributionImpl0.getDomainUpperBound((double) 1.0f);
        normalDistributionImpl0.setMean(0.0d);
        double double7 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.9772498680518209d);
        normalDistributionImpl0.setMean(0.8357772673710571d);
        normalDistributionImpl0.setStandardDeviation(0.07830046923741085d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.7545032643707585d);
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.6902785569732001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8897051145146662d + "'", double15 == 0.8897051145146662d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8746645794999104d + "'", double17 == 0.8746645794999104d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) 0L);
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.9999999999999982d);
        double double12 = normalDistributionImpl0.getInitialDomain((-232.5545660123448d));
        double double14 = normalDistributionImpl0.getDomainLowerBound(0.4835270010468724d);
        double double16 = normalDistributionImpl0.getDomainLowerBound(0.9999999999999982d);
        double double18 = normalDistributionImpl0.getDomainUpperBound(0.940977201627452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.9999999999999982d) + "'", double12 == (-0.9999999999999982d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double6 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setMean((double) 0.0f);
        double double10 = normalDistributionImpl0.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.03384577445442183d);
        double double15 = normalDistributionImpl0.getMean();
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double18 = normalDistributionImpl0.getInitialDomain(0.5335252424840331d);
        double double20 = normalDistributionImpl0.getInitialDomain(0.49836914509065217d);
        double double22 = normalDistributionImpl0.cumulativeProbability(0.531586558835401d);
        double double23 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.8270546735473194d) + "'", double14 == (-1.8270546735473194d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.7024938119309377d + "'", double22 == 0.7024938119309377d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.841344746068543d);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        double double10 = normalDistributionImpl0.getDomainUpperBound(100.00279864555097d);
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.005584755914161965d);
        normalDistributionImpl0.setStandardDeviation(1.9965192453062046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5335252424840331d + "'", double5 == 0.5335252424840331d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.460172162722971d + "'", double8 == 0.460172162722971d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }
}

