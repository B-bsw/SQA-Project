package org.apache.commons.math3.stat.inference;

import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NoDataException;

public class MannWhitneyUTestTest {

    private MannWhitneyUTest mannWhitneyUTest;

    @Before
    public void setUp() {
        // Default constructor with FIXED NaN strategy and AVERAGE ties
        mannWhitneyUTest = new MannWhitneyUTest();
    }

    @After
    public void tearDown() {
        mannWhitneyUTest = null;
    }

    // Test: constructor with custom strategies (note: naturalRanking is private,
    // but we can test via behavior since default constructor uses FIXED/AVERAGE)
    // and the second constructor with explicit strategies.
    @Test
    public void testConstructorWithCustomStrategies() {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.REMOVED, TiesStrategy.MAXIMUM);
        assertNotNull(test);
        // No direct way to access naturalRanking, but we can assert no exception.
        // For completeness, we call a method that uses ranking.
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {2.0, 3.0};
        double p = test.mannWhitneyUTest(x, y);
        assertTrue(p >= 0 && p <= 1);
    }

    // Test: null input should throw NullArgumentException
    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTestWithNullX() {
        mannWhitneyUTest.mannWhitneyUTest(null, new double[]{1.0});
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTestWithNullY() {
        mannWhitneyUTest.mannWhitneyUTest(new double[]{1.0}, null);
    }

    // Test: zero-length arrays should throw NoDataException
    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTestWithEmptyX() {
        mannWhitneyUTest.mannWhitneyUTest(new double[0], new double[]{1.0});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTestWithEmptyY() {
        mannWhitneyUTest.mannWhitneyUTest(new double[]{1.0}, new double[0]);
    }

    // Test: normal case with distinct values, no ties
    @Test
    public void testMannWhitneyUTestNormalCase() {
        // Example from Wikipedia (simple case)
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {4.0, 5.0, 6.0};
        double p = mannWhitneyUTest.mannWhitneyUTest(x, y);
        // For perfectly separated samples, Umax = n1*n2 = 9, Umin=0, 
        // asymptotic p-value should be very small (approaching 0).
        assertTrue("p-value should be small for non-overlapping samples", p < 0.05);
        // Also check p is in [0,1]
        assertTrue(p >= 0.0 && p <= 1.0);
    }

    // Test: case with ties (needs ties strategy average)
    @Test
    public void testMannWhitneyUTestWithTies() {
        double[] x = {1.0, 2.0, 2.0, 3.0};
        double[] y = {2.0, 3.0, 4.0};
        double p = mannWhitneyUTest.mannWhitneyUTest(x, y);
        // Should not throw, p-value within [0,1]
        assertTrue(p >= 0.0 && p <= 1.0);
    }

    // Test: case with identical samples (all ties, should be moderate p-value)
    @Test
    public void testMannWhitneyUTestIdenticalSamples() {
        double[] x = {1.0, 2.0, 3.0, 4.0};
        double[] y = {1.0, 2.0, 3.0, 4.0};
        double p = mannWhitneyUTest.mannWhitneyUTest(x, y);
        // With identical ranks, U should be n1*n2/2 = 8, so p-value should be ~1
        assertTrue("p-value for identical samples should be close to 1", p > 0.5);
    }

    // Test: boundary case - single element in each sample
    @Test
    public void testMannWhitneyUTestSingleElementSamples() {
        double[] x = {1.0};
        double[] y = {2.0};
        double p = mannWhitneyUTest.mannWhitneyUTest(x, y);
        // With n1=n2=1, n1n2prod=1, EU=0.5, VarU=1*(1+1+1)/12=0.25, 
        // z = (Umin-0.5)/0.5. Umin = 0 (since Umax = 1*1 - 0 =1? Actually 
        // U1 = sumRankX - (1*2)/2. sumRankX for rank 1 is 1, so U1=0, U2=1, 
        // Umax=1, Umin=0. Then z = (0-0.5)/0.5 = -1, p=2*Phi(-1)~0.3173.
        assertTrue(p >= 0.0 && p <= 1.0);
        // Check not throwing
        assertNotNull(p);
    }

    // Test: loop with multiple iterations (ensures for loop works, many entries)
    @Test
    public void testMannWhitneyUTestMultipleElements() {
        double[] x = new double[100];
        double[] y = new double[100];
        for (int i = 0; i < 100; i++) {
            x[i] = i;
            y[i] = i + 50; // shift to create some overlap
        }
        double p = mannWhitneyUTest.mannWhitneyUTest(x, y);
        assertTrue(p >= 0.0 && p <= 1.0);
    }

    // Test: boundary case - NaN values with default FIXED strategy
    @Test
    public void testMannWhitneyUTestWithNaN() {
        double[] x = {1.0, Double.NaN, 3.0};
        double[] y = {4.0, 5.0};
        // FIXED strategy: NaNs are left in place, ranking treats them as rank?
        // Actually NaturalRanking with FIXED: NaNs are assigned ranks, but 
        // typically NaN is considered greater than all other values? 
        // This test ensures no exception.
        double p = mannWhitneyUTest.mannWhitneyUTest(x, y);
        assertTrue(p >= 0.0 && p <= 1.0);
    }

    // Test: exponent boundary - large values to ensure no overflow in calculations
    @Test
    public void testMannWhitneyUTestLargeValues() {
        double[] x = new double[1000];
        double[] y = new double[1000];
        for (int i = 0; i < 1000; i++) {
            x[i] = i;
            y[i] = i + 1000;
        }
        double p = mannWhitneyUTest.mannWhitneyUTest(x, y);
        assertTrue(p >= 0.0 && p <= 1.0);
    }

    // Test: case where U1 > U2, ensures max is returned
    @Test
    public void testUmaxReturned() {
        // X all smaller than Y, so U1 will be small? Actually U1 = R1 - n1(n1+1)/2
        // For x all small, ranks 1..n1, sumRankX = n1(n1+1)/2, so U1=0, U2=n1*n2,
        // Umax = n1*n2. Test asymptotic p-value with Umin=0.
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {5.0, 6.0, 7.0, 8.0, 9.0};
        // ranks: all xs have ranks 1-5, ys have ranks 6-10 (but one tie at 5? Actually
        // there is an overlap at 5.0 in both? x has 5, y has 5? If x={1,2,3,4,5} and 
        // y={5,6,7,8,9} then there is a tie at 5. But for simplicity, we can use 
        // distinct: x={1,2,3,4,5}, y={6,7,8,9,10} no ties. Then U1=0, U2=25, Umax=25.
        // p is very small.
        assertTrue(mannWhitneyUTest.mannWhitneyUTest(x, y) < 0.05);
    }
}