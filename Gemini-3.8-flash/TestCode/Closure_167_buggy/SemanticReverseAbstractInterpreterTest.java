package com.google.javascript.jscomp.type;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.JSType.TypePair;

public class SemanticReverseAbstractInterpreterTest {
    private SemanticReverseAbstractInterpreter interpreter;
    private JSTypeRegistry registry;
    private CodingConvention convention;

    @Before
    public void setUp() {
        convention = new CodingConvention() {};
        registry = new JSTypeRegistry(convention);
        interpreter = new SemanticReverseAbstractInterpreter(convention, registry);
    }

    @Test
    public void testGetPreciserScopeEqualityWithNonNullTypes() {
        Node condition = createEqualityNode(Token.EQ);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeEqualityWithNullTypes() {
        Node condition = createEqualityNode(Token.NE);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeTypeOfString() {
        Node typeOfNode = new Node(Token.TYPEOF);
        Node stringNode = new Node(Token.STRING, "number");
        typeOfNode.addChildToFront(new Node(Token.NAME, "x"));
        Node condition = new Node(Token.EQ);
        condition.addChildToFront(typeOfNode);
        condition.addChildToFront(stringNode);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeTypeOfNoTypeRefineable() {
        Node typeOfNode = new Node(Token.TYPEOF);
        Node stringNode = new Node(Token.STRING, "string");
        typeOfNode.addChildToFront(new Node(Token.NAME, "y"));
        Node condition = new Node(Token.SHEQ);
        condition.addChildToFront(typeOfNode);
        condition.addChildToFront(stringNode);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeAndShortCircuit() {
        Node condition = new Node(Token.AND);
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NAME, "b");
        condition.addChildToFront(left);
        condition.addChildToFront(right);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeOrMaybeShortCircuit() {
        Node condition = new Node(Token.OR);
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NAME, "b");
        condition.addChildToFront(left);
        condition.addChildToFront(right);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeNameAndGetProp() {
        Node nameNode = new Node(Token.NAME, "x");
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(nameNode, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeAssign() {
        Node assignNode = new Node(Token.ASSIGN);
        Node left = new Node(Token.NAME, "x");
        Node right = new Node(Token.NUMBER, 1);
        assignNode.addChildToFront(left);
        assignNode.addChildToFront(right);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(assignNode, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeNot() {
        Node notNode = new Node(Token.NOT);
        notNode.addChildToFront(new Node(Token.NAME, "x"));
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(notNode, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeInstanceOf() {
        Node left = new Node(Token.NAME, "x");
        Node right = new Node(Token.NAME, "Foo");
        Node instOfNode = new Node(Token.INSTANCEOF);
        instOfNode.addChildToFront(left);
        instOfNode.addChildToFront(right);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(instOfNode, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeInWithOutcomeTrueAndString() {
        Node inNode = new Node(Token.IN);
        Node left = new Node(Token.STRING, "prop");
        Node right = new Node(Token.NAME, "obj");
        inNode.addChildToFront(left);
        inNode.addChildToFront(right);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(inNode, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeInWithOutcomeFalse() {
        Node inNode = new Node(Token.IN);
        Node left = new Node(Token.STRING, "prop");
        Node right = new Node(Token.NAME, "obj");
        inNode.addChildToFront(left);
        inNode.addChildToFront(right);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(inNode, scope, false);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeCaseWithEquality() {
        Node caseNode = new Node(Token.CASE);
        Node left = new Node(Token.NAME, "x");
        caseNode.addChildToFront(left);
        Node right = new Node(Token.NUMBER, 5);
        caseNode.addChildToFront(right);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeDefaultCase() {
        Node caseNode = new Node(Token.DEFAULT);
        Node left = new Node(Token.NAME, "x");
        caseNode.addChildToFront(left);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, scope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeUnknownToken() {
        Node unknownNode = new Node(Token.VOID);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(unknownNode, scope, true);
        assertNull(result);
    }

    @Test
    public void testCaseEqualityWithBothRefineable() {
        Node left = new Node(Token.NAME, "x");
        Node right = new Node(Token.NAME, "y");
        JSType leftType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType rightType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
            createBinaryNode(Token.EQ, left, right), scope, true);
        assertNotNull(result);
    }

    @Test
    public void testCaseEqualityWithLeftNullType() {
        Node left = new Node(Token.NAME, "x");
        Node right = new Node(Token.NAME, "y");
        left.setJSType(null);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FlowScope scope = createBlindScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
            createBinaryNode(Token.EQ, left, right), scope, true);
        assertNotNull(result);
    }

    private Node createEqualityNode(int token) {
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NAME, "b");
        return createBinaryNode(token, left, right);
    }

    private Node createBinaryNode(int token, Node left, Node right) {
        Node node = new Node(token);
        node.addChildToFront(left);
        node.addChildToFront(right);
        return node;
    }

    private FlowScope createBlindScope() {
        return new FlowScope() {
            @Override
            public FlowScope createChildFlowScope() { return this; }
            @Override
            public StaticSlot<JSType> findUniqueRefinedSlot(FlowScope blindScope) { return null; }
            @Override
            public StaticSlot<JSType> getSlot(String name) { return null; }
        };
    }
}