package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.FlowScope;
import com.google.javascript.jscomp.Node;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import static org.mockito.Mockito.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TypeInferenceTest {

    private TypeInference typeInference;
    private AbstractCompiler compiler;
    private ControlFlowGraph<Node> cfg;
    private ReverseAbstractInterpreter reverseInterpreter;
    private Scope functionScope;
    private Map<String, AssertionFunctionSpec> assertionFunctionsMap;
    private FlowScope bottomScope;

    @Before
    public void setUp() {
        compiler = mock(AbstractCompiler.class);
        cfg = mock(ControlFlowGraph.class);
        reverseInterpreter = mock(ReverseAbstractInterpreter.class);
        functionScope = mock(Scope.class);
        assertionFunctionsMap = Maps.newHashMap();
        typeInference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope, assertionFunctionsMap);
        bottomScope = mock(FlowScope.class);
    }

    @After
    public void tearDown() {
        // cleanup if needed
    }

    @Test
    public void testFlowThroughWithBottomScope() {
        FlowScope input = bottomScope;
        FlowScope result = typeInference.flowThrough(new Node(Token.NAME), input);
        assertEquals(input, result);
    }

    @Test
    public void testFlowThroughNormal() {
        Node n = new Node(Token.NAME);
        FlowScope input = mock(FlowScope.class);
        when(input.createChildFlowScope()).thenReturn(mock(FlowScope.class));
        FlowScope result = typeInference.flowThrough(n, input);
        assertNotNull(result);
    }

    @Test
    public void testBranchedFlowThroughOnTrue() {
        Node source = new Node(Token.NAME);
        FlowScope input = mock(FlowScope.class);
        FlowScope output = mock(FlowScope.class);
        when(typeInference.flowThrough(source, input)).thenReturn(output);
        List<DiGraphEdge<Node, Branch>> edges = new ArrayList<>();
        DiGraphEdge<Node, Branch> edge = mock(DiGraphEdge.class);
        when(edge.getValue()).thenReturn(Branch.ON_TRUE);
        edges.add(edge);
        when(cfg.getOutEdges(source)).thenReturn(edges);
        List<FlowScope> result = typeInference.branchedFlowThrough(source, input);
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    public void testBranchedFlowThroughOnFalse() {
        Node source = new Node(Token.NAME);
        FlowScope input = mock(FlowScope.class);
        FlowScope output = mock(FlowScope.class);
        when(typeInference.flowThrough(source, input)).thenReturn(output);
        List<DiGraphEdge<Node, Branch>> edges = new ArrayList<>();
        DiGraphEdge<Node, Branch> edge = mock(DiGraphEdge.class);
        when(edge.getValue()).thenReturn(Branch.ON_FALSE);
        edges.add(edge);
        when(cfg.getOutEdges(source)).thenReturn(edges);
        List<FlowScope> result = typeInference.branchedFlowThrough(source, input);
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    public void testBranchedFlowThroughNoEdges() {
        Node source = new Node(Token.NAME);
        FlowScope input = mock(FlowScope.class);
        FlowScope output = mock(FlowScope.class);
        when(typeInference.flowThrough(source, input)).thenReturn(output);
        when(cfg.getOutEdges(source)).thenReturn(null);
        List<FlowScope> result = typeInference.branchedFlowThrough(source, input);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testFlowThroughWithReference() {
        Node n = new Node(Token.NAME);
        FlowScope input = mock(FlowScope.class);
        when(input.createChildFlowScope()).thenReturn(mock(FlowScope.class));
        FlowScope result = typeInference.flowThrough(n, input);
        assertNotNull(result);
    }

    @Test
    public void testFlowThroughWithNullInput() {
        Node n = new Node(Token.NAME);
        FlowScope result = typeInference.flowThrough(n, null);
        assertNull(result);
    }

    @Test
    public void testTypeInferenceWithUnknownType() {
        Node n = new Node(Token.NAME);
        FlowScope input = mock(FlowScope.class);
        FlowScope childScope = mock(FlowScope.class);
        when(input.createChildFlowScope()).thenReturn(childScope);
        when(childScope.inferSlotType(anyString(), any(JSType.class))).thenReturn(childScope);
        FlowScope result = typeInference.flowThrough(n, input);
        assertNotNull(result);
    }

    @Test
    public void testBranchedFlowThroughWithNullOutput() {
        Node source = new Node(Token.NAME);
        FlowScope input = mock(FlowScope.class);
        when(typeInference.flowThrough(source, input)).thenReturn(null);
        List<FlowScope> result = typeInference.branchedFlowThrough(source, input);
        assertNotNull(result);
    }

    @Test
    public void testBranchedFlowThroughWithNullEdges() {
        Node source = new Node(Token.NAME);
        FlowScope input = mock(FlowScope.class);
        FlowScope output = mock(FlowScope.class);
        when(typeInference.flowThrough(source, input)).thenReturn(output);
        when(cfg.getOutEdges(source)).thenReturn(new ArrayList<>());
        List<FlowScope> result = typeInference.branchedFlowThrough(source, input);
        assertNotNull(result);
        assertEquals(0, result.size());
    }
}