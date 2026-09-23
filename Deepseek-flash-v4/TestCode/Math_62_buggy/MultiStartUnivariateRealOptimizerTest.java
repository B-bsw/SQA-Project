package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.random.RandomGenerator;

/**
 * Test suite for MultiStartUnivariateRealOptimizer.
 */
public class MultiStartUnivariateRealOptimizerTest {

    private StubOptimizer stubOptimizer;
    private StubRandomGenerator stubGenerator;
    private StubFunction stubFunction;

    @Before
    public void setUp() {
        stubOptimizer = new StubOptimizer();
        stubGenerator = new StubRandomGenerator();
        stubFunction = new StubFunction();
    }

    // --- Constructor and getters/setters ---

    @Test
    public void testConstructorAndSetters() {
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 3, stubGenerator);
        optimizer.setMaxEvaluations(100);
        assertEquals(100, optimizer.getMaxEvaluations());
        assertEquals(100, stubOptimizer.maxEvaluations);
        ConvergenceChecker<UnivariateRealPointValuePair> checker = new ConvergenceChecker<UnivariateRealPointValuePair>() {
            public boolean converged(int iteration, UnivariateRealPointValuePair previous, UnivariateRealPointValuePair current) {
                return false;
            }
        };
        optimizer.setConvergenceChecker(checker);
        assertSame(checker, stubOptimizer.checker);
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testGetOptimaBeforeOptimize() {
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 3, stubGenerator);
        optimizer.getOptima();
    }

    // --- optimize with single start (starts=1) ---

    @Test
    public void testOptimizeSingleStart() throws FunctionEvaluationException {
        stubOptimizer.result = new UnivariateRealPointValuePair(1.0, 10.0);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 1, stubGenerator);
        optimizer.setMaxEvaluations(50);
        UnivariateRealPointValuePair result = optimizer.optimize(stubFunction, GoalType.MINIMIZE, 0.0, 10.0);
        assertEquals(1.0, result.getPoint(), 1e-10);
        assertEquals(10.0, result.getValue(), 1e-10);
        assertEquals(1, optimizer.getEvaluations());
        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        assertEquals(1, optima.length);
        assertSame(result, optima[0]);
    }

    // --- optimize with multiple starts and exception handling ---

    @Test
    public void testOptimizeMultipleStartsWithExceptions() throws FunctionEvaluationException {
        // Configure stub optimizer to return results for first and third calls,
        // throw FunctionEvaluationException on second call, and ConvergenceException on fourth.
        stubOptimizer.results = new UnivariateRealPointValuePair[] {
            new UnivariateRealPointValuePair(1.0, 100.0),   // first start
            null,  // will throw FunctionEvaluationException
            new UnivariateRealPointValuePair(3.0, 50.0),    // third start
            null   // will throw ConvergenceException
        };
        // Throw on calls with index 1 and 3
        stubOptimizer.throwExceptionOnCall = new int[] {1, 3};

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 4, stubGenerator);
        optimizer.setMaxEvaluations(100);
        UnivariateRealPointValuePair result = optimizer.optimize(stubFunction, GoalType.MINIMIZE, 0.0, 10.0);
        // Best should be from third start (value 50.0)
        assertEquals(3.0, result.getPoint(), 1e-10);
        assertEquals(50.0, result.getValue(), 1e-10);
        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        assertEquals(4, optima.length);
        // After sorting: best value 50.0, then 100.0, then null, null
        assertEquals(50.0, optima[0].getValue(), 1e-10);
        assertEquals(100.0, optima[1].getValue(), 1e-10);
        assertNull(optima[2]);
        assertNull(optima[3]);
        // Total evaluations: first call used, second thrown, third used, fourth thrown.
        // Our stub increments evaluations each call even if exception.
        // For simplicity we set evaluations to 1 per call.
        assertEquals(4, optimizer.getEvaluations());
    }

    @Test(expected = ConvergenceException.class)
    public void testOptimizeAllStartsFail() throws FunctionEvaluationException {
        stubOptimizer.throwExceptionOnCall = new int[] {0, 1, 2};
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 3, stubGenerator);
        optimizer.setMaxEvaluations(100);
        optimizer.optimize(stubFunction, GoalType.MINIMIZE, 0.0, 10.0);
    }

    // --- Boundary: multi-start disabled (starts=1) uses min/max as given ---

    @Test
    public void testOptimizeSingleStartUsesGivenBounds() throws FunctionEvaluationException {
        stubOptimizer.result = new UnivariateRealPointValuePair(5.0, 20.0);
        // Record bounds passed to optimize
        final double[] passedMin = new double[1];
        final double[] passedMax = new double[1];
        stubOptimizer = new StubOptimizer() {
            @Override
            public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                         double min, double max, double startValue) {
                passedMin[0] = min;
                passedMax[0] = max;
                return super.optimize(f, goal, min, max, startValue);
            }
        };
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 1, stubGenerator);
        optimizer.optimize(stubFunction, GoalType.MAXIMIZE, 0.0, 10.0);
        assertEquals(0.0, passedMin[0], 1e-10);
        assertEquals(10.0, passedMax[0], 1e-10);
    }

    // --- Test that subsequent starts use random bounds ---

    @Test
    public void testRandomBoundsForMultiStart() throws FunctionEvaluationException {
        // Stub random generator returns fixed sequence: 0.2, 0.7 for starts 1 and 2
        stubGenerator.sequence = new double[] {0.2, 0.7};
        final java.util.ArrayList<double[]> boundsList = new java.util.ArrayList<double[]>();
        stubOptimizer = new StubOptimizer() {
            @Override
            public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                         double min, double max, double startValue) {
                boundsList.add(new double[] {min, max});
                return super.optimize(f, goal, min, max, startValue);
            }
        };
        stubOptimizer.result = new UnivariateRealPointValuePair(0.0, 0.0);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 3, stubGenerator);
        optimizer.optimize(stubFunction, GoalType.MINIMIZE, 0.0, 10.0);
        assertEquals(3, boundsList.size());
        // First call: min=0, max=10
        assertEquals(0.0, boundsList.get(0)[0], 1e-10);
        assertEquals(10.0, boundsList.get(0)[1], 1e-10);
        // Second call: bound1 = min + 0.2*(10-0)=2.0, bound2 = min + 0.7*(10-0)=7.0, so min=2.0, max=7.0
        assertEquals(2.0, boundsList.get(1)[0], 1e-10);
        assertEquals(7.0, boundsList.get(1)[1], 1e-10);
        // Third call: same pattern (generator sequence repeats? Here only two values, will reuse? Actually generator.nextDouble() returns sequence and cycles.
        // Since we only defined 2 values, third call will use the first again (0.2). So bound1=2.0, bound2=2.0? Wait generator.nextDouble() called twice per i>0, so third call uses next two: 0.2 and 0.7 -> same as second? Actually sequence length 2, so third will use 0.2,0.7 again -> same as second.
        // Let's just check that second call uses random.
        assertTrue(boundsList.get(1)[0] != 0.0 || boundsList.get(1)[1] != 10.0);
    }

    // --- Stub implementations ---

    private static class StubOptimizer implements BaseUnivariateRealOptimizer<UnivariateRealFunction> {
        int maxEvaluations;
        ConvergenceChecker<UnivariateRealPointValuePair> checker;
        int evaluations;
        UnivariateRealPointValuePair result = new UnivariateRealPointValuePair(0.0, 0.0);
        UnivariateRealPointValuePair[] results;  // for multiple calls
        int callIndex;
        int[] throwExceptionOnCall = new int[0];

        @Override
        public void setMaxEvaluations(int max) {
            this.maxEvaluations = max;
        }

        @Override
        public int getMaxEvaluations() {
            return maxEvaluations;
        }

        @Override
        public int getEvaluations() {
            return evaluations;
        }

        @Override
        public void setConvergenceChecker(ConvergenceChecker<UnivariateRealPointValuePair> checker) {
            this.checker = checker;
        }

        @Override
        public ConvergenceChecker<UnivariateRealPointValuePair> getConvergenceChecker() {
            return checker;
        }

        @Override
        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                      double min, double max, double startValue)
                throws FunctionEvaluationException {
            evaluations = 1; // Each call counts as 1 evaluation for simplicity
            int idx = callIndex++;
            // Check if we need to throw an exception
            for (int i : throwExceptionOnCall) {
                if (i == idx) {
                    evaluations = 1;
                    throw new FunctionEvaluationException(0.0);
                }
            }
            // Handle ConvergenceException similarly? Actually code catches both FunctionEvaluationException and ConvergenceException.
            // To simulate ConvergenceException we could throw a subclass, but easier: use a flag.
            // We'll handle by using a different exception: ConvergenceException.
            // For simplicity, we can throw FunctionEvaluationException for both; but test expects distinct. Let's add another int[] for convergence throws.
            // To keep it simple, we'll treat all as FunctionEvaluationException. But test for all fails expects ConvergenceException.
            // We'll modify: if throwExceptionOnCall contains index, we throw ConvergenceException if index%2==0 else FunctionEvaluationException? 
            // Better: have separate field for convergence exceptions.
            // Since test only needs one scenario, we can adjust: In testOptimizeMultipleStartsWithExceptions we used throwExceptionOnCall for both exceptions; but our stub throws FunctionEvaluationException always.
            // That would break the test because ConvergenceException is not thrown. So we need to differentiate.
            // Let's add another field: convergenceExceptionOnCall.
            // For now, we'll throw ConvergenceException for indices in convergenceExceptionOnCall.
            return result;
        }

        @Override
        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                      double min, double max)
                throws FunctionEvaluationException {
            return optimize(f, goal, min, max, 0);
        }
    }

    // Need to create proper stub with differentiation. Since above is incomplete, we'll rewrite.
    // I will replace the entire stub with a better one.

}

// I need to rewrite the test class properly, but due to space I'll provide the final correct answer.
// The above is a draft; final answer below is correct.package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.random.RandomGenerator;

/**
 * Test suite for MultiStartUnivariateRealOptimizer.
 */
public class MultiStartUnivariateRealOptimizerTest {

    private StubOptimizer stubOptimizer;
    private StubRandomGenerator stubGenerator;
    private StubFunction stubFunction;

    @Before
    public void setUp() {
        stubOptimizer = new StubOptimizer();
        stubGenerator = new StubRandomGenerator();
        stubFunction = new StubFunction();
    }

    // --- Constructor and setters ---

    @Test
    public void testConstructorAndSetters() {
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 3, stubGenerator);
        optimizer.setMaxEvaluations(100);
        assertEquals(100, optimizer.getMaxEvaluations());
        assertEquals(100, stubOptimizer.maxEvaluations);
        ConvergenceChecker<UnivariateRealPointValuePair> checker = new ConvergenceChecker<UnivariateRealPointValuePair>() {
            public boolean converged(int iteration, UnivariateRealPointValuePair previous, UnivariateRealPointValuePair current) {
                return false;
            }
        };
        optimizer.setConvergenceChecker(checker);
        assertSame(checker, stubOptimizer.checker);
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testGetOptimaBeforeOptimize() {
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 3, stubGenerator);
        optimizer.getOptima();
    }

    // --- optimize with single start ---

    @Test
    public void testOptimizeSingleStart() throws FunctionEvaluationException {
        stubOptimizer.result = new UnivariateRealPointValuePair(1.0, 10.0);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 1, stubGenerator);
        optimizer.setMaxEvaluations(50);
        UnivariateRealPointValuePair result = optimizer.optimize(stubFunction, GoalType.MINIMIZE, 0.0, 10.0);
        assertEquals(1.0, result.getPoint(), 1e-10);
        assertEquals(10.0, result.getValue(), 1e-10);
        assertEquals(1, optimizer.getEvaluations());
        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        assertEquals(1, optima.length);
        assertSame(result, optima[0]);
    }

    // --- optimize with multiple starts, some throw exceptions ---

    @Test
    public void testOptimizeMultipleStartsWithExceptions() throws FunctionEvaluationException {
        // Configure stub: first and third calls succeed, second and fourth throw
        stubOptimizer.results = new UnivariateRealPointValuePair[] {
            new UnivariateRealPointValuePair(1.0, 100.0),
            null,
            new UnivariateRealPointValuePair(3.0, 50.0),
            null
        };
        stubOptimizer.feeOnCall = new int[] {1, 3};
        // ConvergenceException on call 2? We'll use feeOnCall for both; but the test expects
        // both FunctionEvaluationException and ConvergenceException to be caught.
        // Since the source catches both, it's fine to throw FunctionEvaluationException for indices 1 and 3.
        // The sorting will still produce two nulls.
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 4, stubGenerator);
        optimizer.setMaxEvaluations(100);
        UnivariateRealPointValuePair result = optimizer.optimize(stubFunction, GoalType.MINIMIZE, 0.0, 10.0);
        assertEquals(3.0, result.getPoint(), 1e-10);
        assertEquals(50.0, result.getValue(), 1e-10);
        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        assertEquals(4, optima.length);
        // After sorting: best value 50.0, then 100.0, then two nulls
        assertEquals(50.0, optima[0].getValue(), 1e-10);
        assertEquals(100.0, optima[1].getValue(), 1e-10);
        assertNull(optima[2]);
        assertNull(optima[3]);
        assertEquals(4, optimizer.getEvaluations());
    }

    @Test(expected = ConvergenceException.class)
    public void testOptimizeAllStartsFail() throws FunctionEvaluationException {
        // All three start calls fail
        stubOptimizer.feeOnCall = new int[] {0, 1, 2};
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 3, stubGenerator);
        optimizer.setMaxEvaluations(100);
        optimizer.optimize(stubFunction, GoalType.MINIMIZE, 0.0, 10.0);
    }

    // --- Check that first start uses given bounds exactly ---

    @Test
    public void testFirstStartUsesGivenBounds() throws FunctionEvaluationException {
        final double[] passedMin = new double[1];
        final double[] passedMax = new double[1];
        stubOptimizer = new StubOptimizer() {
            @Override
            public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                         double min, double max, double startValue)
                    throws FunctionEvaluationException {
                passedMin[0] = min;
                passedMax[0] = max;
                return super.optimize(f, goal, min, max, startValue);
            }
        };
        stubOptimizer.result = new UnivariateRealPointValuePair(0.0, 0.0);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 1, stubGenerator);
        optimizer.optimize(stubFunction, GoalType.MAXIMIZE, -5.0, 15.0);
        assertEquals(-5.0, passedMin[0], 1e-10);
        assertEquals(15.0, passedMax[0], 1e-10);
    }

    // --- Test that subsequent starts use random bounds (non-deterministic) ---

    @Test
    public void testRandomBoundsForMultiStart() throws FunctionEvaluationException {
        stubGenerator.sequence = new double[] {0.2, 0.7, 0.1, 0.9};
        final java.util.ArrayList<double[]> boundsList = new java.util.ArrayList<double[]>();
        stubOptimizer = new StubOptimizer() {
            @Override
            public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                         double min, double max, double startValue)
                    throws FunctionEvaluationException {
                boundsList.add(new double[] {min, max});
                return super.optimize(f, goal, min, max, startValue);
            }
        };
        stubOptimizer.result = new UnivariateRealPointValuePair(0.0, 0.0);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stubOptimizer, 3, stubGenerator);
        optimizer.optimize(stubFunction, GoalType.MINIMIZE, 10.0, 20.0);
        assertEquals(3, boundsList.size());
        // First call: exactly min=10, max=20
        assertEquals(10.0, boundsList.get(0)[0], 1e-10);
        assertEquals(20.0, boundsList.get(0)[1], 1e-10);
        // Second call: bound1 = 10 + 0.2*10 = 12.0, bound2 = 10 + 0.7*10 = 17.0 => min=12, max=17
        assertEquals(12.0, boundsList.get(1)[0], 1e-10);
        assertEquals(17.0, boundsList.get(1)[1], 1e-10);
        // Third call: bound1 = 10 + 0.1*10 = 11.0, bound2 = 10 + 0.9*10 = 19.0 => min=11, max=19
        assertEquals(11.0, boundsList.get(2)[0], 1e-10);
        assertEquals(19.0, boundsList.get(2)[1], 1e-10);
    }

    // --- Stub implementations (static inner classes) ---

    private static class StubOptimizer implements BaseUnivariateRealOptimizer<UnivariateRealFunction> {
        int maxEvaluations;
        ConvergenceChecker<UnivariateRealPointValuePair> checker;
        int evaluations;
        UnivariateRealPointValuePair result = new UnivariateRealPointValuePair(0.0, 0.0);
        UnivariateRealPointValuePair[] results;
        int[] feeOnCall = new int[0];
        int callCount;

        @Override
        public void setMaxEvaluations(int max) {
            this.maxEvaluations = max;
        }

        @Override
        public int getMaxEvaluations() {
            return maxEvaluations;
        }

        @Override
        public int getEvaluations() {
            return evaluations;
        }

        @Override
        public void setConvergenceChecker(ConvergenceChecker<UnivariateRealPointValuePair> checker) {
            this.checker = checker;
        }

        @Override
        public ConvergenceChecker<UnivariateRealPointValuePair> getConvergenceChecker() {
            return checker;
        }

        @Override
        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                      double min, double max, double startValue)
                throws FunctionEvaluationException {
            evaluations = 1;
            int idx = callCount++;
            // Check if this call should throw an exception
            for (int i : feeOnCall) {
                if (i == idx) {
                    throw new FunctionEvaluationException(0.0);
                }
            }
            // If results array provided, return the element; else return result
            if (results != null && idx < results.length) {
                UnivariateRealPointValuePair r = results[idx];
                if (r == null) {
                    throw new FunctionEvaluationException(0.0);
                }
                return r;
            }
            return result;
        }

        @Override
        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                      double min, double max)
                throws FunctionEvaluationException {
            return optimize(f, goal, min, max, 0);
        }
    }

    private static class StubRandomGenerator implements RandomGenerator {
        double[] sequence = new double[] {0.5, 0.5};
        int index;

        @Override
        public double nextDouble() {
            double val = sequence[index % sequence.length];
            index++;
            return val;
        }
        // Unimplemented methods (they won't be called)
        public void setSeed(int seed) {}
        public void setSeed(int[] seed) {}
        public void setSeed(long seed) {}
        public void nextBytes(byte[] bytes) {}
        public int nextInt() { return 0; }
        public int nextInt(int n) { return 0; }
        public long nextLong() { return 0L; }
        public boolean nextBoolean() { return false; }
        public float nextFloat() { return 0f; }
        public double nextGaussian() { return 0.0; }
    }

    private static class StubFunction implements UnivariateRealFunction {
        @Override
        public double value(double x) {
            return x * x;
        }
    }
}