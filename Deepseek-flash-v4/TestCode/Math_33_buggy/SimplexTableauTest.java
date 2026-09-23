package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;

public class SimplexTableauTest {
    private static final double EPSILON = 1.0e-10;
    private static final int MAX_ULPS = 10;

    private LinearObjectiveFunction objectiveFunction;
    private Collection<LinearConstraint> constraints;
    private SimplexTableau tableau;

    @Before
    public void setUp() {
        objectiveFunction = new LinearObjectiveFunction(new double[] {2, 3}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] {2, 1}, Relationship.GEQ, 3));
        constraints.add(new LinearConstraint(new double[] {1, 2}, Relationship.EQ, 3));
        tableau = new SimplexTableau(objectiveFunction, constraints, GoalType.MAXIMIZE, true, EPSILON);
    }

    @After
    public void tearDown() {
        tableau = null;
        constraints = null;
        objectiveFunction = null;
    }

    @Test
    public void testConstructor() {
        Assert.assertNotNull(tableau);
        Assert.assertEquals(3, tableau.getWidth());
        Assert.assertEquals(5, tableau.getHeight());
        Assert.assertEquals(2, tableau.getNumDecisionVariables());
        Assert.assertEquals(0, tableau.getNumSlackVariables());
        Assert.assertEquals(2, tableau.getNumArtificialVariables());
    }

    @Test
    public void testNormalizeConstraintsPositiveRHS() {
        LinearConstraint constraint = new LinearConstraint(new double[] {1, 2}, Relationship.LEQ, 5);
        LinearConstraint result = tableau.normalize(constraint);
        Assert.assertNotNull(result);
        Assert.assertEquals(5.0, result.getValue(), EPSILON);
        Assert.assertArrayEquals(new double[] {1, 2}, result.getCoefficients().toArray(), EPSILON);
    }

    @Test
    public void testNormalizeConstraintsNegativeRHS() {
        LinearConstraint constraint = new LinearConstraint(new double[] {-1, -2}, Relationship.GEQ, -3);
        LinearConstraint result = tableau.normalize(constraint);
        Assert.assertNotNull(result);
        Assert.assertEquals(3.0, result.getValue(), EPSILON);
        Assert.assertEquals(Relationship.LEQ, result.getRelationship());
        Assert.assertArrayEquals(new double[] {1, 2}, result.getCoefficients().toArray(), EPSILON);
    }

    @Test
    public void testNormalizeNullConstraint() {
        try {
            tableau.normalize(null);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testGetNumObjectiveFunctions() {
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1}, Relationship.LEQ, 1));
        SimplexTableau t2 = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(1, t2.getNumObjectiveFunctions());
    }

    @Test
    public void testGetSlackVariableOffset() {
        Assert.assertEquals(4, tableau.getSlackVariableOffset());
    }

    @Test
    public void testGetArtificialVariableOffset() {
        Assert.assertEquals(4, tableau.getArtificialVariableOffset());
    }

    @Test
    public void testGetRhsOffset() {
        Assert.assertEquals(4, tableau.getRhsOffset());
    }

    @Test
    public void testGetWidth() {
        Assert.assertTrue(tableau.getWidth() > 0);
    }

    @Test
    public void testGetHeight() {
        Assert.assertTrue(tableau.getHeight() > 0);
    }

    @Test
    public void testGetEntry() {
        Assert.assertNotNull(tableau.getEntry(0, 0));
    }

    @Test
    public void testSetEntry() {
        tableau.setEntry(0, 0, 5.0);
        Assert.assertEquals(5.0, tableau.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testNormalizeConstraintsWithEmptyCollection() {
        List<LinearConstraint> result = tableau.normalizeConstraints(new ArrayList<LinearConstraint>());
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testNormalizeConstraintsWithNullElement() {
        constraints.add(null);
        try {
            tableau.normalizeConstraints(constraints);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testIsOptimal() {
        Assert.assertNotNull(tableau.isOptimal());
    }

    @Test
    public void testGetSolutionWithUnconstrainedVariable() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1}, Relationship.GEQ, 0));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MINIMIZE, false, EPSILON);
        PointValuePair solution = t.getSolution();
        Assert.assertNotNull(solution.getPoint());
        Assert.assertNotNull(solution.getValue());
    }

    @Test
    public void testGetSolutionWithNegativeCoefficient() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {-1}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1}, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, EPSILON);
        PointValuePair solution = t.getSolution();
        Assert.assertNotNull(solution);
    }

    @Test
    public void testDropPhase1Objective() {
        // Phase 1 objective exists
        Assert.assertEquals(2, tableau.getNumPhases());
        tableau.dropPhase1Objective();
        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testDropPhase1ObjectiveNoPhase() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(1, t.getNumPhases());
        t.dropPhase1Objective();
        Assert.assertEquals(1, t.getNumObjectiveFunctions());
    }

    @Test
    public void testGetNumPhasesWithArtificialVariables() {
        Assert.assertEquals(2, tableau.getNumPhases());
        tableau.dropPhase1Objective();
        Assert.assertEquals(1, tableau.getNumPhases());
    }

    @Test
    public void testCreateTableau() {
        RealMatrix matrix = tableau.createTableau(true);
        Assert.assertNotNull(matrix);
        Assert.assertEquals(tableau.getHeight(), matrix.getRowDimension());
        Assert.assertEquals(tableau.getWidth(), matrix.getColumnDimension());
    }

    @Test
    public void testEqualsSameObject() {
        Assert.assertEquals(tableau, tableau);
    }

    @Test
    public void testEqualsDifferentObject() {
        Assert.assertFalse(tableau.equals(new String()));
    }

    @Test
    public void testEqualsDifferentEpsilon() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {2, 3}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        SimplexTableau t1 = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau t2 = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, 1e-4);
        Assert.assertNotEquals(t1, t2);
    }

    @Test
    public void testHashCode() {
        Assert.assertNotNull(tableau.hashCode());
    }

    @Test
    public void testPerformRowOperation() {
        double[] row1 = {1, 2, 3, 4, 5};
        double[] row2 = {5, 4, 3, 2, 1};
        double[] result = tableau.performOperation(row1, row2, 2.0);
        Assert.assertNotNull(result);
        Assert.assertEquals(11.0, result[0], EPSILON);
    }

    @Test
    public void testPerformRowOperationNegative() {
        double[] row1 = {10, 5, 2, 1, 0};
        double[] row2 = {3, 2, 1, 0, 0};
        double[] result = tableau.performOperation(row1, row2, -2.0);
        Assert.assertNotNull(result);
        Assert.assertEquals(4.0, result[0], EPSILON);
    }

    @Test
    public void testGetBasicRowWithValidColumn() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, EPSILON);
        Integer row = t.getBasicRow(0);
        Assert.assertEquals(1, row.intValue());
    }

    @Test
    public void testGetBasicRowWithInvalidColumn() {
        Integer row = tableau.getBasicRow(99);
        Assert.assertNull(row);
    }

    @Test
    public void testGetBasicRowWithNonBasic() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1, 2}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, EPSILON);
        Integer row = t.getBasicRow(0);
        Assert.assertNotNull(row);
    }

    @Test
    public void testGetSlackVariableOffsetWithConstraints() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1, 2, 3}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1, 0, 0}, Relationship.LEQ, 1));
        cons.add(new LinearConstraint(new double[] {0, 1, 0}, Relationship.GEQ, 2));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(4, t.getSlackVariableOffset());
    }

    @Test
    public void testConstructorWithMaximizeGoal() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1, 2}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertNotNull(t);
    }

    @Test
    public void testConstructorWithMinimizeGoal() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1, 2}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MINIMIZE, true, EPSILON);
        Assert.assertNotNull(t);
    }

    @Test
    public void testConstructorWithNonNegativeFalse() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1, 2}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, false, EPSILON);
        Assert.assertEquals(3, t.getNumDecisionVariables());
    }

    @Test
    public void testConstructorWithMultipleConstraints() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1, 2, 3, 4}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1, 0, 0, 0}, Relationship.LEQ, 1));
        cons.add(new LinearConstraint(new double[] {0, 1, 0, 0}, Relationship.GEQ, 2));
        cons.add(new LinearConstraint(new double[] {0, 0, 1, 0}, Relationship.EQ, 3));
        cons.add(new LinearConstraint(new double[] {0, 0, 0, 1}, Relationship.LEQ, 4));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(4, t.getNumDecisionVariables());
        Assert.assertEquals(2, t.getNumSlackVariables());
        Assert.assertEquals(1, t.getNumArtificialVariables());
    }

    @Test
    public void testGetOriginalNumDecisionVariables() {
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testGetOriginalNumDecisionVariablesNonNegative() {
        LinearObjectiveFunction obj = new LinearObjectiveFunction(new double[] {1, 2}, 0);
        Collection<LinearConstraint> cons = new ArrayList<LinearConstraint>();
        cons.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(obj, cons, GoalType.MAXIMIZE, false, EPSILON);
        Assert.assertEquals(2, t.getOriginalNumDecisionVariables());
    }

    @Test
    public void testGetBasicRowWithObjectiveFunctionRow() {
        Integer row = tableau.getBasicRow(0);
        Assert.assertNull(row);
    }
}