package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Collections;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;

public class SimplexSolverTest {

    private SimplexSolver solver;

    @Before
    public void setUp() {
        solver = new SimplexSolver();
    }

    private SimplexTableau createTableau(final double[][] data,
                                        final int numObjFunc,
                                        final int numArtVar,
                                        final int rhsOffset) {
        return new SimplexTableau(
                new LinearObjectiveFunction(new double[]{0, 0}, 0),
                Collections.<LinearConstraint>emptyList(),
                GoalType.MAXIMIZE,
                true,
                0.0) {
            private double[][] entries = data;
            private int height = data.length;
            private int width = data[0].length;
            private int numObj = numObjFunc;
            private int numArt = numArtVar;
            private int rhsOff = rhsOffset;

            @Override
            public int getNumObjectiveFunctions() { return numObj; }

            @Override
            public int getWidth() { return width; }

            @Override
            public int getHeight() { return height; }

            @Override
            public double getEntry(int row, int col) { return entries[row][col]; }

            @Override
            public void divideRow(int row, double val) {
                for (int c = 0; c < width; c++) {
                    entries[row][c] /= val;
                }
            }

            @Override
            public void subtractRow(int row, int refRow, double multiplier) {
                for (int c = 0; c < width; c++) {
                    entries[row][c] -= multiplier * entries[refRow][c];
                }
            }

            @Override
            public int getNumArtificialVariables() { return numArt; }

            @Override
            public int getRhsOffset() { return rhsOff; }

            @Override
            public void discardArtificialVariables() { }

            @Override
            public RealPointValuePair getSolution() { return null; }
        };
    }

    @Test
    public void testDoIterationNormal() throws OptimizationException {
        double[][] data = new double[][] {
            { -1, -2, 0, 0, 0 },
            {  1,  1, 1, 0, 4 },
            {  2,  1, 0, 1, 6 }
        };
        SimplexTableau tableau = createTableau(data, 1, 0, 4);
        solver.doIteration(tableau);
        assertEquals(1.0, tableau.getEntry(1, 0), 1e-12);
        assertEquals(0.0, tableau.getEntry(0, 0), 1e-12);
    }

    @Test(expected = UnboundedSolutionException.class)
    public void testDoIterationUnbounded() throws OptimizationException {
        // no positive entry in pivot column -> pivotRow = null
        double[][] data = new double[][] {
            { -1,  0, 0, 0 },
            { -1,  2, 1, 4 },
            { -2,  1, 0, 6 }
        };
        SimplexTableau tableau = createTableau(data, 1, 0, 3);
        solver.doIteration(tableau);
    }

    @Test
    public void testIsOptimalArtificialVars() {
        double[][] data = new double[][] {
            { 1, 0, 0, 0 },
            { 0, 1, 1, 4 }
        };
        SimplexTableau tableau = createTableau(data, 1, 2, 3); // numArt = 2
        assertFalse(solver.isOptimal(tableau));
    }

    @Test
    public void testIsOptimalNegativeCoeff() {
        double[][] data = new double[][] {
            { -0.5, 0, 0, 0 },
            {  0.5, 1, 1, 4 }
        };
        SimplexTableau tableau = createTableau(data, 1, 0, 3);
        assertFalse(solver.isOptimal(tableau));
    }

    @Test
    public void testIsOptimalTrue() {
        double[][] data = new double[][] {
            { 0, 0.5, 0, 0 },
            { 1, 0.0, 1, 4 }
        };
        SimplexTableau tableau = createTableau(data, 1, 0, 3);
        assertTrue(solver.isOptimal(tableau));
    }

    @Test
    public void testSolvePhase1NoArtificial() throws OptimizationException {
        double[][] data = new double[][] {
            { 1, 0, 0 },
            { 0, 1, 2 }
        };
        SimplexTableau tableau = createTableau(data, 1, 0, 2);
        solver.solvePhase1(tableau);
    }

    @Test
    public void testSolvePhase1Feasible() throws OptimizationException {
        // Phase 1 not solved initially, but after one iteration W becomes zero
        double[][] data = new double[][] {
            { -1,  0,  0,  0 },
            {  1,  1,  1,  4 }
        };
        SimplexTableau tableau = createTableau(data, 1, 1, 3);
        solver.solvePhase1(tableau);
        // Should succeed because W entry at rhsOffset becomes 0 after iteration
        assertEquals(0.0, tableau.getEntry(0, tableau.getRhsOffset()), 1e-12);
    }

    @Test(expected = NoFeasibleSolutionException.class)
    public void testSolvePhase1Infeasible() throws OptimizationException {
        double[][] data = new double[][] {
            {  1,  0,  0,  1 },
            {  1,  1,  1,  4 }
        };
        SimplexTableau tableau = createTableau(data, 1, 1, 3);
        solver.solvePhase1(tableau);
    }

    @Test
    public void testDoOptimizeSimple() throws OptimizationException {
        // Maximize x + y subject to x + y <= 1, x >= 0, y >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        java.util.Collection<LinearConstraint> constraints = new java.util.ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 1));
        solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
        RealPointValuePair solution = solver.doOptimize();
        assertEquals(1.0, solution.getValue(), 1e-6);
        assertEquals(0.0, solution.getPoint()[0], 1e-6);
        assertEquals(1.0, solution.getPoint()[1], 1e-6);
    }
}