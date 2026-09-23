package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.Relationship;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class SimplexSolverTest {

    private static final double EPSILON = 1.0e-6;
    private SimplexSolver solver;

    @Before
    public void setUp() {
        solver = new SimplexSolver();
    }

    @After
    public void tearDown() {
        solver = null;
    }

    @Test
    public void testSimpleMaximization() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 3 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));
        
        try {
            PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
            Assert.assertNotNull(solution);
            Assert.assertEquals(10.0, solution.getValue(), EPSILON);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testSimpleMinimization() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.GEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));
        
        try {
            PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, false);
            Assert.assertNotNull(solution);
            Assert.assertEquals(4.0, solution.getValue(), EPSILON);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test(expected = UnboundedSolutionException.class)
    public void testUnboundedSolution() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 0 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));
        
        solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
    }

    @Test(expected = NoFeasibleSolutionException.class)
    public void testNoFeasibleSolution() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 2));
        
        solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
    }

    @Test
    public void testZeroIterationCase() {
        // Test with a problem that should converge immediately
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 0, 0 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));
        
        try {
            PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
            Assert.assertNotNull(solution);
            Assert.assertEquals(0.0, solution.getValue(), EPSILON);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testSingleConstraint() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        
        try {
            PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
            Assert.assertNotNull(solution);
            Assert.assertEquals(5.0, solution.getValue(), EPSILON);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testMixedConstraints() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 6));
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));
        
        try {
            PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
            Assert.assertNotNull(solution);
            Assert.assertEquals(6.0, solution.getValue(), EPSILON);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testDegenerateCase() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 0 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 8));
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));
        
        try {
            PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
            Assert.assertNotNull(solution);
            Assert.assertTrue(solution.getValue() >= 0);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testBoundaryConditions() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 2 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));
        
        try {
            PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
            Assert.assertNotNull(solution);
            Assert.assertEquals(0.0, solution.getValue(), EPSILON);
            Assert.assertEquals(0.0, solution.getPoint()[0], EPSILON);
            Assert.assertEquals(0.0, solution.getPoint()[1], EPSILON);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testMaxIterationsExceeded() {
        SimplexSolver limitedSolver = new SimplexSolver(SimplexSolver.DEFAULT_EPSILON, SimplexSolver.DEFAULT_ULPS);
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 0));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));
        
        try {
            PointValuePair solution = limitedSolver.optimize(f, constraints, GoalType.MAXIMIZE, false);
            Assert.assertNotNull(solution);
        } catch (MaxCountExceededException e) {
            // Expected, but shouldn't happen for a bounded problem
            Assert.fail("Unexpected MaxCountExceededException");
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }
}