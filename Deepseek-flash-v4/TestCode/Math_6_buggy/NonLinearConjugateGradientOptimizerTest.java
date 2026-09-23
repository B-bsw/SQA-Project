package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;

import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;

public class NonLinearConjugateGradientOptimizerTest {

    private static final double EPS = 1e-6;
    
    private NonLinearConjugateGradientOptimizer optimizer;
    private ConvergenceChecker<PointValuePair> checker;
    
    @Before
    public void setUp() {
        checker = new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                if (previous == null) return false;
                double diff = Math.abs(previous.getValue() - current.getValue());
                return diff < 1e-8;
            }
        };
    }
    
    @After
    public void tearDown() {
        optimizer = null;
    }

    @Test
    public void testConstructorWithDefaultSolver() {
        optimizer = new NonLinearConjugateGradientOptimizer(
            NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES, checker);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorWithCustomSolver() {
        org.apache.commons.math3.analysis.solvers.BrentSolver solver = 
            new org.apache.commons.math3.analysis.solvers.BrentSolver();
        optimizer = new NonLinearConjugateGradientOptimizer(
            NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE, checker, solver);
        assertNotNull(optimizer);
    }

    @Test
    public void testBracketingStepGetBracketingStep() {
        NonLinearConjugateGradientOptimizer.BracketingStep step = 
            new NonLinearConjugateGradientOptimizer.BracketingStep(2.5);
        assertEquals(2.5, step.getBracketingStep(), 0.0);
    }

    @Test
    public void testIdentityPreconditioner() {
        NonLinearConjugateGradientOptimizer.IdentityPreconditioner precond = 
            new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] r = {1.0, 2.0, 3.0};
        double[] result = precond.precondition(new double[]{0,0,0}, r);
        assertArrayEquals(r, result, 0.0);
        assertNotSame(r, result);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimizeWithBounds() {
        optimizer = new NonLinearConjugateGradientOptimizer(
            NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES, checker);
        
        double[] startPoint = {1.0, 1.0};
        org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyBox.UnboundedPenaltyBox penaltyBox = null;
        
        optimizer.optimize(
            new MaxEval(100),
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] point) {
                    return point[0]*point[0] + point[1]*point[1];
                }
            }),
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return new double[]{2*point[0], 2*point[1]};
                }
            }),
            GoalType.MINIMIZE,
            new InitialGuess(startPoint)
        );
    }

    @Test
    public void testOptimizeSimpleQuadratic() {
        optimizer = new NonLinearConjugateGradientOptimizer(
            NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES, checker);
        
        double[] startPoint = {5.0, 3.0};
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] point) {
                    return point[0]*point[0] + point[1]*point[1] + 1;
                }
            }),
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return new double[]{2*point[0], 2*point[1]};
                }
            }),
            GoalType.MINIMIZE,
            new InitialGuess(startPoint)
        );
        
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(1.0, result.getValue(), 1e-3);
    }

    @Test
    public void testFindUpperBound() throws Exception {
        optimizer = new NonLinearConjugateGradientOptimizer(
            NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES, checker);
        
        java.lang.reflect.Method method = 
            NonLinearConjugateGradientOptimizer.class.getDeclaredMethod("findUpperBound", 
                UnivariateFunction.class, double.class, double.class);
        method.setAccessible(true);
        
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 2;
            }
        };
        
        double bound = (Double) method.invoke(optimizer, f, 0.0, 0.1);
        assertTrue(bound > 0);
        assertTrue(f.value(bound) >= 0);
    }

    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBoundNoBracket() throws Throwable {
        optimizer = new NonLinearConjugateGradientOptimizer(
            NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES, checker);
        
        java.lang.reflect.Method method = 
            NonLinearConjugateGradientOptimizer.class.getDeclaredMethod("findUpperBound", 
                UnivariateFunction.class, double.class, double.class);
        method.setAccessible(true);
        
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x*x + 1; // Always positive
            }
        };
        
        try {
            method.invoke(optimizer, f, 0.0, 0.1);
            fail("Expected MathIllegalStateException");
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw e.getCause();
        }
    }

    @Test
    public void testOptimizePolakRibiere() {
        optimizer = new NonLinearConjugateGradientOptimizer(
            NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE, checker);
        
        double[] startPoint = {2.0, 1.0};
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] point) {
                    return (point[0]-1)*(point[0]-1) + (point[1]+2)*(point[1]+2);
                }
            }),
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return new double[]{2*(point[0]-1), 2*(point[1]+2)};
                }
            }),
            GoalType.MINIMIZE,
            new InitialGuess(startPoint)
        );
        
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test
    public void testOptimizeWithBracketingStep() {
        optimizer = new NonLinearConjugateGradientOptimizer(
            NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES, checker);
        
        double[] startPoint = {3.0, 3.0};
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] point) {
                    return point[0]*point[0] + 2*point[1]*point[1];
                }
            }),
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return new double[]{2*point[0], 4*point[1]};
                }
            }),
            GoalType.MINIMIZE,
            new InitialGuess(startPoint),
            new NonLinearConjugateGradientOptimizer.BracketingStep(0.5)
        );
        
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(0.0, result.getValue(), 1e-3);
    }
}