package org.apache.commons.math.stat.correlation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.math.MathException;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;

public class PearsonsCorrelationTest {

    private PearsonsCorrelation pc2x2;
    private PearsonsCorrelation pc3x2;

    @Before
    public void setUp() {
        double[][] data2x2 = {{1, 2}, {3, 4}};
        double[][] data3x2 = {{1, 2}, {3, 4}, {5, 6}};
        pc2x2 = new PearsonsCorrelation(data2x2);
        pc3x2 = new PearsonsCorrelation(data3x2);
    }

    @Test
    public void testConstructors() {
        PearsonsCorrelation empty = new PearsonsCorrelation();
        Assert.assertNull(empty.getCorrelationMatrix());

        Assert.assertNotNull(pc2x2.getCorrelationMatrix());

        try {
            new PearsonsCorrelation(new double[][]{{1, 2}});
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }

        try {
            new PearsonsCorrelation(new double[][]{{1}, {2}});
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testCorrelation() {
        double[] x = {1, 2, 3};
        double[] y = {4, 5, 6};
        double r = pc3x2.correlation(x, y);
        Assert.assertEquals(1.0, r, 1e-12);

        try {
            pc3x2.correlation(new double[]{1, 2}, new double[]{1, 2, 3});
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }

        try {
            pc3x2.correlation(new double[]{1}, new double[]{2});
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }

        try {
            pc3x2.correlation(new double[]{}, new double[]{});
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testComputeCorrelationMatrix() {
        RealMatrix corr = pc3x2.computeCorrelationMatrix(
                new BlockRealMatrix(new double[][]{{1, 2}, {3, 4}, {5, 6}}));
        Assert.assertEquals(1.0, corr.getEntry(0, 0), 1e-12);
        Assert.assertEquals(1.0, corr.getEntry(1, 1), 1e-12);
        Assert.assertEquals(1.0, corr.getEntry(0, 1), 1e-12);
        Assert.assertEquals(1.0, corr.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testCovarianceToCorrelation() {
        RealMatrix covMatrix = new BlockRealMatrix(new double[][]{{4, 2}, {2, 9}});
        RealMatrix corr = pc2x2.covarianceToCorrelation(covMatrix);
        Assert.assertEquals(1.0, corr.getEntry(0, 0), 1e-12);
        Assert.assertEquals(1.0, corr.getEntry(1, 1), 1e-12);
        double expected = 2.0 / (Math.sqrt(4) * Math.sqrt(9));
        Assert.assertEquals(expected, corr.getEntry(0, 1), 1e-12);
        Assert.assertEquals(corr.getEntry(0, 1), corr.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testGetCorrelationStandardErrors() {
        double[][] data = {{1, 4}, {2, 7}, {3, 6}};
        PearsonsCorrelation pc = new PearsonsCorrelation(data);
        RealMatrix se = pc.getCorrelationStandardErrors();
        Assert.assertEquals(0.0, se.getEntry(0, 0), 1e-12);
        Assert.assertEquals(0.0, se.getEntry(1, 1), 1e-12);
        double r = 1.0 / (Math.sqrt(1) * 1.5275252316519465);
        double expectedSE = Math.sqrt((1 - r * r) / (3 - 2));
        Assert.assertEquals(expectedSE, se.getEntry(0, 1), 1e-4);
        Assert.assertEquals(expectedSE, se.getEntry(1, 0), 1e-4);
    }

    @Test
    public void testGetCorrelationPValues() throws MathException {
        double[][] data = {{1, 4}, {2, 7}, {3, 6}};
        PearsonsCorrelation pc = new PearsonsCorrelation(data);
        RealMatrix pvals = pc.getCorrelationPValues();
        Assert.assertEquals(0.0, pvals.getEntry(0, 0), 1e-12);
        Assert.assertEquals(0.0, pvals.getEntry(1, 1), 1e-12);
        double p = pvals.getEntry(0, 1);
        Assert.assertTrue(p > 0 && p < 1);
        Assert.assertEquals(p, pvals.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testGetCorrelationMatrix() {
        Assert.assertNotNull(pc2x2.getCorrelationMatrix());
    }

    @Test
    public void testConstructorWithCovariance() {
        Covariance cov = new Covariance(new double[][]{{1, 2}, {3, 4}});
        PearsonsCorrelation pc = new PearsonsCorrelation(cov);
        Assert.assertNotNull(pc.getCorrelationMatrix());
        Assert.assertEquals(1.0, pc.getCorrelationMatrix().getEntry(0, 0), 1e-12);
        Assert.assertEquals(1.0, pc.getCorrelationMatrix().getEntry(1, 1), 1e-12);
        Assert.assertEquals(1.0, pc.getCorrelationMatrix().getEntry(0, 1), 1e-12);
    }
}