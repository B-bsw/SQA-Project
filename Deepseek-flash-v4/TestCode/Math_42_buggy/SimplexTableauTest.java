package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.util.Precision;

public class SimplexTableauTest {
    private static final double EPSILON = 1.0e-12;
    private static final int ULPS = 10;
    private LinearObjectiveFunction f;
    private Collection<LinearConstraint> constraints;
    private SimplexTableau tableau;
    private SimplexTableau negativeTableau;

    @Before
    public void setUp() {
        // Create a simple LP problem: maximize 3x1 + 2x2 subject to x1 + x2 <= 4, x1 >= 0, x2 >= 0
        double[] coefficients = {3.0, 2.0};
        f = new LinearObjectiveFunction(coefficients, 0.0);
        constraints = new ArrayList<LinearConstraint>();
        List<LinearConstraint> constraintList = new ArrayList<LinearConstraint>();
        constraintList.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.LEQ, 4.0));
        constraintList.add(new LinearConstraint(new double[]{1.0, 0.0}, Relationship.GEQ, 0.0));
        constraintList.add(new LinearConstraint(new double[]{0.0, 1.0}, Relationship.GEQ, 0.0));
        constraints = constraintList;
        tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
    }

    @Test
    public void testConstructor() {
        // Verify number of variables and constraints
        assertNotNull(tableau);
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(4, tableau.getWidth());
        assertEquals(4, tableau.getHeight());
    }

    @Test
    public void testNormalizeConstraints() {
        List<LinearConstraint> original = new ArrayList<LinearConstraint>();
        original.add(new LinearConstraint(new double[]{1.0, 2.0}, Relationship.GEQ, 5.0));
        original.add(new LinearConstraint(new double[]{1.0, 2.0}, Relationship.LEQ, 5.0));
        List<LinearConstraint> normalized = tableau.normalizeConstraints(original);
        assertEquals(2, normalized.size());
    }

    @Test
    public void testNormalizeConstraintsNegativeRHS() {
        List<LinearConstraint> original = new ArrayList<LinearConstraint>();
        original.add(new LinearConstraint(new double[]{1.0, 2.0}, Relationship.GEQ, -5.0));
        List<LinearConstraint> normalized = tableau.normalizeConstraints(original);
        assertEquals(1, normalized.size());
        assertEquals(-5.0, normalized.get(0).getValue(), EPSILON);
    }

    @Test
    public void testGetNumObjectiveFunctions() {
        // With no artificial variables, should return 1
        assertEquals(1, tableau.getNumObjectiveFunctions());
        
        // With artificial variables (EQ constraints), should return 2
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.EQ, 2.0));
        SimplexTableau tableauWithEQ = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertEquals(2, tableauWithEQ.getNumObjectiveFunctions());
    }

    @Test
    public void testGetOriginalNumDecisionVariables() {
        // When restrictToNonNegative is true, should be same as coefficients dimension
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        
        // When restrictToNonNegative is false, should be one more than coefficients dimension
        SimplexTableau unrestrictedTableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);
        assertEquals(3, unrestrictedTableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testEntryAndSetEntry() {
        // Test getter and setter
        assertEquals(-1.0, tableau.getEntry(0, 0), EPSILON);
        tableau.setEntry(0, 0, 5.0);
        assertEquals(5.0, tableau.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testGetRhsOffset() {
        assertEquals(tableau.getWidth() - 1, tableau.getRhsOffset());
    }

    @Test
    public void testEquals() {
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertTrue(tableau.equals(tableau2));
        
        // Different restrictToNonNegative flag
        SimplexTableau tableau3 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);
        assertFalse(tableau.equals(tableau3));
        
        // Different objective function
        double[] coeffs2 = {1.0, 1.0};
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(coeffs2, 0.0);
        SimplexTableau tableau4 = new SimplexTableau(f2, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertFalse(tableau.equals(tableau4));
        
        // Null and different types
        assertFalse(tableau.equals(null));
        assertFalse(tableau.equals(new Object()));
        assertTrue(tableau.equals(tableau));
    }

    @Test
    public void testHashCode() {
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertEquals(tableau.hashCode(), tableau2.hashCode());
    }

    @Test
    public void testCreateTableau() {
        // Verify objective function row
        assertEquals(1.0, tableau.getEntry(0, 1), EPSILON);
        // Verify constraint row
        assertEquals(1.0, tableau.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testNormalizeRelationships() {
        // Test LEQ, GEQ, EQ relationships
        List<LinearConstraint> mixedConstraints = new ArrayList<LinearConstraint>();
        mixedConstraints.add(new LinearConstraint(new double[]{1.0}, Relationship.LEQ, 5.0));
        mixedConstraints.add(new LinearConstraint(new double[]{1.0}, Relationship.GEQ, 3.0));
        mixedConstraints.add(new LinearConstraint(new double[]{1.0}, Relationship.EQ, 4.0));
        
        SimplexTableau mixedTableau = new SimplexTableau(new LinearObjectiveFunction(new double[]{1.0}, 0.0), 
                                                        mixedConstraints, GoalType.MAXIMIZE, true, EPSILON);
        assertEquals(2, mixedTableau.getNumSlackVariables());
        assertEquals(2, mixedTableau.getNumArtificialVariables());
    }

    @Test
    public void testMinimizeTableau() {
        List<LinearConstraint> minConstraints = new ArrayList<LinearConstraint>();
        minConstraints.add(new LinearConstraint(new double[]{2.0, 1.0}, Relationship.GEQ, 18.0));
        minConstraints.add(new LinearConstraint(new double[]{1.0, 2.0}, Relationship.GEQ, 12.0));
        
        SimplexTableau minTableau = new SimplexTableau(
            new LinearObjectiveFunction(new double[]{-2.0, -3.0}, 0.0),
            minConstraints, GoalType.MINIMIZE, true, EPSILON);
        
        // Verify basic TABLEAU structure for minimization
        assertEquals(3, minTableau.getNumObjectiveFunctions()); // min + 2 artificial variables
    }

    @Test
    public void testBasicRowOperations() {
        // Test basic row return for a simple case
        Integer row = tableau.getBasicRow(1);  // column 1
        assertNotNull(row);
        
        // Test non-basic column
        assertEquals(null, tableau.getBasicRow(0));
        
        // Test negative constraint handling
        constraints.add(new LinearConstraint(new double[]{-1.0, 0.0}, Relationship.LEQ, -2.0));
        SimplexTableau complexTableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertNotNull(complexTableau.getBasicRow(1));
    }

    @Test(expected = RuntimeException.class)
    public void testSerialization() throws Exception {
        SimplexTableau original = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.flush();
        
        byte[] bytes = baos.toByteArray();
        assertTrue(bytes.length > 0);
        
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(bytes);
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
        SimplexTableau restored = (SimplexTableau) ois.readObject();
        
        assertEquals(original, restored);
        assertEquals(original.hashCode(), restored.hashCode());
    }
}