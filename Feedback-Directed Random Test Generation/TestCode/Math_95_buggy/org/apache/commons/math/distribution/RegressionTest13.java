package org.apache.commons.math.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(1.3224372342458903d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.6545067500020988d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.9999997548589381d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0666666666666667d + "'", double4 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0666666666666667d + "'", double8 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7391955708334917d + "'", double11 == 0.7391955708334917d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.1706184983192036d + "'", double15 == 1.1706184983192036d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.000000516041373d + "'", double18 == 10.000000516041373d);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound((double) 0);
        double double7 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double9 = fDistributionImpl2.getInitialDomain(0.27647641108787546d);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.2096939917059868d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.18621778604186276d);
        double double15 = fDistributionImpl2.getInitialDomain((-0.7098765218977119d));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.cumulativeProbability(1.035409335284881d, 0.37287374617049907d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0666666666666667d + "'", double9 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6141297694234034d + "'", double11 == 0.6141297694234034d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0038860637436940776d + "'", double13 == 0.0038860637436940776d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0666666666666667d + "'", double15 == 1.0666666666666667d);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.14331855455673662d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainUpperBound(0.7671238871153532d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.5658959861686993d);
        double double20 = fDistributionImpl2.getDomainUpperBound(0.4713832531652981d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0644343300841552d + "'", double18 == 1.0644343300841552d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability((-0.39459898355410916d), 0.14838744504466742d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6427394204621636d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0015139022826285934d + "'", double13 == 0.0015139022826285934d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1, 0.1619217586324618d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.cumulativeProbability(0.032455058190739475d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8688654563479007d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.06310046207220728d + "'", double5 == 0.06310046207220728d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1619217586324618d + "'", double6 == 0.1619217586324618d);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(6.490989698231297E-7d, 0.9990582468724434d);
        double double4 = fDistributionImpl2.getInitialDomain(0.42362370807463656d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9981182658738853d) + "'", double4 == (-0.9981182658738853d));
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7131089420574902d, (double) 100.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0666666666666667d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainUpperBound((-0.8656275216386715d));
        double double10 = fDistributionImpl2.getInitialDomain((-0.8656275216386715d));
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainUpperBound(1.04d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.010041901778306217d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7131089420574902d + "'", double5 == 0.7131089420574902d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0666666666666667d + "'", double6 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.1428571428571428d) + "'", double10 == (-1.1428571428571428d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0666666666666667d + "'", double11 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double8 = fDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double15 = fDistributionImpl2.cumulativeProbability(0.0d, 0.999999998720961d);
        double double17 = fDistributionImpl2.getInitialDomain(1.6823784410070278E-4d);
        double double19 = fDistributionImpl2.cumulativeProbability(3.6476481761225064E-5d);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5359273039499016d + "'", double15 == 0.5359273039499016d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0666666666666667d + "'", double17 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.983128425204389E-21d + "'", double19 == 2.983128425204389E-21d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3939261867539106d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getInitialDomain(0.42730108608188627d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.3387902797195461d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3939261867539106d + "'", double12 == 0.3939261867539106d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.24527277856410176d) + "'", double14 == (-0.24527277856410176d));
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.455347331113076d, 0.8566814411515594d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.9999999999999999d);
        double double6 = fDistributionImpl2.getInitialDomain(1.3425270299770196d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.3607292857476391d, 0.39806267400781215d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.41254092983704044d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.7492937419072561d) + "'", double6 == (-0.7492937419072561d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.014415422948871603d + "'", double9 == 0.014415422948871603d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8566814411515594d + "'", double10 == 0.8566814411515594d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8566814411515594d + "'", double11 == 0.8566814411515594d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.5658959861686993d);
        double double10 = fDistributionImpl2.getInitialDomain((double) (byte) 100);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.9999999999999999d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double20 = fDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double22 = fDistributionImpl2.cumulativeProbability(0.078895029333149d);
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0010902368068308299d + "'", double22 == 0.0010902368068308299d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double5 = fDistributionImpl2.cumulativeProbability((double) 100L, (double) 100);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (-1), (double) 1L);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(5.660012915926739d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.17956092001214863d, 0.6811911877650747d);
        double double23 = fDistributionImpl2.getDomainLowerBound(0.4545854893062795d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5359273049281781d + "'", double8 == 0.5359273049281781d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2448147953552745d + "'", double21 == 0.2448147953552745d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.4806364414990728d);
        double double9 = fDistributionImpl2.getDomainUpperBound(0.08002176792775097d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.01665307476152411d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0666666666666667d + "'", double4 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0666666666666667d + "'", double7 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.404474741050526E-8d + "'", double11 == 5.404474741050526E-8d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5359273049281781d, 0.07754896360371398d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(0.9875786923303186d);
        double double7 = fDistributionImpl2.getInitialDomain(0.07529159444589054d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.inverseCumulativeProbability(9.706834504475007E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.04033858971466067 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07754896360371398d + "'", double3 == 0.07754896360371398d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.04033858971466067d) + "'", double5 == (-0.04033858971466067d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.04033858971466067d) + "'", double7 == (-0.04033858971466067d));
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.9999995490779945d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getInitialDomain(0.3939261866636475d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.20296420772199839d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0666666666666667d + "'", double4 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0666666666666667d + "'", double8 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.467130182674467d + "'", double11 == 9.467130182674467d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0666666666666667d + "'", double14 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.605920810300997d + "'", double18 == 0.605920810300997d);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.5658959861686993d);
        double double10 = fDistributionImpl2.getInitialDomain((double) (byte) 100);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double14 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.1468975013920677d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9738605947007881d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.5141194854171636d);
        java.lang.Class<?> wildcardClass22 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.999999998720961d + "'", double14 == 0.999999998720961d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6948521360343328d + "'", double17 == 0.6948521360343328d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.17196348880332246d + "'", double21 == 0.17196348880332246d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.026043151925354262d, 0.43079798317240947d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.43079798317240947d + "'", double3 == 0.43079798317240947d);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.5658959861686993d);
        double double10 = fDistributionImpl2.getInitialDomain((double) (byte) 100);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.29419351326452775d);
        double double16 = fDistributionImpl2.getDomainLowerBound((double) 'a');
        double double18 = fDistributionImpl2.getDomainUpperBound(35.0d);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.4240409679470657d);
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double23 = fDistributionImpl2.getDomainUpperBound(0.8435202887272979d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 'a');
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5851584974698216d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.1428571428571428d));
        double double14 = fDistributionImpl2.cumulativeProbability(4.4313619691621655E-8d, 5.0E-7d);
        double double17 = fDistributionImpl2.cumulativeProbability(6.999206726751003E-7d, 0.6135977882436587d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.9999999997551333d);
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0666666666666667d + "'", double6 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5851584974698216d + "'", double9 == 0.5851584974698216d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0056186988579353045d + "'", double14 == 0.0056186988579353045d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6304764677244642d + "'", double17 == 0.6304764677244642d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.7239364522450744d + "'", double19 == 0.7239364522450744d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9186970002201454d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability(5.404474741050526E-8d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.8496203195655478 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0666666666666667d + "'", double4 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0666666666666667d + "'", double8 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14331855455673662d, (double) (short) 100);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.0d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.9007107790806665d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.28620727346501995d);
        double double13 = fDistributionImpl2.getInitialDomain((double) 1.0f);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.07055585400027292d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14331855455673662d + "'", double3 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14331855455673662d + "'", double4 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0204081632653061d + "'", double7 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8487242615499953d + "'", double9 == 0.8487242615499953d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0204081632653061d + "'", double13 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(3.6440862760308405E-13d, 0.0015139022826285934d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDomainUpperBound(2.969184065511307E-61d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0015139022826285934d + "'", double3 == 0.0015139022826285934d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0015139022826285934d + "'", double4 == 0.0015139022826285934d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0204081632653061d, 6.316649044495921E-20d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.018832057166409344d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain(0.4999999999999996d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.7131089420574902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.751669101739772d);
        double double15 = fDistributionImpl2.cumulativeProbability(2.5068794126236714E-11d, 0.4842547583938346d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0666666666666667d + "'", double8 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.29419342094206746d + "'", double10 == 0.29419342094206746d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.17748044359475634d + "'", double15 == 0.17748044359475634d);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14331855455673662d, (double) (short) 100);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = fDistributionImpl2.getDomainLowerBound(1.455347331113076d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.4806364414990728d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14331855455673662d + "'", double3 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14331855455673662d + "'", double4 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double8 = fDistributionImpl2.cumulativeProbability(1.0d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5610457407391829d);
        double double14 = fDistributionImpl2.cumulativeProbability((-0.9958628310247899d), 0.0015139022826285934d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08020102649690208d);
        double double18 = fDistributionImpl2.getInitialDomain(0.44398803164813927d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.8199231426810777E-8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4806364414990728d + "'", double8 == 0.4806364414990728d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.6610303148646313E-35d + "'", double14 == 1.6610303148646313E-35d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.3898982452905689d) + "'", double18 == (-0.3898982452905689d));
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6802757441213356d, 0.2282036193054211d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound((-0.07059113182164763d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6802757441213356d + "'", double3 == 0.6802757441213356d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.14331855455673662d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6565405011127655d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.44398803164813927d, 0.9982545136025938d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.13825864444441904d + "'", double18 == 0.13825864444441904d);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.5658959861686993d);
        double double10 = fDistributionImpl2.getInitialDomain((double) (byte) 100);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((-1.0d));
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.cumulativeProbability(0.3939261867539106d);
        double double20 = fDistributionImpl2.getDomainUpperBound(1.6276976246576982d);
        double double22 = fDistributionImpl2.cumulativeProbability((double) (short) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.00639921871163318d);
        double double26 = fDistributionImpl2.cumulativeProbability(2.7105547185131564E-4d);
        double double27 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double30 = fDistributionImpl2.cumulativeProbability(0.01546945452412019d, (double) (byte) 100);
        double double32 = fDistributionImpl2.getInitialDomain(0.2644388686615004d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0666666666666667d + "'", double15 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.004021930148036664d + "'", double18 == 0.004021930148036664d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.4979315404053558d + "'", double22 == 0.4979315404053558d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.9579860000403233d + "'", double26 == 0.9579860000403233d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.00639921871163318d + "'", double27 == 0.00639921871163318d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.026692047628480098d + "'", double30 == 0.026692047628480098d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0666666666666667d + "'", double32 == 1.0666666666666667d);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14331855455673662d, (double) (short) 100);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainUpperBound(35.0d);
        double double7 = fDistributionImpl2.getInitialDomain(0.999999754858845d);
        double double9 = fDistributionImpl2.getInitialDomain(1.3674805484340815E-4d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.29419342452052744d);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.3197241557841597d);
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.026905438484105773d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14331855455673662d + "'", double3 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0204081632653061d + "'", double7 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0204081632653061d + "'", double9 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound((double) 0);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(97.0d);
        double double11 = fDistributionImpl2.getInitialDomain(0.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(1.3427640865328766E-11d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.1228418113225267d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3885563738376366E-53d + "'", double14 == 1.3885563738376366E-53d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14331855455673662d, (double) (short) 100);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability((-0.01649520552292714d), 0.7391955708334917d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.10603185776751885d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14331855455673662d + "'", double3 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8374213227246765d + "'", double6 == 0.8374213227246765d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.44398803164813927d, 0.6020477979586306d);
        double double4 = fDistributionImpl2.cumulativeProbability((-0.20546785679638585d));
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6020477979586306d + "'", double5 == 0.6020477979586306d);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double11 = fDistributionImpl2.cumulativeProbability((double) 100L, (double) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(8.551772994963598E-11d);
        double double15 = fDistributionImpl2.getDomainLowerBound((double) 100.0f);
        double double17 = fDistributionImpl2.cumulativeProbability(0.48340773254302427d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0666666666666667d + "'", double4 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9999999989713655d + "'", double17 == 0.9999999989713655d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(6.490989698231297E-7d, 0.9222988357260219d);
        double double4 = fDistributionImpl2.cumulativeProbability((-2.041950150331039d));
        double double6 = fDistributionImpl2.getDomainLowerBound(0.9982545136025938d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double5 = fDistributionImpl2.cumulativeProbability((double) 100L, (double) 100);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (-1), (double) 1L);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100);
        double double13 = fDistributionImpl2.getInitialDomain((-2.1152735968416674d));
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.37079583395892407d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5359273049281781d + "'", double8 == 0.5359273049281781d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0204081632653061d + "'", double13 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.37079583395892407d + "'", double17 == 0.37079583395892407d);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 'a');
        double double6 = fDistributionImpl2.getInitialDomain((double) ' ');
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(1.0666666666666667d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.997927127600705d);
        double double15 = fDistributionImpl2.getInitialDomain(0.06228251800054987d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.2547187069501894d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0666666666666667d + "'", double6 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.9958628310247899d) + "'", double15 == (-0.9958628310247899d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double5 = fDistributionImpl2.cumulativeProbability((double) 100L, (double) 100);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (-1), (double) 1L);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d));
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.7131089420574902d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(1.8949407776257775E-5d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5359273049281781d + "'", double8 == 0.5359273049281781d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.05609329442391758d + "'", double17 == 0.05609329442391758d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, 100.0d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability((double) 100.0f, Double.NaN);
        double double8 = fDistributionImpl2.cumulativeProbability(0.5359269600387774d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.18526457464800797d, 0.5639862522322027d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5341620857824939d + "'", double8 == 0.5341620857824939d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2133914968263857d + "'", double11 == 0.2133914968263857d);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) 0L);
        double double9 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double11 = fDistributionImpl2.cumulativeProbability((double) 1.0f);
        double double13 = fDistributionImpl2.getDomainUpperBound(35.0d);
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.9999995490779945d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double19 = fDistributionImpl2.cumulativeProbability(0.05468463567638526d, 1.0691711667293864d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8313944303728792d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5359273049281781d + "'", double11 == 0.5359273049281781d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.467130182674467d + "'", double15 == 9.467130182674467d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5869205708273255d + "'", double19 == 0.5869205708273255d);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14331855455673662d, (double) (short) 100);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability((double) (-1));
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(0.5024048418548049d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14331855455673662d + "'", double3 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14331855455673662d + "'", double4 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29419351326452775d, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.30067058286648596d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.14331855455673662d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d, 0.5359273049281781d);
        double double16 = fDistributionImpl2.getInitialDomain(0.4806364414990728d);
        double double18 = fDistributionImpl2.getDomainLowerBound(10.000000177645354d);
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double21 = fDistributionImpl2.inverseCumulativeProbability(0.7184146327500252d);
        double double23 = fDistributionImpl2.getInitialDomain((-0.02615424493744133d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14838744504466742d + "'", double14 == 0.14838744504466742d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0666666666666667d + "'", double16 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2817961443774517d + "'", double21 == 1.2817961443774517d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0666666666666667d + "'", double23 == 1.0666666666666667d);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 'a');
        double double6 = fDistributionImpl2.getDomainLowerBound(100.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double10 = fDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 0);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.056314273545752934d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5672049665753582d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0666666666666667d + "'", double13 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3856681231785965d + "'", double16 == 0.3856681231785965d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.997927127600705d, 1.8807569847840502d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.cumulativeProbability(1.8408531999779685d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.997927127600705d + "'", double3 == 0.997927127600705d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6853721126161407d + "'", double5 == 0.6853721126161407d);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14331855455673662d, (double) (short) 100);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.0d);
        double double9 = fDistributionImpl2.getInitialDomain(0.009473872001929362d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14331855455673662d + "'", double3 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14331855455673662d + "'", double4 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0204081632653061d + "'", double7 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0204081632653061d + "'", double9 == 1.0204081632653061d);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double5 = fDistributionImpl2.cumulativeProbability((double) 100L, (double) 100);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (-1), (double) 1L);
        double double10 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double12 = fDistributionImpl2.getInitialDomain((double) 1L);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.5363950002264364d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.00559623111010271d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.getInitialDomain(0.5851584950099568d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5359273049281781d + "'", double8 == 0.5359273049281781d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0666666666666667d + "'", double12 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.459781423838354E-10d + "'", double16 == 2.459781423838354E-10d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0666666666666667d + "'", double19 == 1.0666666666666667d);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, 100.0d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.0015139022826285934d);
        double double8 = fDistributionImpl2.cumulativeProbability(4.754963989441383E-7d, 0.033864035585789216d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.1450822107160509d + "'", double8 == 0.1450822107160509d);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14331855455673662d, (double) (short) 100);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainUpperBound(35.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14838744504466742d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.026179435735839984d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.3732410807130759d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.15838390772478805d);
        double double17 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14331855455673662d + "'", double3 == 0.14331855455673662d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7943416017372064d + "'", double13 == 0.7943416017372064d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.08600267362407424d) + "'", double17 == (-0.08600267362407424d));
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.455347331113076d, 0.8566814411515594d);
        double double4 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.14331855455673662d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1450053446413436d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7562939666945874d + "'", double4 == 0.7562939666945874d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8566814411515594d + "'", double7 == 0.8566814411515594d);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, (double) 100);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability(1.0204081632653061d, 100.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.8566814411515594d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.21837119038152797d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.45680332530664475d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4319253611503442d + "'", double6 == 0.4319253611503442d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4240409679470657d + "'", double8 == 0.4240409679470657d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0204081632653061d + "'", double13 == 1.0204081632653061d);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9928637453353757d, 0.5359273049281781d);
        double double4 = fDistributionImpl2.getDomainLowerBound(1.5290787064885838d);
        double double6 = fDistributionImpl2.getInitialDomain(2.042959682728767d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3660523871062888d) + "'", double6 == (-0.3660523871062888d));
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, (double) 100);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10.0f);
        double double7 = fDistributionImpl2.inverseCumulativeProbability(0.4806364414990728d);
        double double9 = fDistributionImpl2.getInitialDomain((double) 100);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainLowerBound(0.4609246865489125d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9186970002201454d + "'", double7 == 0.9186970002201454d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0204081632653061d + "'", double9 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, (double) ' ');
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.5658959861686993d);
        double double10 = fDistributionImpl2.getInitialDomain((double) (byte) 100);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.29419351326452775d);
        double double16 = fDistributionImpl2.getDomainLowerBound((double) 'a');
        double double18 = fDistributionImpl2.getDomainUpperBound(35.0d);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.4240409679470657d);
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double23 = fDistributionImpl2.cumulativeProbability(0.8289248624070706d);
        double double25 = fDistributionImpl2.inverseCumulativeProbability(0.8397363707365657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2932393649264976d + "'", double23 == 0.2932393649264976d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.4187287836352218d + "'", double25 == 1.4187287836352218d);
    }
}

