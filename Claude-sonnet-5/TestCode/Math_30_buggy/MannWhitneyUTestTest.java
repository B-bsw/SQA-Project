package org.apache.commons.math3.stat.inference;

import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.junit.Test;
import static org.junit.Assert.*;

public class MannWhitneyUTestTest {

    private static final double EPS = 1e-10;

    @Test
    public void testDefaultConstructor() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertNotNull(test);
    }

    @Test
    public void testConstructorWithStrategies() {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.MINIMAL, TiesStrategy.MINIMUM);
        assertNotNull(test);
    }

    @Test
    public void testMannWhitneyUNormalCase() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {6, 7, 8, 9, 10};

        double u = test.mannWhitneyU(x, y);
        // No overlap, so all x < all y, U for x = 0, U for y = 25
        assertEquals(25.0, u, EPS);
    }

    @Test
    public void testMannWhitneyUOverlappingSamples() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 3, 5, 7, 9};
        double[] y = {2, 4, 6, 8, 10};

        double u = test.mannWhitneyU(x, y);
        assertTrue(u >= 0);
        assertTrue(u <= 25);
    }

    @Test
    public void testMannWhitneyUWithTies() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 1, 1, 1, 1};
        double[] y = {1, 1, 1, 1, 1};

        double u = test.mannWhitneyU(x, y);
        // With all ties, U should be n1*n2/2 = 12.5
        assertEquals(12.5, u, EPS);
    }

    @Test
    public void testMannWhitneyUSingleElementEach() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1};
        double[] y = {2};

        double u = test.mannWhitneyU(x, y);
        assertEquals(1.0, u, EPS);
    }

    @Test
    public void testMannWhitneyUDifferentLengths() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3};
        double[] y = {4, 5, 6, 7, 8};

        double u = test.mannWhitneyU(x, y);
        assertEquals(15.0, u, EPS);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUNullX() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] y = {1, 2, 3};
        test.mannWhitneyU(null, y);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUNullY() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3};
        test.mannWhitneyU(x, null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUBothNull() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        test.mannWhitneyU(null, null);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUEmptyX() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {};
        double[] y = {1, 2, 3};
        test.mannWhitneyU(x, y);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUEmptyY() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3};
        double[] y = {};
        test.mannWhitneyU(x, y);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUBothEmpty() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {};
        double[] y = {};
        test.mannWhitneyU(x, y);
    }

    @Test
    public void testMannWhitneyUTestNormalCase() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {6, 7, 8, 9, 10};

        double pValue = test.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0.0);
        assertTrue(pValue <= 1.0);
    }

    @Test
    public void testMannWhitneyUTestIdenticalSamples() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {1, 2, 3, 4, 5};

        double pValue = test.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0.0);
        assertTrue(pValue <= 1.0);
    }

    @Test
    public void testMannWhitneyUTestLargeSamples() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = new double[20];
        double[] y = new double[20];
        for (int i = 0; i < 20; i++) {
            x[i] = i;
            y[i] = i + 20;
        }

        double pValue = test.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0.0);
        assertTrue(pValue <= 1.0);
        // Since x values are all smaller than y, this should be a very small p-value
        assertTrue(pValue < 0.05);
    }

    @Test
    public void testMannWhitneyUTestSingleElementSamples() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1};
        double[] y = {2};

        double pValue = test.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0.0);
        assertTrue(pValue <= 1.0);
    }

    @Test
    public void testMannWhitneyUTestWithTies() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double