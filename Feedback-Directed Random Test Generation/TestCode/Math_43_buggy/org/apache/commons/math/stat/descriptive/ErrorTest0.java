package org.apache.commons.math.stat.descriptive;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getSumLogImpl();
        long long4 = summaryStatistics0.n;
        double double5 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double7 = summaryStatistics6.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = summaryStatistics6.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics6.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max12 = summaryStatistics10.max;
        summaryStatistics6.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics0, summaryStatistics6);
        double double15 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.rank.Min min16 = null;
        summaryStatistics0.min = min16;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics0.getSumImpl();
        summaryStatistics0.addValue((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean2 and storelessUnivariateStatistic18", geometricMean2.equals(storelessUnivariateStatistic18) ? geometricMean2.hashCode() == storelessUnivariateStatistic18.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.rank.Min min1 = summaryStatistics0.min;
        org.apache.commons.math.stat.descriptive.moment.Mean mean2 = null;
        summaryStatistics0.mean = mean2;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary4 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean7 = summaryStatistics5.geoMean;
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean7);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double10 = summaryStatistics9.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean11 = summaryStatistics9.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics9.getSumLogImpl();
        long long13 = summaryStatistics9.n;
        double double14 = summaryStatistics9.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double16 = summaryStatistics15.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean17 = summaryStatistics15.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics15.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double20 = summaryStatistics19.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max21 = summaryStatistics19.max;
        summaryStatistics15.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max21);
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics9, summaryStatistics15);
        summaryStatistics15.addValue((double) 100);
        double double26 = summaryStatistics15.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean30 = summaryStatistics28.geoMean;
        summaryStatistics27.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean30);
        summaryStatistics15.geoMean = geometricMean30;
        summaryStatistics0.geoMean = geometricMean30;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic34 = summaryStatistics0.getMinImpl();
        double double35 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.Sum sum36 = summaryStatistics0.sum;
        summaryStatistics0.addValue(10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on min1 and geometricMean7", min1.equals(geometricMean7) ? min1.hashCode() == geometricMean7.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getSumLogImpl();
        double double4 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double8 = summaryStatistics7.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = summaryStatistics7.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics7.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double12 = summaryStatistics11.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max13 = summaryStatistics11.max;
        summaryStatistics7.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max13);
        summaryStatistics5.max = max13;
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max13);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics0.getMeanImpl();
        summaryStatistics0.addValue(6.907755278982138d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean2 and max13", geometricMean2.equals(max13) ? geometricMean2.hashCode() == max13.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getSumLogImpl();
        long long4 = summaryStatistics0.n;
        double double5 = summaryStatistics0.getSecondMoment();
        long long6 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double8 = summaryStatistics7.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = summaryStatistics7.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics7.getSumLogImpl();
        long long11 = summaryStatistics7.n;
        double double12 = summaryStatistics7.getSecondMoment();
        long long13 = summaryStatistics7.getN();
        double double14 = summaryStatistics7.getSumsq();
        org.apache.commons.math.stat.descriptive.summary.Sum sum15 = null;
        summaryStatistics7.sum = sum15;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics7.getVarianceImpl();
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic17);
        double double19 = summaryStatistics0.getStandardDeviation();
        summaryStatistics0.addValue((double) '#');
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean2 and storelessUnivariateStatistic22", geometricMean2.equals(storelessUnivariateStatistic22) ? geometricMean2.hashCode() == storelessUnivariateStatistic22.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getSumLogImpl();
        long long4 = summaryStatistics0.n;
        double double5 = summaryStatistics0.getSecondMoment();
        long long6 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double8 = summaryStatistics7.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = summaryStatistics7.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics7.getSumLogImpl();
        long long11 = summaryStatistics7.n;
        double double12 = summaryStatistics7.getSecondMoment();
        long long13 = summaryStatistics7.getN();
        double double14 = summaryStatistics7.getSumsq();
        org.apache.commons.math.stat.descriptive.summary.Sum sum15 = null;
        summaryStatistics7.sum = sum15;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics7.getVarianceImpl();
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic17);
        double double19 = summaryStatistics0.getStandardDeviation();
        summaryStatistics0.addValue((double) '#');
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = summaryStatistics0.copy();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean2 and storelessUnivariateStatistic22", geometricMean2.equals(storelessUnivariateStatistic22) ? geometricMean2.hashCode() == storelessUnivariateStatistic22.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.rank.Min min1 = summaryStatistics0.min;
        org.apache.commons.math.stat.descriptive.moment.Mean mean2 = null;
        summaryStatistics0.mean = mean2;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary4 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean7 = summaryStatistics5.geoMean;
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean7);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double10 = summaryStatistics9.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean11 = summaryStatistics9.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics9.getSumLogImpl();
        long long13 = summaryStatistics9.n;
        double double14 = summaryStatistics9.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double16 = summaryStatistics15.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean17 = summaryStatistics15.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics15.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double20 = summaryStatistics19.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max21 = summaryStatistics19.max;
        summaryStatistics15.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max21);
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics9, summaryStatistics15);
        summaryStatistics15.addValue((double) 100);
        double double26 = summaryStatistics15.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean30 = summaryStatistics28.geoMean;
        summaryStatistics27.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean30);
        summaryStatistics15.geoMean = geometricMean30;
        summaryStatistics0.geoMean = geometricMean30;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic34 = summaryStatistics0.getMinImpl();
        double double35 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic36 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = summaryStatistics0.getSumLogImpl();
        double double38 = summaryStatistics0.getVariance();
        summaryStatistics0.addValue((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on min1 and geometricMean7", min1.equals(geometricMean7) ? min1.hashCode() == geometricMean7.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.rank.Min min1 = summaryStatistics0.min;
        org.apache.commons.math.stat.descriptive.moment.Mean mean2 = null;
        summaryStatistics0.mean = mean2;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary4 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean7 = summaryStatistics5.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics5.getSumLogImpl();
        long long9 = summaryStatistics5.n;
        double double10 = summaryStatistics5.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double12 = summaryStatistics11.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean13 = summaryStatistics11.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics11.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double16 = summaryStatistics15.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max17 = summaryStatistics15.max;
        summaryStatistics11.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max17);
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics5, summaryStatistics11);
        summaryStatistics11.addValue((double) 100);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics11.getSumsqImpl();
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic22);
        summaryStatistics0.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double26 = summaryStatistics25.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean27 = summaryStatistics25.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic28 = summaryStatistics25.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double30 = summaryStatistics29.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max31 = summaryStatistics29.max;
        summaryStatistics25.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max31);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double34 = summaryStatistics33.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean35 = summaryStatistics33.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic36 = summaryStatistics33.getSumLogImpl();
        summaryStatistics25.setMeanImpl(storelessUnivariateStatistic36);
        double double38 = summaryStatistics25.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics25);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics39.getSumLogImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic40);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic42 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic43 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics44 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double45 = summaryStatistics44.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean46 = summaryStatistics44.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic47 = summaryStatistics44.getSumLogImpl();
        long long48 = summaryStatistics44.n;
        double double49 = summaryStatistics44.getPopulationVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics50 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double51 = summaryStatistics50.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean52 = summaryStatistics50.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic53 = summaryStatistics50.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = summaryStatistics50.secondMoment;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics55 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double56 = summaryStatistics55.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean57 = summaryStatistics55.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic58 = summaryStatistics55.getSumLogImpl();
        long long59 = summaryStatistics55.n;
        double double60 = summaryStatistics55.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics61 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double62 = summaryStatistics61.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean63 = summaryStatistics61.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic64 = summaryStatistics61.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics65 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double66 = summaryStatistics65.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max67 = summaryStatistics65.max;
        summaryStatistics61.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max67);
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics55, summaryStatistics61);
        boolean boolean70 = summaryStatistics50.equals((java.lang.Object) summaryStatistics55);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares71 = summaryStatistics55.sumsq;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic72 = summaryStatistics55.getSumsqImpl();
        summaryStatistics44.setGeoMeanImpl(storelessUnivariateStatistic72);
        double double74 = summaryStatistics44.getSecondMoment();
        org.apache.commons.math.stat.descriptive.summary.Sum sum75 = summaryStatistics44.sum;
        summaryStatistics0.sum = sum75;
        summaryStatistics0.addValue(25.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on min1 and storelessUnivariateStatistic42", min1.equals(storelessUnivariateStatistic42) ? min1.hashCode() == storelessUnivariateStatistic42.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double5 = summaryStatistics4.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max6 = summaryStatistics4.max;
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max6);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double9 = summaryStatistics8.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean10 = summaryStatistics8.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics8.getSumLogImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic11);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double14 = summaryStatistics13.getVariance();
        double double15 = summaryStatistics13.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double17 = summaryStatistics16.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max18 = summaryStatistics16.max;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics16.getMaxImpl();
        summaryStatistics16.n = (byte) 0;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = summaryStatistics16.getSummary();
        org.apache.commons.math.stat.descriptive.summary.Sum sum23 = null;
        summaryStatistics16.sum = sum23;
        org.apache.commons.math.stat.descriptive.rank.Min min25 = summaryStatistics16.min;
        summaryStatistics13.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min25);
        summaryStatistics0.min = min25;
        double double28 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.rank.Max max29 = summaryStatistics0.max;
        double double30 = summaryStatistics0.getMax();
        summaryStatistics0.addValue(10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean2 and max6", geometricMean2.equals(max6) ? geometricMean2.hashCode() == max6.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max2 = summaryStatistics0.max;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.rank.Min min5 = summaryStatistics4.min;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double8 = summaryStatistics7.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = summaryStatistics7.geoMean;
        summaryStatistics6.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean9);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double12 = summaryStatistics11.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean13 = summaryStatistics11.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics11.getSumLogImpl();
        summaryStatistics6.setGeoMeanImpl(storelessUnivariateStatistic14);
        summaryStatistics4.setSumImpl(storelessUnivariateStatistic14);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs17 = null;
        summaryStatistics4.sumLog = sumOfLogs17;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics4.getSumImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double21 = summaryStatistics20.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean22 = summaryStatistics20.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics20.getSumLogImpl();
        long long24 = summaryStatistics20.n;
        double double25 = summaryStatistics20.getSecondMoment();
        long long26 = summaryStatistics20.getN();
        double double27 = summaryStatistics20.getSumsq();
        org.apache.commons.math.stat.descriptive.summary.Sum sum28 = null;
        summaryStatistics20.sum = sum28;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double31 = summaryStatistics30.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean32 = summaryStatistics30.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = summaryStatistics30.getSumLogImpl();
        long long34 = summaryStatistics30.n;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic35 = summaryStatistics30.getSumImpl();
        summaryStatistics20.setSumsqImpl(storelessUnivariateStatistic35);
        summaryStatistics4.setMinImpl(storelessUnivariateStatistic35);
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics0, summaryStatistics4);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares39 = summaryStatistics4.sumsq;
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares40 = summaryStatistics4.sumsq;
        org.apache.commons.math.stat.descriptive.rank.Max max41 = summaryStatistics4.max;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic42 = summaryStatistics4.getGeoMeanImpl();
        double double43 = summaryStatistics4.getSecondMoment();
        org.apache.commons.math.stat.descriptive.summary.Sum sum44 = summaryStatistics4.sum;
        summaryStatistics4.addValue(6.907755278982138d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max41 and storelessUnivariateStatistic42", max41.equals(storelessUnivariateStatistic42) ? max41.hashCode() == storelessUnivariateStatistic42.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getSumLogImpl();
        long long4 = summaryStatistics0.n;
        double double5 = summaryStatistics0.getSecondMoment();
        long long6 = summaryStatistics0.getN();
        double double7 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.summary.Sum sum8 = null;
        summaryStatistics0.sum = sum8;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean12 = summaryStatistics10.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics10.getSumLogImpl();
        long long14 = summaryStatistics10.n;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics10.getSumImpl();
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic15);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double18 = summaryStatistics17.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean19 = summaryStatistics17.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic20 = summaryStatistics17.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double22 = summaryStatistics21.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max23 = summaryStatistics21.max;
        summaryStatistics17.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max23);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double26 = summaryStatistics25.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean27 = summaryStatistics25.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic28 = summaryStatistics25.getSumLogImpl();
        summaryStatistics17.setMeanImpl(storelessUnivariateStatistic28);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double31 = summaryStatistics30.getVariance();
        double double32 = summaryStatistics30.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double34 = summaryStatistics33.getVariance();
        org.apache.commons.math.stat.descriptive.rank.Max max35 = summaryStatistics33.max;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic36 = summaryStatistics33.getMaxImpl();
        summaryStatistics33.n = (byte) 0;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary39 = summaryStatistics33.getSummary();
        org.apache.commons.math.stat.descriptive.summary.Sum sum40 = null;
        summaryStatistics33.sum = sum40;
        org.apache.commons.math.stat.descriptive.rank.Min min42 = summaryStatistics33.min;
        summaryStatistics30.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min42);
        summaryStatistics17.min = min42;
        org.apache.commons.math.stat.descriptive.rank.Min min45 = summaryStatistics17.min;
        boolean boolean46 = summaryStatistics0.equals((java.lang.Object) summaryStatistics17);
        org.apache.commons.math.stat.descriptive.rank.Min min47 = summaryStatistics0.min;
        double double48 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean49 = null;
        summaryStatistics0.geoMean = geometricMean49;
        summaryStatistics0.addValue((double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean2 and storelessUnivariateStatistic15", geometricMean2.equals(storelessUnivariateStatistic15) ? geometricMean2.hashCode() == storelessUnivariateStatistic15.hashCode() : true);
    }
}

