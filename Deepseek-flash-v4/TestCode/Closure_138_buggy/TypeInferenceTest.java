package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(JUnit4.class)
public class TypeInferenceTest {

    private TypeInference typeInference;
    private AbstractCompiler compiler;
    private ControlFlowGraph<Node> cfg;
    private ReverseAbstractInterpreter reverseInterpreter;
    private Scope functionScope;
    private JSTypeRegistry registry;
    private FlowScope bottomScope;

    @Before
    public void setUp() {
        // Simplified setup for testing
        compiler = new TestCompiler();
        registry = compiler.getTypeRegistry();
        // Create a mock control flow graph with nodes
        cfg = new ControlFlowGraph<>(null, true, true);
        reverseInterpreter = new ReverseAbstractInterpreter();
        functionScope = new Scope(null, null);
        bottomScope = new FlowScope(null, null);
    }

    @Test
    public void testConstructorWithUnflowableVars() {
        Collection<Var> unflowable = new ArrayList<>();
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope, unflowable);
        assertNotNull(typeInference);
    }

    @Test
    public void testConstructorWithoutUnflowableVars() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        assertNotNull(typeInference);
    }

    @Test
    public void testFlowThroughWhenInputIsBottomScope() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node node = new Node(Token.NAME);
        FlowScope result = typeInference.flowThrough(node, bottomScope);
        assertNull(result);
    }

    @Test
    public void testFlowThroughWithChildFlowScope() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node node = new Node(Token.NAME);
        node.setType(Token.NAME);
        // Create a non-bottom input
        FlowScope input = new FlowScope(null, null);
        input.setType(node, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FlowScope result = typeInference.flowThrough(node, input);
        assertNotNull(result);
    }

    @Test
    public void testFlowThroughWithUnflowableVarName() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        // Add unflowable var name
        typeInference.unflowableVarNames.add("x");
        Node node = new Node(Token.ASSIGN);
        Node nameNode = new Node(Token.NAME, "x");
        Node valueNode = new Node(Token.NUMBER);
        node.addChildToBack(nameNode);
        node.addChildToBack(valueNode);
        FlowScope input = new FlowScope(null, null);
        FlowScope result = typeInference.flowThrough(node, input);
        assertEquals(bottomScope, result);
    }

    @Test
    public void testBranchFlowThroughNotFound() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node source = new Node(Token.NAME);
        FlowScope input = new FlowScope(null, null);
        List<DiGraphEdge<Node, Branch>> edges = typeInference.branchedFlowThrough(source, input);
        assertNotNull(edges);
    }

    @Test
    public void testTraverseShortCircuitingBinOp() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.AND);
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NAME, "b");
        n.addChildToBack(left);
        n.addChildToBack(right);
        FlowScope scope = new FlowScope(null, null);
        FlowScope result = typeInference.traverseShortCircuitingBinOp(n, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testNumericTypeInference() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.ADD);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        JSType result = typeInference.flowThrough(n, new FlowScope(null, null)).getType(n);
        assertTrue(result.isNumber());
    }

    @Test
    public void testStringTypeInference() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.ADD);
        Node left = new Node(Token.STRING);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        FlowScope scope = typeInference.flowThrough(n, new FlowScope(null, null));
        JSType result = typeInference.getJSType(n);
        assertTrue(result.isString());
    }

    @Test
    public void testNullTypeInference() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.NULL);
        JSType result = typeInference.getJSType(n);
        assertTrue(result.isNullType());
    }

    @Test
    public void testUnknownTypeInference() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.UNKNOWN);
        JSType result = typeInference.getJSType(n);
        assertTrue(result.isUnknownType());
    }

    @Test
    public void testBooleanTypeInference() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.TRUE);
        JSType result = typeInference.getJSType(n);
        assertTrue(result.isBoolean());
    }

    @Test
    public void testUnionTypeInference() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node andNode = new Node(Token.AND);
        Node condNode = new Node(Token.NAME, "x");
        Node trueNode = new Node(Token.NUMBER);
        Node falseNode = new Node(Token.STRING);
        andNode.addChildToBack(condNode);
        andNode.addChildToBack(trueNode);
        andNode.addChildToBack(falseNode);
        JSType result = typeInference.getJSType(andNode);
        assertNotNull(result);
    }

    @Test
    public void testAddUnknownTypes() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.ADD);
        Node left = new Node(Token.NAME);
        Node right = new Node(Token.NAME);
        left.setType(Token.UNKNOWN);
        right.setType(Token.UNKNOWN);
        n.addChildToBack(left);
        n.addChildToBack(right);
        JSType result = typeInference.getJSType(n);
        assertTrue(result.isUnknownType());
    }

    @Test
    public void testAddWithStringAndNumber() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.ADD);
        Node left = new Node(Token.STRING);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        JSType result = typeInference.getJSType(n);
        assertTrue(result.isString());
    }

    @Test
    public void testAddWithUnknownAndString() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.ADD);
        Node left = new Node(Token.UNKNOWN);
        Node right = new Node(Token.STRING);
        n.addChildToBack(left);
        n.addChildToBack(right);
        JSType result = typeInference.getJSType(n);
        assertTrue(result.isString());
    }

    @Test
    public void testAddWithUnknownAndNumber() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node n = new Node(Token.ADD);
        Node left = new Node(Token.UNKNOWN);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        JSType result = typeInference.getJSType(n);
        assertNotNull(result);
    }

    @Test
    public void testGetJSTypeWithNullNode() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        try {
            typeInference.getJSType(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testFlowThroughWithPropertyAccess() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node getProp = new Node(Token.GETPROP);
        Node base = new Node(Token.NAME, "obj");
        Node propName = new Node(Token.STRING, "prop");
        getProp.addChildToBack(base);
        getProp.addChildToBack(propName);
        FlowScope input = new FlowScope(null, null);
        FlowScope result = typeInference.flowThrough(getProp, input);
        assertNotNull(result);
    }

    @Test
    public void testFlowThroughWithVarDeclaration() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node varNode = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        varNode.addChildToBack(name);
        FlowScope input = new FlowScope(null, null);
        FlowScope result = typeInference.flowThrough(varNode, input);
        assertNotNull(result);
    }

    @Test
    public void testBranchFlowThroughOnFalseBranch() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node condition = new Node(Token.NAME, "x");
        Node source = new Node(Token.OR);
        source.addChildToBack(new Node(Token.NAME, "x"));
        source.addChildToBack(new Node(Token.NAME, "y"));
        FlowScope input = new FlowScope(null, null);
        List<DiGraphEdge<Node, Branch>> edges = typeInference.branchedFlowThrough(source, input);
        assertEquals(2, edges.size());
    }

    @Test
    public void testBranchFlowThroughWithUnknownType() {
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope);
        Node condition = new Node(Token.UNKNOWN);
        Node source = new Node(Token.IF);
        source.addChildToBack(condition);
        FlowScope input = new FlowScope(null, null);
        List<DiGraphEdge<Node, Branch>> edges = typeInference.branchedFlowThrough(source, input);
        assertNotNull(edges);
    }
}