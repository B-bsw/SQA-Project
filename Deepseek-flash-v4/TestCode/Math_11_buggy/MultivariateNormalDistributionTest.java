package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class MultivariateNormalDistributionTest {

    private static final double EPSILON = 1e-12;
    private static final double TEST_EPS = 1e-10;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConstructorValidInput() throws Exception {
        double[] means = new double[] {1.0, 2.0, 3.0};
        double[][] covariances = new double[][] {
            {1.0, 0.5, 0.2},
            {0.5, 2.0, 0.4},
            {0.2, 0.4, 3.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertEquals(3, dist.getDimension());
        assertArrayEquals(means, dist.getMeans(), TEST_EPS);
    }

    @Test
    public void testConstructorDimensionMismatchFirstRow() {
        double[] means = new double[] {1.0, 2.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0, 0.0},
            {0.0, 1.0}
        };
        try {
            new MultivariateNormalDistribution(means, covariances);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            assertEquals(3, e.getArgument());
            assertEquals(2, e.getDimension());
        }
    }

    @Test
    public void testConstructorDimensionMismatchSecondRow() {
        double[] means = new double[] {1.0, 2.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0},
            {0.0, 1.0, 0.0}
        };
        try {
            new MultivariateNormalDistribution(means, covariances);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            assertEquals(3, e.getArgument());
            assertEquals(2, e.getDimension());
        }
    }

    @Test
    public void testConstructorNonPositiveDefinite() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 2.0},
            {2.0, 1.0}
        };
        try {
            new MultivariateNormalDistribution(means, covariances);
            fail("Expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException e) {
        }
    }

    @Test
    public void testGetMeansReturnsCopy() {
        double[] means = new double[] {5.0, -3.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double[] returned = dist.getMeans();
        returned[0] = 100.0;
        assertNotEquals(100.0, dist.getMeans()[0], 0.0);
    }

    @Test
    public void testGetCovariancesReturnsCopy() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {2.0, 0.5},
            {0.5, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double[][] result = dist.getCovariances().getData();
        result[0][0] = 99.0;
        assertEquals(2.0, dist.getCovariances().getEntry(0, 0), 0.0);
    }

    @Test
    public void testGetStandardDeviations() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {4.0, 0.0},
            {0.0, 9.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double[] stdDev = dist.getStandardDeviations();
        assertEquals(2.0, stdDev[0], TEST_EPS);
        assertEquals(3.0, stdDev[1], TEST_EPS);
    }

    @Test
    public void testDensityOneDimension() {
        double[] means = new double[] {0.0};
        double[][] covariances = new double[][] {
            {1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double densityAtZero = dist.density(new double[] {0.0});
        assertEquals(1.0 / FastMath.sqrt(2.0 * FastMath.PI), densityAtZero, TEST_EPS);
    }

    @Test
    public void testDensityKnownValue1D() {
        double[] means = new double[] {0.0};
        double sigma = 2.0;
        double[][] covariances = new double[][] {
            {sigma * sigma}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double expected = 1.0 / (sigma * FastMath.sqrt(2.0 * FastMath.PI));
        double actual = dist.density(new double[] {0.0});
        assertEquals(expected, actual, TEST_EPS);
    }

    @Test
    public void testDensityDimensionMismatch() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        try {
            dist.density(new double[] {0.0});
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            assertEquals(1, e.getArgument());
            assertEquals(2, e.getDimension());
        }
    }

    @Test
    public void testDensityNullInput() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        try {
            dist.density(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testDensityDiagonalCovariance() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0},
            {0.0, 4.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        // density at (0,0)
        double density = dist.density(new double[] {0.0, 0.0});
        double expected = 1.0 / (2.0 * FastMath.PI * 2.0);
        assertEquals(expected, density, TEST_EPS);
    }

    @Test
    public void testDensityNonDiagonalCovariance() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 0.5},
            {0.5, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double determinant = 1.0 - 0.25;
        double expected0 = 1.0 / (2.0 * Math.PI * Math.sqrt(determinant));
        assertEquals(expected0, dist.density(new double[] {0.0, 0.0}), TEST_EPS);
    }

    @Test
    public void testSampleDimension2() {
        double[] means = new double[] {1.0, 2.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double[] sample = dist.sample();
        assertEquals(2, sample.length);
    }

    @Test
    public void testSampleDimension3() {
        double[] means = new double[] {0.0, 0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double[] sample = dist.sample();
        assertEquals(3, sample.length);
        assertTrue(sample[0] >= -10 && sample[0] <= 10);
    }

    @Test
    public void testSampleWithMeanOffset() {
        double[] means = new double[] {10.0, -10.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double[] sample = dist.sample();
        assertEquals(2, sample.length);
    }

    @Test
    public void testSampleZeroVariance() {
        double[] means = new double[] {5.0, 5.0};
        double[][] covariances = new double[][] {
            {0.0, 0.0},
            {0.0, 0.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double[] sample = dist.sample();
        assertArrayEquals(new double[] {5.0, 5.0}, sample, TEST_EPS);
    }

    @Test
    public void testDensitySymmetry() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double density1 = dist.density(new double[] {1.0, 0.0});
        double density2 = dist.density(new double[] {0.0, 1.0});
        assertEquals(density1, density2, TEST_EPS);
    }

    @Test
    public void testDensityZeroDim() throws Exception {
        double[] means = new double[] {};
        double[][] covariances = new double[][] {};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertEquals(0, dist.getDimension());
        assertEquals(1.0, dist.density(new double[] {}), TEST_EPS);
    }

    @Test(expected = SingularMatrixException.class)
    public void testSingularCovarianceMatrix() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 1.0},
            {1.0, 1.0}
        };
        new MultivariateNormalDistribution(means, covariances);
    }
}