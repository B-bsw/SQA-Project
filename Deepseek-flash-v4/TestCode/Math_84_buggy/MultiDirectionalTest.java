package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Comparator;
import java.lang.reflect.Field;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;

public class MultiDirectionalTest {

    private static class TestMultiDirectional extends MultiDirectional {
        private int evalCallCount = 0;
        private double[][] expectedValues;

        public void setExpectedValues(double[][] values) {
            this.expectedValues = values;
        }

        @Override
        protected void evaluateSimplex(Comparator<RealPointValuePair> comparator)
                throws FunctionEvaluationException, OptimizationException {
            if (expectedValues == null || evalCallCount >= expectedValues.length) {
                throw new RuntimeException("Unexpected evaluateSimplex call");
            }
            double[] values = expectedValues[evalCallCount];
            if (values.length != simplex.length) {
                throw new RuntimeException("Dimension mismatch in evaluateSimplex");
            }
            for (int i = 0; i < simplex.length; i++) {
                try {
                    Field valueField = RealPointValuePair.class.getDeclaredField("value");
                    valueField.setAccessible(true);
                    valueField.setDouble(simplex[i], values[i]);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            java.util.Arrays.sort(simplex, comparator);
            evalCallCount++;
        }

        public void setSimplex(RealPointValuePair[] s) {
            this.simplex = s;
        }

        public void iterateSimplexPublic(Comparator<RealPointValuePair> comparator)
                throws FunctionEvaluationException, OptimizationException, IllegalArgumentException {
            iterateSimplex(comparator);
        }

        public int getEvalCallCount() {
            return evalCallCount;
        }

        public double getKhiReflection() throws Exception {
            Field khiField = MultiDirectional.class.getDeclaredField("khi");
            khiField.setAccessible(true);
            return khiField.getDouble(this);
        }

        public double getGammaReflection() throws Exception {
            Field gammaField = MultiDirectional.class.getDeclaredField("gamma");
            gammaField.setAccessible(true);
            return gammaField.getDouble(this);
        }
    }

    private TestMultiDirectional optimizer;
    private Comparator<RealPointValuePair> comparatorByValue;

    @Before
    public void setUp() {
        optimizer = new TestMultiDirectional();
        comparatorByValue = new Comparator<RealPointValuePair>() {
            public int compare(RealPointValuePair o1, RealPointValuePair o2) {
                return Double.compare(o1.getValue(), o2.getValue());
            }
        };
    }

    @Test
    public void testDefaultConstructor() throws Exception {
        assertEquals(2.0, optimizer.getKhiReflection(), 1e-15);
        assertEquals(0.5, optimizer.getGammaReflection(), 1e-15);
    }

    @Test
    public void testConstructorWithCoefficients() throws Exception {
        TestMultiDirectional opt = new TestMultiDirectional(3.0, 0.25);
        assertEquals(3.0, opt.getKhiReflection(), 1e-15);
        assertEquals(0.25, opt.getGammaReflection(), 1e-15);
    }

    private RealPointValuePair[] createSimplex(int dimension) {
        RealPointValuePair[] s = new RealPointValuePair[dimension + 1];
        for (int i = 0; i <= dimension; i++) {
            s[i] = new RealPointValuePair(new double[]{i}, (double) i, false);
        }
        return s;
    }

    @Test
    public void testIterateSimplexReflectionAccepted() throws Exception {
        int n = 1;
        RealPointValuePair[] original = createSimplex(n);
        optimizer.setSimplex(original);

        double[][] evalValues = new double[][] {
            {0.0, -1.0},
            {0.0, -0.5}
        };
        optimizer.setExpectedValues(evalValues);

        optimizer.iterateSimplexPublic(comparatorByValue);

        assertEquals(-1.0, optimizer.simplex[0].getValue(), 1e-15);
        assertTrue(optimizer.simplex[0].getValue() < original[0].getValue());
    }

    @Test
    public void testIterateSimplexExpansionAccepted() throws Exception {
        int n = 1;
        RealPointValuePair[] original = createSimplex(n);
        optimizer.setSimplex(original);

        double[][] evalValues = new double[][] {
            {0.0, -1.0},
            {0.0, -2.0}
        };
        optimizer.setExpectedValues(evalValues);

        optimizer.iterateSimplexPublic(comparatorByValue);

        assertEquals(-2.0, optimizer.simplex[0].getValue(), 1e-15);
    }

    @Test
    public void testIterateSimplexContractionAccepted() throws Exception {
        int n = 1;
        RealPointValuePair[] original = createSimplex(n);
        optimizer.setSimplex(original);

        double[][] evalValues = new double[][] {
            {0.0, 0.5},
            {0.0, -0.5}
        };
        optimizer.setExpectedValues(evalValues);

        optimizer.iterateSimplexPublic(comparatorByValue);

        assertEquals(-0.5, optimizer.simplex[0].getValue(), 1e-15);
    }

    @Test
    public void testIterateSimplexContractionNotAcceptedLoopAgain() throws Exception {
        int n = 1;
        RealPointValuePair[] original = createSimplex(n);
        optimizer.setSimplex(original);

        double[][] evalValuesFull = new double[][] {
            {0.0, 0.5},
            {0.0, 1.0},
            {0.0, -1.0},
            {0.0, -0.5}
        };
        optimizer.setExpectedValues(evalValuesFull);

        optimizer.iterateSimplexPublic(comparatorByValue);

        assertEquals(-1.0, optimizer.simplex[0].getValue(), 1e-15);
        assertEquals(4, optimizer.getEvalCallCount());
    }
}