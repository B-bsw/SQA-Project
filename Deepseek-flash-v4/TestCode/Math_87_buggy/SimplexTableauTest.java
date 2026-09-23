package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double EPS = 1e-8;

    private static Collection<LinearConstraint> constraints(LinearConstraint... cs) {
        return new ArrayList<LinearConstraint>(Arrays.asList(cs));
    }

    private static void checkArray(double[] expected, double[] actual, double tolerance) {
        assertEquals("array length", expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals("index " + i, expected[i], actual[i], tolerance);
        }
    }

    private static SimplexTableau emptyTableau() {
        return new SimplexTableau(
                new LinearObjectiveFunction(new double[] {2.0}, 0.0),
                new ArrayList<LinearConstraint>(),
                GoalType.MAXIMIZE,
                true,
                1.0e-6);
    }

    private static SimplexTableau artificialTableau() {
        return new SimplexTableau(
                new LinearObjectiveFunction(new double[] {-2.0, 1.0}, 0.0),
                constraints(
                        new LinearConstraint(new double[] {1.0, 1.0}, Relationship.GEQ, 10.0),
                        new LinearConstraint(new double[] {1.0, 0.0}, Relationship.EQ, -5.0)),
                GoalType.MINIMIZE,
                false,
                1.0e-6);
    }

    private static SimplexTableau simpleTableau(double epsilon) {
        return new SimplexTableau(
                new LinearObjectiveFunction(new double[] {1.0, 2.0}, 3.0),
                constraints(new LinearConstraint(new double[] {1.0, 0.0}, Relationship.LEQ, 3.0)),
                GoalType.MAXIMIZE,
                true,
                epsilon);
    }

    @Test
    public void testConstructorMaximizeNonNegative() {
        SimplexTableau tableau = new SimplexTableau(
                new LinearObjectiveFunction(new double[] {3.0, 5.0}, 0.0),
                constraints(
                        new LinearConstraint(new double[] {1.0, 0.0}, Relationship.LEQ, 4.0),
                        new LinearConstraint(new double[] {0.0, 1.0}, Relationship.LEQ, 6.0),
                        new LinearConstraint(new double[] {1.0, 1.0}, Relationship.LEQ, 7.0)),
                GoalType.MAXIMIZE,
                true,
                1.0e-6);

        assertEquals(2, tableau.getNumVariables());
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        assertEquals(3, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(7, tableau.getWidth());
        assertEquals(4, tableau.getHeight());
        assertEquals(3, tableau.getSlackVariableOffset());
        assertEquals(6, tableau.getArtificialVariableOffset());
        assertEquals(6, tableau.getRhsOffset());

        assertEquals(1.0, tableau.getEntry(0, 0), EPS);
        assertEquals(-3.0, tableau.getEntry(0, 1), EPS);
        assertEquals(-5.0, tableau.getEntry(0, 2), EPS);

        assertEquals(1.0, tableau.getEntry(1, 1), EPS);
        assertEquals(1.0, tableau.getEntry(1, 3), EPS);
        assertEquals(4.0, tableau.getEntry(1, 6), EPS);

        assertEquals(1.0, tableau.getEntry(2, 2), EPS);
        assertEquals(1.0, tableau.getEntry(2, 4), EPS);
        assertEquals(6.0, tableau.getEntry(2, 6), EPS);

        assertEquals(1.0, tableau.getEntry(3, 1), EPS);
        assertEquals(1.0, tableau.getEntry(3, 2), EPS);
        assertEquals(1.0, tableau.getEntry(3, 5), EPS);
        assertEquals(7.0, tableau.getEntry(3, 6), EPS);

        RealPointValuePair solution = tableau.getSolution();
        checkArray(new double[] {0.0, 0.0}, solution.getPoint(), EPS);
        assertEquals(0.0, solution.getValue(), EPS);
    }

    @Test
    public void testConstructorArtificialAndUnrestricted() {
        SimplexTableau tableau = artificialTableau();

        assertEquals(2, tableau.getNumVariables());
        assertEquals(3, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(2, tableau.getNumArtificialVariables());
        assertEquals(2, tableau.getNumObjectiveFunctions());
        assertEquals(9, tableau.getWidth());
        assertEquals(4, tableau.getHeight());
        assertEquals(5, tableau.getSlackVariableOffset());
        assertEquals(6, tableau.getArtificialVariableOffset());
        assertEquals(8, tableau.getRhsOffset());

        assertEquals(-1.0, tableau.getEntry(0, 0), EPS);
        assertEquals(0.0, tableau.getEntry(0, 2), EPS);
        assertEquals(-1.0, tableau.getEntry(0, 3), EPS);
        assertEquals(1.0, tableau.getEntry(0, 4), EPS);
        assertEquals(1.0, tableau.getEntry(0, 5), EPS);
        assertEquals(0.0, tableau.getEntry(0, 6), EPS);
        assertEquals(0.0, tableau.getEntry(0, 7), EPS);
        assertEquals(-15.0, tableau.getEntry(0, 8), EPS);

        assertEquals(-1.0, tableau.getEntry(1, 1), EPS);
        assertEquals(-2.0, tableau.getEntry(1, 2), EPS);
        assertEquals(1.0, tableau.getEntry(1, 3), EPS);
        assertEquals(1.0, tableau.getEntry(1, 4), EPS);

        assertEquals(1.0, tableau.getEntry(2, 2), EPS);
        assertEquals(1.0, tableau.getEntry(2, 3), EPS);
        assertEquals(-2.0, tableau.getEntry(2, 4), EPS);
        assertEquals(-1.0, tableau.getEntry(2, 5), EPS);
        assertEquals(1.0, tableau.getEntry(2, 6), EPS);
        assertEquals(10.0, tableau.getEntry(2, 8), EPS);

        assertEquals(-1.0, tableau.getEntry(3, 2), EPS);
        assertEquals(1.0, tableau.getEntry(3, 4), EPS);
        assertEquals(1.0, tableau.getEntry(3, 7), EPS);
        assertEquals(5.0, tableau.getEntry(3, 8), EPS);

        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(2, normalized.size());

        assertEquals(Relationship.GEQ, normalized.get(0).getRelationship());
        assertEquals(10.0, normalized.get(0).getValue(), EPS);
        checkArray(new double[] {1.0, 1.0}, normalized.get(0).getCoefficients().getData(), EPS);

        assertEquals(Relationship.EQ, normalized.get(1).getRelationship());
        assertEquals(5.0, normalized.get(1).getValue(), EPS);
        checkArray(new double[] {-1.0, 0.0}, normalized.get(1).getCoefficients().getData(), EPS);
    }

    @Test
    public void testDiscardArtificialVariables() {
        SimplexTableau tableau = artificialTableau();

        tableau.discardArtificialVariables();

        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(6, tableau.getWidth());
        assertEquals(3, tableau.getHeight());

        checkArray(new double[] {-1.0, -2.0, 1.0, 1.0, 0.0, 0.0}, tableau.getData()[0], EPS);
        checkArray(new double[] {0.0, 1.0, 1.0, -2.0, -1.0, 10.0}, tableau.getData()[1], EPS);
        checkArray(new double[] {0.0, -1.0, 0.0, 1.0, 0.0, 5.0}, tableau.getData()[2], EPS);
    }

    @Test
    public void testGetSolution() {
        SimplexTableau tableau = new SimplexTableau(
                new LinearObjectiveFunction(new double[] {1.0, 1.0}, 0.0),
                constraints(
                        new LinearConstraint(new double[] {1.0, 0.0}, Relationship.LEQ, 4.0),
                        new LinearConstraint(new double[] {0.0, 1.0}, Relationship.LEQ, 6.0)),
                GoalType.MAXIMIZE,
                true,
                1.0e-6);

        RealPointValuePair solution = tableau.getSolution();
        checkArray(new double[] {4.0, 6.0}, solution.getPoint(), EPS);
        assertEquals(10.0, solution.getValue(), EPS);
    }

    @Test
    public void testEmptyConstraints() {
        SimplexTableau tableau = emptyTableau();

        assertEquals(1, tableau.getNumVariables());
        assertEquals(1, tableau.getNumDecisionVariables());
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(3, tableau.getWidth());
        assertEquals(1, tableau.getHeight());

        assertEquals(1.0, tableau.getEntry(0, 0), EPS);
        assertEquals(-2.0, tableau.getEntry(0, 1), EPS);
        assertEquals(0.0, tableau.getEntry(0, 2), EPS);
    }

    @Test
    public void testRowOperations() {
        SimplexTableau tableau = emptyTableau();

        tableau.divideRow(0, 2.0);
        assertEquals(0.5, tableau.getEntry(0, 0), EPS);
        assertEquals(-1.0, tableau.getEntry(0, 1), EPS);
        assertEquals(0.0, tableau.getEntry(0, 2), EPS);

        tableau.subtractRow(0, 0, 1.0);
        assertEquals(0.0, tableau.getEntry(0, 0), EPS);
        assertEquals(0.0, tableau.getEntry(0, 1), EPS);
        assertEquals(0.0, tableau.getEntry(0, 2), EPS);
    }

    @Test
    public void testEqualsAndHashCode() {
        SimplexTableau t1 = simpleTableau(1.0e-6);
        SimplexTableau t2 = simpleTableau(1.0e-6);
        SimplexTableau t3 = simpleTableau(1.0e-5);

        assertTrue(t1.equals(t1));
        assertTrue(t1.equals(t2));
        assertEquals(t1.hashCode(), t2.hashCode());
        assertFalse(t1.equals(null));
        assertFalse(t1.equals("not a tableau"));
        assertFalse(t1.equals(t3));
    }

    @Test(expected = NullPointerException.class)
    public void testNullObjectiveThrowsNullPointerException() {
        new SimplexTableau(
                null,
                constraints(new LinearConstraint(new double[] {1.0}, Relationship.LEQ, 1.0)),
                GoalType.MAXIMIZE,
                true,
                1.0e-6);
    }
}