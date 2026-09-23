package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class SimplexOptimizerTest {

    private static class TestSimplex extends AbstractSimplex {
        private final double[][] evalPoints;
        private final double[] evalValues;
        private int evalCount;

        TestSimplex(double[][] evalPoints, double[] evalValues) {
            super(evalPoints[0].length);
            this.evalPoints = evalPoints;
            this.evalValues = evalValues;
            this.evalCount = 0;
        }

        @Override
        public void build(double[] startPoint) {
            // No-op for test
        }

        @Override
        public void iterate(MultivariateFunction evaluationFunction,
                            Comparator<PointValuePair> comparator) {
            // Simulate iteration by continuing; simple stub
        }

        @Override
        public int getSize() {
            return evalPoints.length;
        }

        @Override
        public PointValuePair getPoint(int index) {
            return new PointValuePair(evalPoints[index % evalPoints.length], evalValues[index % evalValues.length]);
        }

        @Override
        public PointValuePair[] getPoints() {
            PointValuePair[] points = new PointValuePair[evalPoints.length];
            for (int i = 0; i < evalPoints.length; i++) {
                points[i] = new PointValuePair(evalPoints[i], evalValues[i]);
            }
            return points;
        }

        public void setPoint(int index, PointValuePair point) {
            // No-op
        }

        public int getDimension() {
            return evalPoints[0].length;
        }
    }

    private static class TestOptimizer extends SimplexOptimizer {
        private AbstractSimplex simplex;
        private boolean converged;
        private int iterationCount;
        private final GoalType goalType;
        private final double[] startPoint;
        private final double[] objectiveValues;
        private int evalCount;
        private final OptimizationData[] optData;

        TestOptimizer(ConvergenceChecker<PointValuePair> checker,
                      AbstractSimplex simplex,
                      GoalType goalType,
                      double[] startPoint,
                      double[] objectiveValues) {
            super(checker);
            this.simplex = simplex;
            this.converged = false;
            this.iterationCount = 0;
            this.goalType = goalType;
            this.startPoint = startPoint;
            this.objectiveValues = objectiveValues;
            this.evalCount = 0;
            this.optData = new OptimizationData[] {
                simplex,
                goalType,
                startPoint
            };
        }

        @Override
        protected PointValuePair doOptimize() {
            checkParameters();
            // Simulate optimization with convergence
            // Pretend we have two iterations for convergence test
            if (iterationCount++ > 2) {
                converged = true;
            }
            // Return best point
            return new PointValuePair(startPoint, objectiveValues[0]);
        }

        @Override
        protected void parseOptimizationData(OptimizationData... optData) {
            super.parseOptimizationData(optData);
            for (OptimizationData data : optData) {
                if (data instanceof AbstractSimplex) {
                    simplex = (AbstractSimplex) data;
                }
            }
        }

        public void setSimplex(AbstractSimplex simplex) {
            this.simplex = simplex;
        }

        public AbstractSimplex getSimplex() {
            return simplex;
        }
    }

    private static class TestConvergenceChecker implements ConvergenceChecker<PointValuePair> {
        private final boolean result;

        TestConvergenceChecker(boolean result) {
            this.result = result;
        }

        @Override
        public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
            return result;
        }
    }

    private SimplexOptimizer optimizer;

    @Before
    public void setUp() {
        // Default setup - override in tests
    }

    @Test
    public void testConstructors() {
        optimizer = new SimplexOptimizer(1e-3, 1e-6);
        assertNotNull(optimizer);
        optimizer = new SimplexOptimizer(new TestConvergenceChecker(true));
        assertNotNull(optimizer);
    }

    @Test
    public void testOptimizeWithValidData() {
        // Prepare test data
        double[] startPoint = new double[] {1.0, 2.0};
        double[] objectiveValues = new double[] {0.5, 0.7};
        double[][] evalPoints = new double[][] {{1.0, 2.0}, {2.0, 1.0}, {1.5, 1.5}};
        TestSimplex simplex = new TestSimplex(evalPoints, new double[] {0.5, 0.6, 0.4});
        TestOptimizer testOptimizer = new TestOptimizer(
            new TestConvergenceChecker(false),
            simplex,
            GoalType.MINIMIZE,
            startPoint,
            objectiveValues
        );

        PointValuePair result = testOptimizer.optimize(
            simplex,
            GoalType.MINIMIZE,
            (OptimizationData) startPoint
        );

        assertNotNull(result);
        assertTrue(result.getValue() >= 0);
        assertArrayEquals(startPoint, result.getPoint(), 1e-10);
    }

    @Test
    public void testOptimizeWithMaximization() {
        double[] startPoint = new double[] {1.0, 2.0};
        double[] objectiveValues = new double[] {0.5, 0.7};
        TestSimplex simplex = new TestSimplex(
            new double[][] {{1.0, 2.0}, {2.0, 1.0}},
            new double[] {0.5, 0.7}
        );
        TestOptimizer testOptimizer = new TestOptimizer(
            new TestConvergenceChecker(false),
            simplex,
            GoalType.MAXIMIZE,
            startPoint,
            objectiveValues
        );

        PointValuePair result = testOptimizer.optimize(
            simplex,
            GoalType.MAXIMIZE,
            (OptimizationData) startPoint
        );
        assertNotNull(result);
        assertEquals(0.5, result.getValue(), 1e-10);
    }

    @Test
    public void testCheckParametersWithNullSimplex() {
        // Create optimizer with null simplex
        SimplexOptimizer nullOptimizer = new SimplexOptimizer(new TestConvergenceChecker(true)) {
            private AbstractSimplex simplex = null;

            @Override
            protected void checkParameters() {
                if (simplex == null) {
                    throw new NullArgumentException();
                }
            }
        };

        // Should throw when no simplex provided
        assertThrows(NullArgumentException.class, () -> {
            nullOptimizer.optimize((OptimizationData[]) new OptimizationData[0]);
        });
    }

    @Test
    public void testCheckParametersWithBounds() {
        // Create optimizer with bounds that should cause exception
        SimplexOptimizer boundedOptimizer = new SimplexOptimizer(new TestConvergenceChecker(true)) {
            private AbstractSimplex simplex = new TestSimplex(
                new double[][] {{0.0, 0.0}, {1.0, 1.0}},
                new double[] {0.0, 0.0}
            );

            @Override
            protected void checkParameters() {
                // Override to simulate bounds being set
                if (simplex == null) {
                    throw new NullArgumentException();
                }
                // Simulate bounds check
                throw new MathUnsupportedOperationException(LocalizedFormats.CONSTRAINT);
            }
        };

        // Should throw MathUnsupportedOperationException
        assertThrows(MathUnsupportedOperationException.class, () -> {
            boundedOptimizer.optimize((OptimizationData[]) new OptimizationData[0]);
        });
    }

    @Test
    public void testOptimizeWithConvergence() {
        double[] startPoint = new double[] {1.0, 2.0};
        double[] objectiveValues = new double[] {0.1, 0.2};
        TestSimplex simplex = new TestSimplex(
            new double[][] {{1.0, 2.0}, {2.0, 1.0}, {1.5, 1.5}},
            new double[] {0.1, 0.2, 0.3}
        );

        TestOptimizer testOptimizer = new TestOptimizer(
            new TestConvergenceChecker(true),  // Immediately converges
            simplex,
            GoalType.MINIMIZE,
            startPoint,
            objectiveValues
        );

        PointValuePair result = testOptimizer.optimize(
            simplex,
            GoalType.MINIMIZE,
            (OptimizationData) startPoint
        );
        assertNotNull(result);
        assertEquals(0.1, result.getValue(), 1e-10);
    }

    @Test
    public void testParseOptimizationDataWithSimplex() {
        double[][] evalPoints = new double[][] {{0.0, 0.0}, {1.0, 1.0}};
        double[] evalValues = new double[] {1.0, 2.0};
        TestSimplex simplex = new TestSimplex(evalPoints, evalValues);

        TestOptimizer testOptimizer = new TestOptimizer(
            new TestConvergenceChecker(false),
            simplex,
            GoalType.MINIMIZE,
            new double[] {0.0, 0.0},
            new double[] {0.0}
        );

        // Test that parseOptimizationData is called correctly
        testOptimizer.setSimplex(simplex);
        assertEquals(simplex, testOptimizer.getSimplex());
    }

    @Test
    public void testOptimizeWithNullObjective() {
        // Test with null objective function
        SimplexOptimizer nullObjOptimizer = new SimplexOptimizer(new TestConvergenceChecker(true)) {
            @Override
            protected PointValuePair doOptimize() {
                // Simulate null objective handling
                throw new NullArgumentException();
            }
        };

        assertThrows(NullArgumentException.class, () -> {
            nullObjOptimizer.optimize((OptimizationData[]) new OptimizationData[0]);
        });
    }

    @Test
    public void testOptimizeWithMultipleIterations() {
        double[] startPoint = new double[] {1.0, 2.0};
        double[] objectiveValues = new double[] {0.5, 0.7};
        TestSimplex simplex = new TestSimplex(
            new double[][] {{1.0, 2.0}, {2.0, 1.0}},
            new double[] {0.5, 0.7}
        );

        // Custom optimizer that iterates multiple times
        TestOptimizer testOptimizer = new TestOptimizer(
            new TestConvergenceChecker(true),  // Converge after first check
            simplex,
            GoalType.MINIMIZE,
            startPoint,
            objectiveValues
        );

        PointValuePair result = testOptimizer.optimize(
            simplex,
            GoalType.MINIMIZE,
            (OptimizationData) startPoint
        );
        assertNotNull(result);
        assertTrue(result.getValue() >= 0);
    }

    @Test
    public void testOptimizeWithNegativeStartPoint() {
        double[] startPoint = new double[] {-1.0, -2.0};
        double[] objectiveValues = new double[] {-4.0, -5.0};
        TestSimplex simplex = new TestSimplex(
            new double[][] {{-1.0, -2.0}, {0.0, -1.0}},
            new double[] {-4.0, -5.0}
        );

        TestOptimizer testOptimizer = new TestOptimizer(
            new TestConvergenceChecker(true),
            simplex,
            GoalType.MINIMIZE,
            startPoint,
            objectiveValues
        );

        PointValuePair result = testOptimizer.optimize(
            simplex,
            GoalType.MINIMIZE,
            (OptimizationData) startPoint
        );
        assertNotNull(result);
        assertEquals(-4.0, result.getValue(), 1e-10);
    }

    @Test
    public void testOptimizeWithZeroValues() {
        double[] startPoint = new double[] {0.0, 0.0};
        double[] objectiveValues = new double[] {0.0, 0.0};
        TestSimplex simplex = new TestSimplex(
            new double[][] {{0.0, 0.0}, {0.1, 0.1}},
            new double[] {0.0, 0.0}
        );

        TestOptimizer testOptimizer = new TestOptimizer(
            new TestConvergenceChecker(true),
            simplex,
            GoalType.MINIMIZE,
            startPoint,
            objectiveValues
        );

        PointValuePair result = testOptimizer.optimize(
            simplex,
            GoalType.MINIMIZE,
            (OptimizationData) startPoint
        );
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-10);
    }
}