package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class MustBeReachingVariableDefTest {

    private ScopeCreator scopeCreator;
    private AbstractCompiler compiler;
    private ControlFlowGraph<Node> cfg;
    private MustBeReachingVariableDef mustDef;
    private Scope jsScope;

    @Before
    public void setUp() {
        // Setup a minimal compiler and scope for testing
        compiler = new ClosureCompiler();
        
        // Create a simple AST
        Node root = new Node(Token.SCRIPT);
        Node fn = new Node(Token.FUNCTION);
        Node paramList = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        fn.addChildToBack(paramList);
        fn.addChildToBack(body);
        root.addChildToBack(fn);
        
        scopeCreator = new ScopeCreator(compiler);
        jsScope = scopeCreator.createScope(fn, null);
        
        // Create a simple CFG
        cfg = new ControlFlowGraph<>();
        
        // Build a basic CFG structure
        Node entryNode = new Node(Token.NAME);
        entryNode.setString("entry");
        cfg.createNode(entryNode);
        
        mustDef = new MustBeReachingVariableDef(cfg, jsScope, compiler);
    }

    @Test
    public void testCreateEntryLattice() {
        MustDef entry = mustDef.createEntryLattice();
        assertNotNull(entry);
        assertTrue(entry.reachingDef.size() > 0);
        for (Var var : jsScope.getVars()) {
            assertTrue(entry.reachingDef.containsKey(var));
            assertNotNull(entry.reachingDef.get(var));
        }
    }

    @Test
    public void testCreateInitialEstimateLattice() {
        MustDef initial = mustDef.createInitialEstimateLattice();
        assertNotNull(initial);
        assertTrue(initial.reachingDef.isEmpty());
    }

    @Test
    public void testFlowThrough_WithSimpleDefinition() {
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Node valueNode = new Node(Token.NUMBER);
        valueNode.setDouble(10.0);
        Node assignNode = new Node(Token.ASSIGN, nameNode, valueNode);
        
        // Create a CFG node for the assignment
        cfg.createNode(assignNode);
        
        MustDef input = new MustDef();
        Var xVar = jsScope.getVar("x");
        input.reachingDef.put(xVar, new Definition(new Node(Token.EMPTY)));
        
        MustDef result = mustDef.flowThrough(assignNode, input);
        assertNotNull(result);
        
        // The definition for x should be updated
        Definition def = result.reachingDef.get(xVar);
        assertNotNull(def);
        assertSame(assignNode, def.node);
    }

    @Test
    public void testFlowThrough_TopPreservedForUndefinedVars() {
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("undefinedVar");
        cfg.createNode(nameNode);
        
        MustDef input = new MustDef();
        MustDef result = mustDef.flowThrough(nameNode, input);
        
        // Variable not in scope should not be in reachingDef
        assertNull(result.reachingDef.get(jsScope.getVar("undefinedVar")));
    }

    @Test
    public void testFlowThrough_NullDefinitionRepresentsBottom() {
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        cfg.createNode(nameNode);
        
        MustDef input = new MustDef();
        Var xVar = jsScope.getVar("x");
        input.reachingDef.put(xVar, null); // Bottom
        
        MustDef result = mustDef.flowThrough(nameNode, input);
        assertNotNull(result);
        assertNull(result.reachingDef.get(xVar));
    }

    @Test
    public void testGetDef_NullWhenNotFound() {
        Node useNode = new Node(Token.NAME);
        useNode.setString("nonExistent");
        cfg.createNode(useNode);
        
        MockGraphNode graphNode = new MockGraphNode(useNode);
        Node result = mustDef.getDef("nonExistent", useNode);
        assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetDef_NullUseNodeThrows() {
        mustDef.getDef("x", null);
    }

    @Test
    public void testGetDef_WithNullState() {
        Node useNode = new Node(Token.NAME);
        useNode.setString("x");
        cfg.createNode(useNode);
        
        Node result = mustDef.getDef("x", useNode);
        // Since we haven't set annotation, it should be null
        assertNull(result);
    }

    @Test
    public void testComputeDependence_DependsOnLocalVar() {
        Node testName = new Node(Token.NAME);
        testName.setString("testLocal");
        
        // Create a scope with testLocal
        Node testFn = new Node(Token.FUNCTION);
        Node testParamList = new Node(Token.PARAM_LIST);
        Node testBody = new Node(Token.BLOCK);
        
        // Add var declaration
        Node varNode = new Node(Token.VAR);
        Node varName = new Node(Token.NAME);
        varName.setString("testLocal");
        varNode.addChildToFront(varName);
        testBody.addChildToBack(varNode);
        
        testFn.addChildToBack(testParamList);
        testFn.addChildToBack(testBody);
        
        Scope testScope = scopeCreator.createScope(testFn, null);
        
        MustDef output = new MustDef();
        Node rValue = new Node(Token.NAME);
        rValue.setString("testLocal");
        
        mustDef.computeDependence(new Definition(new Node(Token.EMPTY)), rValue);
        
        // This test verifies that no exception is thrown for valid inputs
        assertTrue(true);
    }

    @Test
    public void testAddToDefIfLocal_EscapedVariable() {
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("escapedVar");
        MustDef output = new MustDef();
        Var escapedVar = new Var("escapedVar", null, null, 0, null);
        
        // Manually add to escaped set
        Set<Var> escapedSet = new HashSet<>();
        escapedSet.add(escapedVar);
        
        mustDef.addToDefIfLocal("escapedVar", nameNode, null, output);
        // Escaped vars should not be in the output
        assertNull(output.reachingDef.get(escapedVar));
    }

    @Test
    public void testAddToDefIfLocal_NullNodeAndConditional() {
        MustDef output = new MustDef();
        mustDef.addToDefIfLocal("testVar", null, null, output);
        
        Var testVar = jsScope.getVar("testVar");
        if (testVar != null) {
            assertNull(output.reachingDef.get(testVar));
        }
    }

    @Test
    public void testIsForward() {
        assertTrue(mustDef.isForward());
    }

    @Test
    public void testEscapeParameters() {
        MustDef output = new MustDef();
        // Create a scope with a parameter
        Node testFn = new Node(Token.FUNCTION);
        Node testParamList = new Node(Token.PARAM_LIST);
        Node param = new Node(Token.NAME);
        param.setString("param1");
        testParamList.addChildToBack(param);
        testFn.addChildToBack(testParamList);
        
        Scope paramScope = scopeCreator.createScope(testFn, null);
        
        // Add a parameter to the output
        for (Var v : paramScope.getVars()) {
            if (v.getParentNode() != null && v.getParentNode().isParamList()) {
                output.reachingDef.put(v, new Definition(new Node(Token.EMPTY)));
            }
        }
        
        mustDef.escapeParameters(output);
        
        for (Var v : paramScope.getVars()) {
            if (v.getParentNode() != null && v.getParentNode().isParamList()) {
                assertNull("Parameter " + v.getName() + " should be null after escaping", output.reachingDef.get(v));
            }
        }
    }

    @Test
    public void testDependsOnOuterScopeVars() {
        Node useNode = new Node(Token.NAME);
        useNode.setString("x");
        
        boolean result = mustDef.dependsOnOuterScopeVars("nonexistent", useNode);
        assertFalse(result);
    }

    @Test
    public void testComputeMustDef_VarDeclaration() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("testVar");
        varNode.addChildToBack(nameNode);
        
        MustDef output = new MustDef();
        mustDef.computeMustDef(varNode, varNode, output, false);
        
        assertNotNull(output);
    }

    @Test
    public void testComputeMustDef_AssignmentName() {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("testVar");
        Node valueNode = new Node(Token.NUMBER);
        valueNode.setDouble(5.0);
        assignNode.addChildToFront(nameNode);
        assignNode.addChildToBack(valueNode);
        
        MustDef output = new MustDef();
        mustDef.computeMustDef(assignNode, assignNode, output, false);
        
        assertNotNull(output);
    }

    @Test
    public void testMustDefJoin_Apply() {
        MustDefJoin join = new MustDefJoin();
        
        MustDef a = new MustDef();
        MustDef b = new MustDef();
        
        // Add a variable with a definition in both
        Node node1 = new Node(Token.EMPTY);
        Definition def1 = new Definition(node1);
        Var var1 = new Var("var1", node1, null, 0, null);
        
        a.reachingDef.put(var1, def1);
        b.reachingDef.put(var1, new Definition(node1));
        
        MustDef result = join.apply(a, b);
        assertNotNull(result);
        assertNotNull(result.reachingDef.get(var1));
        assertSame(def1, result.reachingDef.get(var1));
    }

    @Test
    public void testMustDefJoin_OneBottom() {
        MustDefJoin join = new MustDefJoin();
        
        MustDef a = new MustDef();
        MustDef b = new MustDef();
        
        Node node1 = new Node(Token.EMPTY);
        Var var1 = new Var("var1", node1, null, 0, null);
        
        a.reachingDef.put(var1, null); // Bottom
        b.reachingDef.put(var1, new Definition(node1));
        
        MustDef result = join.apply(a, b);
        assertNotNull(result);
        assertNull(result.reachingDef.get(var1));
    }

    @Test
    public void testDefinitionEquals_DifferentNodes() {
        Node node1 = new Node(Token.EMPTY);
        Node node2 = new Node(Token.EMPTY);
        
        Definition def1 = (Definition) new Definition(node1);
        Definition def2 = (Definition) new Definition(node2);
        
        assertFalse(def1.equals(def2));
    }

    @Test
    public void testDefinitionEquals_SameNode() {
        Node node1 = new Node(Token.EMPTY);
        Definition def1 = (Definition) new Definition(node1);
        Definition def2 = (Definition) new Definition(node1);
        
        assertTrue(def1.equals(def2));
    }

    @Test
    public void testDefinitionEquals_Null() {
        Definition def = new Definition(new Node(Token.EMPTY));
        assertFalse(def.equals(null));
    }

    @Test
    public void testDefinitionEquals_DifferentObjects() {
        Definition def = new Definition(new Node(Token.EMPTY));
        assertFalse(def.equals("notADef"));
    }

    @Test
    public void testMustDefEquals_SameMap() {
        MustDef def1 = new MustDef();
        MustDef def2 = new MustDef();
        
        assertTrue(def1.equals(def2));
        
        Node node = new Node(Token.EMPTY);
        Var var = new Var("x", node, null, 0, null);
        def1.reachingDef.put(var, null);
        
        assertFalse(def1.equals(def2));
    }

    @Test
    public void testMustDefConstructor_WithVars() {
        Node node = new Node(Token.EMPTY);
        MustDef def = new MustDef(jsScope.getVars());
        assertNotNull(def);
        assertTrue(!def.reachingDef.isEmpty());
    }

    @Test
    public void testMustDefCopyConstructor() {
        MustDef original = new MustDef();
        Node node = new Node(Token.EMPTY);
        Var var = new Var("x", node, null, 0, null);
        original.reachingDef.put(var, null);
        
        MustDef copy = new MustDef(original);
        assertTrue(copy.equals(original));
        
        // Modifying copy should not affect original
        copy.reachingDef.remove(var);
        assertFalse(copy.equals(original));
    }

    private static class MockGraphNode extends GraphNode<Node, Branch> {
        public MockGraphNode(Node node) {
            super(node);
        }
    }
}