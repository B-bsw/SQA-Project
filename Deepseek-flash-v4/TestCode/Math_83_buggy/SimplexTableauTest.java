package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealVector;

public class SimplexTableauTest {

    private LinearObjectiveFunction f;
    private Collection<LinearConstraint> constraints;
    private double epsilon;

    @Before
    public void setUp() {
        epsilon = 1e-6;
    }

    @Test
    public void testConstructorBasicMaximizePositive() {
        f = new LinearObjectiveFunction(new double[]{3, 5}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.LEQ, 8));
        constraints.add(new LinearConstraint(new double[]{1, 2}, Relationship.LEQ, 10));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, epsilon);
        assertEquals(2, tableau.getNumVariables());
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(4, tableau.getWidth());
        assertEquals(3, tableau.getHeight());
        assertEquals(0.0, tableau.getEntry(0, 0), epsilon);
        assertEquals(-1.0, tableau.getEntry(1, 1), epsilon);
    }

    @Test
    public void testConstructorMinimize() {
        f = new LinearObjectiveFunction(new double[]{2, 3}, 5);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, epsilon);
        assertEquals(2, tableau.getNumVariables());
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(5, tableau.getWidth());
        assertEquals(3, tableau.getHeight());
        assertTrue(tableau.getEntry(0, 0) == -1.0);
    }

    @Test
    public void testConstructorNotRestrictedToNonNegative() {
        f = new LinearObjectiveFunction(new double[]{1, -2}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, epsilon);
        assertEquals(3, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(1, tableau.getNumArtificialVariables());
        assertNotNull(tableau.getNegativeDecisionVariableOffset());
        int slackOffset = tableau.getSlackVariableOffset();
        int artificialOffset = tableau.getArtificialVariableOffset();
        assertEquals(4, slackOffset);
        assertEquals(5, artificialOffset);
    }

    @Test
    public void testConstructorWithNegativeRHS() {
        f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, -3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, epsilon);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        assertEquals(3.0, normalized.get(0).getValue(), epsilon);
        assertEquals(Relationship.GEQ, normalized.get(0).getRelationship());
    }

    @Test
    public void testGetNormalizedConstraintsWithPositive() {
        f = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, epsilon);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        assertEquals(5.0, normalized.get(0).getValue(), epsilon);
        assertEquals(Relationship.LEQ, normalized.get(0).getRelationship());
    }

    @Test
    public void testEqualsAndHashCode() {
        f = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau t1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, epsilon);
        SimplexTableau t2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, epsilon);
        assertTrue(t1.equals(t2));
        assertTrue(t2.equals(t1));
        assertEquals(t1.hashCode(), t2.hashCode());
        // different goal type
        SimplexTableau t3 = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, epsilon);
        assertFalse(t1.equals(t3));
    }

    @Test
    public void testGetSolutionWithNegativeDecisionVariable() {
        // Problem with unrestricted variables so that x- column exists
        f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, epsilon);
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
        assertTrue(solution.getPoint()[0] >= 0);
        assertTrue(solution.getPoint()[1] >= 0);
    }

    @Test
    public void testGetSolutionBasicRows() {
        f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, epsilon);
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
        assertEquals(5.0, solution.getPoint()[0], epsilon);
        assertEquals(0.0, solution.getPoint()[1], epsilon);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullObjectiveFunction() {
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        new SimplexTableau(null, constraints, GoalType.MAXIMIZE, true, epsilon);
    }

    @Test
    public void testEmptyConstraints() {
        f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        constraints = new ArrayList<LinearConstraint>();
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, epsilon);
        assertEquals(2, tableau.getNumVariables());
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(3, tableau.getWidth());
        assertEquals(1, tableau.getHeight());
    }

    @Test
    public void testGetRhsOffset() {
        f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, epsilon);
        assertEquals(tableau.getWidth() - 1, tableau.getRhsOffset());
    }

    @Test
    public void testDiscardArtificialVariables() {
        f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, epsilon);
        assertEquals(1, tableau.getNumArtificialVariables());
        tableau.discardArtificialVariables();
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(4, tableau.getWidth()); // two decision, one slack, RHS
        assertEquals(1, tableau.getHeight()); // only phase 2 objective
    }

    @Test
    public void testGetNegativeDecisionVariableOffset() {
        f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, epsilon);
        int offset = tableau.getNegativeDecisionVariableOffset();
        assertEquals(tableau.getNumObjectiveFunctions() + tableau.getOriginalNumDecisionVariables(), offset);
    }

    @Test
    public void testInvertedCoefficientSum() {
        RealVector coeff = new ArrayRealVector(new double[]{2, 3, -4});
        double sum = SimplexTableau.getInvertedCoeffiecientSum(coeff);
        assertEquals(-1.0, sum, epsilon); // -(2+3-4) = -1
    }
}