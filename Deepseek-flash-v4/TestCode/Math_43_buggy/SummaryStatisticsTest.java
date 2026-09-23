package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Min;

public class SummaryStatisticsTest {
    private SummaryStatistics stats;

    @Before
    public void setUp() {
        stats = new SummaryStatistics();
    }

    @After
    public void tearDown() {
        stats = null;
    }

    @Test
    public void testAddValueAndBasicStats() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        Assert.assertEquals(3, stats.getN());
        Assert.assertEquals(6.0, stats.getSum(), 0.0001);
        Assert.assertEquals(2.0, stats.getMean(), 0.0001);
        Assert.assertEquals(1.0, stats.getMin(), 0.0001);
        Assert.assertEquals(3.0, stats.getMax(), 0.0001);
        Assert.assertEquals(14.0, stats.getSumsq(), 0.0001);
        Assert.assertEquals(1.0, stats.getVariance(), 0.0001);
        Assert.assertEquals(1.0, stats.getStandardDeviation(), 0.0001);
        Assert.assertEquals(1.8171205928, stats.getGeometricMean(), 0.0001);
        Assert.assertEquals(Math.log(1) + Math.log(2) + Math.log(3), stats.getSumOfLogs(), 0.0001);
    }

    @Test
    public void testEmptyStatistics() {
        Assert.assertEquals(0, stats.getN());
        Assert.assertTrue(Double.isNaN(stats.getSum()));
        Assert.assertTrue(Double.isNaN(stats.getMean()));
        Assert.assertTrue(Double.isNaN(stats.getMin()));
        Assert.assertTrue(Double.isNaN(stats.getMax()));
        Assert.assertTrue(Double.isNaN(stats.getSumsq()));
        Assert.assertTrue(Double.isNaN(stats.getVariance()));
        Assert.assertTrue(Double.isNaN(stats.getStandardDeviation()));
        Assert.assertTrue(Double.isNaN(stats.getGeometricMean()));
        Assert.assertTrue(Double.isNaN(stats.getSumOfLogs()));
        Assert.assertEquals(0, stats.getSecondMoment(), 0.0001);
    }

    @Test
    public void testSingleValue() {
        stats.addValue(42.0);
        Assert.assertEquals(1, stats.getN());
        Assert.assertEquals(42.0, stats.getSum(), 0.0001);
        Assert.assertEquals(42.0, stats.getMean(), 0.0001);
        Assert.assertEquals(42.0, stats.getMin(), 0.0001);
        Assert.assertEquals(42.0, stats.getMax(), 0.0001);
        Assert.assertEquals(1764.0, stats.getSumsq(), 0.0001);
        Assert.assertEquals(0.0, stats.getVariance(), 0.0001);
        Assert.assertEquals(0.0, stats.getStandardDeviation(), 0.0001);
        Assert.assertEquals(42.0, stats.getGeometricMean(), 0.0001);
    }

    @Test
    public void testNegativeValues() {
        stats.addValue(-5.0);
        stats.addValue(-3.0);
        stats.addValue(-1.0);
        Assert.assertEquals(3, stats.getN());
        Assert.assertEquals(-9.0, stats.getSum(), 0.0001);
        Assert.assertEquals(-3.0, stats.getMean(), 0.0001);
        Assert.assertEquals(-5.0, stats.getMin(), 0.0001);
        Assert.assertEquals(-1.0, stats.getMax(), 0.0001);
        Assert.assertEquals(35.0, stats.getSumsq(), 0.0001);
        Assert.assertEquals(4.0, stats.getVariance(), 0.0001);
        Assert.assertEquals(2.0, stats.getStandardDeviation(), 0.0001);
    }

    @Test
    public void testZeroValues() {
        stats.addValue(0.0);
        stats.addValue(0.0);
        Assert.assertEquals(2, stats.getN());
        Assert.assertEquals(0.0, stats.getSum(), 0.0001);
        Assert.assertEquals(0.0, stats.getMean(), 0.0001);
        Assert.assertEquals(0.0, stats.getMin(), 0.0001);
        Assert.assertEquals(0.0, stats.getMax(), 0.0001);
        Assert.assertEquals(0.0, stats.getVariance(), 0.0001);
        Assert.assertEquals(0.0, stats.getGeometricMean(), 0.0001);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, stats.getSumOfLogs(), 0.0001);
    }

    @Test
    public void testClear() {
        stats.addValue(10.0);
        stats.addValue(20.0);
        stats.clear();
        Assert.assertEquals(0, stats.getN());
        Assert.assertTrue(Double.isNaN(stats.getSum()));
        Assert.assertTrue(Double.isNaN(stats.getMean()));
    }

    @Test
    public void testCopy() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        SummaryStatistics copy = stats.copy();
        Assert.assertEquals(stats, copy);
        copy.addValue(3.0);
        Assert.assertNotEquals(stats, copy);
        Assert.assertEquals(2, stats.getN());
    }

    @Test
    public void testCopyConstructor() {
        stats.addValue(4.0);
        stats.addValue(6.0);
        SummaryStatistics copy = new SummaryStatistics(stats);
        Assert.assertEquals(stats, copy);
    }

    @Test
    public void testEquals() {
        SummaryStatistics stats2 = new SummaryStatistics();
        Assert.assertEquals(stats, stats2);
        stats.addValue(1.0);
        Assert.assertNotEquals(stats, stats2);
        stats2.addValue(1.0);
        Assert.assertEquals(stats, stats2);
        Assert.assertEquals(stats, stats);
        Assert.assertNotEquals(stats, null);
        Assert.assertNotEquals(stats, "string");
    }

    @Test
    public void testHashCode() {
        stats.addValue(3.0);
        SummaryStatistics stats2 = new SummaryStatistics();
        stats2.addValue(3.0);
        Assert.assertEquals(stats.hashCode(), stats2.hashCode());
    }

    @Test
    public void testToString() {
        stats.addValue(2.0);
        String s = stats.toString();
        Assert.assertTrue(s.contains("n: 1"));
        Assert.assertTrue(s.contains("min: 2.0"));
        Assert.assertTrue(s.contains("max: 2.0"));
    }

    @Test
    public void testSetSumImplWhenNotEmptyThrows() {
        stats.addValue(1.0);
        try {
            stats.setSumImpl(new Sum());
            Assert.fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testSetVarianceImpl() {
        stats.setVarianceImpl(new Variance());
        Assert.assertNotNull(stats.getVarianceImpl());
    }

    @Test
    public void testSetMeanImpl() {
        stats.setMeanImpl(new Mean());
        Assert.assertNotNull(stats.getMeanImpl());
    }

    @Test
    public void testSetGeoMeanImpl() {
        stats.setGeoMeanImpl(new GeometricMean());
        Assert.assertNotNull(stats.getGeoMeanImpl());
    }

    @Test
    public void testSetSumLogImpl() {
        SumOfLogs sol = new SumOfLogs();
        stats.setSumLogImpl(sol);
        Assert.assertSame(sol, stats.getSumLogImpl());
    }

    @Test(expected = NullArgumentException.class)
    public void testCopyNullSource() {
        SummaryStatistics.copy(null, new SummaryStatistics());
    }

    @Test(expected = NullArgumentException.class)
    public void testCopyNullDest() {
        SummaryStatistics.copy(stats, null);
    }

    @Test
    public void testGetSetMaxMinImpl() {
        Max mx = new Max();
        Min mn = new Min();
        stats.setMaxImpl(mx);
        stats.setMinImpl(mn);
        Assert.assertSame(mx, stats.getMaxImpl());
        Assert.assertSame(mn, stats.getMinImpl());
    }

    @Test
    public void testGetSumsqImpl() {
        SumOfSquares sos = new SumOfSquares();
        stats.setSumsqImpl(sos);
        Assert.assertSame(sos, stats.getSumsqImpl());
    }

    @Test
    public void testPopulationVariance() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        Assert.assertEquals(2.0 / 3.0, stats.getPopulationVariance(), 0.0001);
    }

    @Test
    public void testGetSummary() {
        stats.addValue(2.0);
        stats.addValue(4.0);
        StatisticalSummary summary = stats.getSummary();
        Assert.assertEquals(2.0, summary.getMean(), 0.0001);
        Assert.assertEquals(6.0, summary.getSum(), 0.0001);
        Assert.assertEquals(2, summary.getN());
        Assert.assertEquals(2.0, summary.getMin(), 0.0001);
        Assert.assertEquals(4.0, summary.getMax(), 0.0001);
    }
}