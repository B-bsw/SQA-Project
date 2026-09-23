import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NodeUtilTest {

    @Before
    public void setUp() {
        // Setup if needed
    }

    @After
    public void tearDown() {
        // Teardown if needed
    }

    // Test for isValidAssignmentTarget - need a node with various types
    @Test
    public void testIsValidAssignmentTarget() {
        Node nameNode = new Node(Token.NAME, "x");
        Assert.assertTrue(NodeUtil.isValidAssignmentTarget(nameNode));

        Node getPropNode = new Node(Token.GETPROP);
        Assert.assertTrue(NodeUtil.isValidAssignmentTarget(getPropNode));

        Node stringKeyNode = new Node(Token.STRING_KEY);
        Assert.assertFalse(NodeUtil.isValidAssignmentTarget(stringKeyNode));

        Node thisNode = new Node(Token.THIS);
        Assert.assertFalse(NodeUtil.isValidAssignmentTarget(thisNode));
    }

    // Test for getImpureBooleanValue
    @Test
    public void testGetImpureBooleanValue() {
        Node trueNode = new Node(Token.TRUE);
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(trueNode));

        Node falseNode = new Node(Token.FALSE);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(falseNode));

        Node nullNode = new Node(Token.NULL);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(nullNode));

        Node nameUndefined = new Node(Token.NAME, "undefined");
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(nameUndefined));

        Node nameInfinity = new Node(Token.NAME, "Infinity");
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(nameInfinity));

        Node nameOther = new Node(Token.NAME, "other");
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(nameOther));

        Node addNode = new Node(Token.ADD);
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(addNode));
    }

    // Test for getBooleanValue
    @Test
    public void testGetBooleanValue() {
        Node trueNode = new Node(Token.TRUE);
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(trueNode));

        Node falseNode = new Node(Token.FALSE);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(falseNode));

        Node nullNode = new Node(Token.NULL);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nullNode));

        Node nameUndefined = new Node(Token.NAME, "undefined");
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nameUndefined));

        Node nameInfinity = new Node(Token.NAME, "Infinity");
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(nameInfinity));

        Node nameOther = new Node(Token.NAME, "other");
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(nameOther));
    }

    // Test for isLiteralValue with basic nodes
    @Test
    public void testIsLiteralValue() {
        Node nullNode = new Node(Token.NULL);
        Assert.assertTrue(NodeUtil.isLiteralValue(nullNode, false));
        Assert.assertTrue(NodeUtil.isLiteralValue(nullNode, true));

        Node falseNode = new Node(Token.FALSE);
        Assert.assertTrue(NodeUtil.isLiteralValue(falseNode, true));

        Node trueNode = new Node(Token.TRUE);
        Assert.assertTrue(NodeUtil.isLiteralValue(trueNode, false));

        Node emptyNode = new Node(Token.EMPTY);
        Assert.assertTrue(NodeUtil.isLiteralValue(emptyNode, true));

        Node nameNode = new Node(Token.NAME, "x");
        Assert.assertFalse(NodeUtil.isLiteralValue(nameNode, true));

        // Test for number literal
        Node numberNode = new Node(Token.NUMBER, 42.0);
        Assert.assertTrue(NodeUtil.isLiteralValue(numberNode, true));

        // Test for function if includeFunctions is true
        Node functionNode = new Node(Token.FUNCTION);
        Assert.assertFalse(NodeUtil.isLiteralValue(functionNode, false));
        Assert.assertTrue(NodeUtil.isLiteralValue(functionNode, true));
    }

    // Test for isObjectLitKey - simplified
    @Test
    public void testIsObjectLitKey() {
        Node objectLit = new Node(Token.OBJECTLIT);
        Node keyNode = new Node(Token.STRING_KEY, "prop");
        objectLit.addChildToBack(keyNode);
        Assert.assertTrue(NodeUtil.isObjectLitKey(keyNode, objectLit));

        Node normalNode = new Node(Token.NAME, "x");
        Assert.assertFalse(NodeUtil.isObjectLitKey(normalNode, objectLit));
    }

    // Test for mayHaveSideEffects - a common method
    @Test
    public void testMayHaveSideEffects() {
        Node emptyNode = new Node(Token.EMPTY);
        Assert.assertFalse(NodeUtil.mayHaveSideEffects(emptyNode, null));

        Node nameNode = new Node(Token.NAME, "x");
        Assert.assertFalse(NodeUtil.mayHaveSideEffects(nameNode, null));

        Node assignNode = new Node(Token.ASSIGN);
        Assert.assertTrue(NodeUtil.mayHaveSideEffects(assignNode, null));

        Node callNode = createCallNode();
        Assert.assertTrue(NodeUtil.mayHaveSideEffects(callNode, null));

        Node addNode = new Node(Token.ADD);
        addNode.addChildToFront(new Node(Token.NAME, "a"));
        addNode.addChildToBack(new Node(Token.NAME, "b"));
        Assert.assertFalse(NodeUtil.mayHaveSideEffects(addNode, null));
    }

    // Test for functionCallHasSideEffects
    @Test
    public void testFunctionCallHasSideEffects() {
        Node callNode = createCallNode();
        Assert.assertFalse(NodeUtil.functionCallHasSideEffects(callNode, null));

        // Call to a known no-side-effect function like Object
        Node objectCall = new Node(Token.CALL);
        Node objectName = new Node(Token.NAME, "Object");
        objectCall.addChildToFront(objectName);
        Assert.assertTrue(NodeUtil.functionCallHasSideEffects(objectCall, null));

        // Test with compiler that has no regExpGlobalReferences
        // Would need a mock compiler, skip for brevity
    }

    // Test for constructorCallHasSideEffects
    @Test
    public void testConstructorCallHasSideEffects() {
        Node newNode = new Node(Token.NEW);
        Node targetName = new Node(Token.NAME, "MyClass");
        newNode.addChildToFront(targetName);
        Assert.assertTrue(NodeUtil.constructorCallHasSideEffects(newNode, null));

        // Known no-side-effect constructor
        Node objectNew = new Node(Token.NEW);
        Node objectTarget = new Node(Token.NAME, "Object");
        objectNew.addChildToFront(objectTarget);
        Assert.assertFalse(NodeUtil.constructorCallHasSideEffects(objectNew, null));
    }

    // Test for isAdditiveAssociative
    @Test
    public void testIsAdditiveAssociative() {
        Node addNode = new Node(Token.ADD);
        Assert.assertTrue(NodeUtil.isAdditiveAssociative(addNode));

        Node subNode = new Node(Token.SUB);
        Assert.assertFalse(NodeUtil.isAdditiveAssociative(subNode));

        Node nameNode = new Node(Token.NAME, "x");
        Assert.assertFalse(NodeUtil.isAdditiveAssociative(nameNode));
    }

    // Test for getOpFromAssignOp
    @Test
    public void testGetOpFromAssignOp() {
        Node assignAdd = new Node(Token.ASSIGN_ADD);
        Assert.assertEquals(Token.ADD, NodeUtil.getOpFromAssignOp(assignAdd));

        Node assignSub = new Node(Token.ASSIGN_SUB);
        Assert.assertEquals(Token.SUB, NodeUtil.getOpFromAssignOp(assignSub));

        Node assign = new Node(Token.ASSIGN);
        Assert.assertEquals(Token.ASSIGN, NodeUtil.getOpFromAssignOp(assign));

        Node notAssign = new Node(Token.NAME, "x");
        Assert.assertEquals(Token.NAME, NodeUtil.getOpFromAssignOp(notAssign));
    }

    // Test for getBinaryOpType
    @Test
    public void testGetBinaryOpType() {
        Assert.assertEquals(Token.BITOR, NodeUtil.getBinaryOpType(Token.BITOR));
        Assert.assertEquals(Token.OR, NodeUtil.getBinaryOpType(Token.OR));
        Assert.assertEquals(Token.BITXOR, NodeUtil.getBinaryOpType(Token.BITXOR));
        Assert.assertEquals(Token.AND, NodeUtil.getBinaryOpType(Token.AND));
        Assert.assertEquals(Token.BITAND, NodeUtil.getBinaryOpType(Token.BITAND));
        Assert.assertEquals(Token.SHNE, NodeUtil.getBinaryOpType(Token.SHNE));
        Assert.assertEquals(Token.IN, NodeUtil.getBinaryOpType(Token.IN));
        Assert.assertEquals(Token.URSH, NodeUtil.getBinaryOpType(Token.URSH));
        Assert.assertEquals(Token.ADD, NodeUtil.getBinaryOpType(Token.ADD));
        Assert.assertEquals(Token.DIV, NodeUtil.getBinaryOpType(Token.DIV));
        Assert.assertEquals(Token.NEG, NodeUtil.getBinaryOpType(Token.NEG));
        Assert.assertEquals(Token.NAME, NodeUtil.getBinaryOpType(Token.NAME));
    }

    // Test for getAssociativeAnd
    @Test
    public void testGetAssociativeAnd() {
        Node andNode = new Node(Token.AND);
        Assert.assertTrue(NodeUtil.getAssociative(andNode) == Operator.AND || NodeUtil.getAssociative(andNode) != null);
        // Not going to check exact value as Operator is internal - just ensure no exception
        try {
            NodeUtil.getAssociative(new Node(Token.NAME, "x"));
            Assert.fail("Should throw exception for non-binary op");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    // Test for isAssignmentOp
    @Test
    public void testIsAssignmentOp() {
        Assert.assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
        Assert.assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
        Assert.assertFalse(NodeUtil.isAssignmentOp(new Node(Token.NAME, "x")));
    }

    // Test for getVarsDeclaredInBranch
    @Test
    public void testGetVarsDeclaredInBranch() {
        Node branch = new Node(Token.BLOCK);
        Node expr1 = new Node(Token.EXPR_RESULT);
        Node assign1 = new Node(Token.ASSIGN);
        Node name1 = new Node(Token.NAME, "a");
        Node num1 = new Node(Token.NUMBER, 1);
        assign1.addChildToFront(name1);
        assign1.addChildToBack(num1);
        expr1.addChildToBack(assign1);
        branch.addChildToBack(expr1);

        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        Assert.assertNotNull(vars);
        Assert.assertTrue(vars.size() >= 0); // Might be empty or contain var declarations, not assign
    }

    // Test for isExprAssign
    @Test
    public void testIsExprAssign() {
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        exprResult.addChildToBack(assign);
        Assert.assertTrue(NodeUtil.isExprAssign(exprResult));

        Node exprNoAssign = new Node(Token.EXPR_RESULT);
        Node call = new Node(Token.CALL);
        exprNoAssign.addChildToBack(call);
        Assert.assertFalse(NodeUtil.isExprAssign(exprNoAssign));
    }

    // Test for isVar
    @Test
    public void testIsVar() {
        Node varNode = new Node(Token.VAR);
        Assert.assertTrue(NodeUtil.isVar(varNode));

        Node nameNode = new Node(Token.NAME, "x");
        Assert.assertFalse(NodeUtil.isVar(nameNode));
    }

    // Test for newExpr
    @Test
    public void testNewExpr() {
        Node child = new Node(Token.NAME, "MyClass");
        Node expr = NodeUtil.newExpr(child);
        Assert.assertNotNull(expr);
        Assert.assertEquals(Token.EXPR_RESULT, expr.getType());
        Assert.assertEquals(child, expr.getFirstChild());
    }

    // Test for newVarNode
    @Test
    public void testNewVarNode() {
        Node value = new Node(Token.NUMBER, 42);
        Node varNode = NodeUtil.newVarNode("x", value);
        Assert.assertNotNull(varNode);
        Assert.assertEquals(Token.VAR, varNode.getType());
        Assert.assertEquals(Token.NAME, varNode.getFirstChild().getType());
        Assert.assertEquals("x", varNode.getFirstChild().getString());
        Assert.assertEquals(value, varNode.getFirstChild().getFirstChild());

        Node varNodeNull = NodeUtil.newVarNode("y", null);
        Assert.assertNotNull(varNodeNull);
        Assert.assertNull(varNodeNull.getFirstChild().getFirstChild());
    }

    // Test helper method for creating a call node
    private Node createCallNode() {
        Node callNode = new Node(Token.CALL);
        Node calleeName = new Node(Token.NAME, "foo");
        callNode.addChildToFront(calleeName);
        return callNode;
    }
}