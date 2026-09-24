package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

public class SimplexTableauTest {

    private LinearObjectiveFunction f;
    private Collection<LinearConstraint> constraints;

    @Before
    public void setUp() {
        f = new LinearObjectiveFunction(new double[] { 3, 2 }, 5);
        constraints = new ArrayList<LinearConstraint>();
    }

    @Test
    public void testConstructorBasicConstraints() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testConstructorWithEQConstraint() {
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(1, tableau.getNumArtificialVariables());
    }

    @Test
    public void testConstructorWithGEQConstraint() {
        constraints.add(new LinearConstraint(new double[] { 2, 1 }, Relationship.GEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(1, tableau.getNumArtificialVariables());
    }

    @Test
    public void testConstructorNotRestrictedToNonNegative() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertEquals(3, tableau.getNumDecisionVariables()); // 2 + 1 extra
        assertEquals(1, tableau.getNumSlackVariables());
    }

    @Test
    public void testGetNumVariables() {
        assertEquals(2, f.getCoefficients().getDimension());
    }

    @Test
    public void testGetNormalizedConstraintsWithNegativeRHS() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, -4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(1, tableau.getNormalizedConstraints().size());
        assertEquals(4.0, tableau.getNormalizedConstraints().get(0).getValue(), 1e-6);
    }

    @Test
    public void testNormalizeWithPositiveRHS() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(4.0, tableau.getNormalizedConstraints().get(0).getValue(), 1e-6);
    }

    @Test
    public void testGetNumObjectiveFunctionsPhase1() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.EQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumObjectiveFunctions());
    }

    @Test
    public void testGetNumObjectiveFunctionsPhase2() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(1, tableau.getNumObjectiveFunctions());
    }

    @Test
    public void testGetInvertedCoefficientSum() {
        RealVector vec = new org.apache.commons.math.linear.RealVectorImpl(new double[] { 1, 2, 3 });
        assertEquals(-6.0, SimplexTableau.getInvertedCoeffiecientSum(vec), 1e-6);
    }

    @Test
    public void testGetSolutionBasic() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
    }

    @Test
    public void testGetSolutionNotRestricted() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
    }

    @Test
    public void testDivideRow() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        double original = tableau.getEntry(2, 0);
        tableau.divideRow(2, 2.0);
        assertEquals(original / 2.0, tableau.getEntry(2, 0), 1e-6);
    }

    @Test
    public void testSubtractRow() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        double before = tableau.getEntry(1, 0);
        tableau.subtractRow(1, 2, 1.0);
        assertEquals(before - tableau.getEntry(2, 0), tableau.getEntry(1, 0), 1e-6);
    }

    @Test
    public void testGetWidth() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertTrue(tableau.getWidth() > 0);
    }

    @Test
    public void testGetHeight() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(3, tableau.getHeight()); // 2 obj rows + 1 constraint
    }

    @Test
    public void testGetEntry() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(4.0, tableau.getEntry(2, tableau.getRhsOffset()), 1e-6);
    }

    @Test
    public void testSetEntry() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        tableau.setEntry(2, 0, 99.0);
        assertEquals(99.0, tableau.getEntry(2, 0), 1e-6);
    }

    @Test
    public void testGetSlackVariableOffset() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(3, tableau.getSlackVariableOffset()); // 1 obj + 2 dec vars
    }

    @Test
    public void testGetArtificialVariableOffset() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.EQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(4, tableau.getArtificialVariableOffset()); // 2 obj + 2 dec + 0 slack
    }

    @Test
    public void testGetRhsOffset() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(tableau.getWidth() - 1, tableau.getRhsOffset());
    }

    @Test
    public void testGetOriginalNumDecisionVariables() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testGetOriginalNumDecisionVariablesNotRestricted() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // 3 - 1
    }

    @Test
    public void testEqualsSameObject() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertTrue(tableau.equals(tableau));
    }

    @Test
    public void testEqualsNull() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertFalse(tableau.equals(null));
    }

    @Test
    public void testHashCodeConsistency() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        int code1 = tableau.hashCode();
        int code2 = tableau.hashCode();
        assertEquals(code1, code2);
    }

    @Test
    public void testDiscardArtificialVariables() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.EQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertTrue(tableau.getNumArtificialVariables() > 0);
        tableau.discardArtificialVariables();
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testDiscardArtificialVariablesNone() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(0, tableau.getNumArtificialVariables());
        tableau.discardArtificialVariables();
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testGetData() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        double[][] data = tableau.getData();
        assertNotNull(data);
        assertTrue(data.length > 0);
    }

    @Test
    public void testConstructorWithEmptyConstraints() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(0, tableau.getNormalizedConstraints().size());
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullObjective() {
        new SimplexTableau(null, constraints, GoalType.MAXIMIZE, true, 1e-6);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullConstraints() {
        new SimplexTableau(f, null, GoalType.MAXIMIZE, true, 1e-6);
    }
}