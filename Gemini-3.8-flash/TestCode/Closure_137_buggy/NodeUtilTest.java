import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.FunctionNode;
import java.util.Arrays;
import java.util.List;

public class NodeUtilTest {
    private static final int FAKE_LINE = 0;
    private static final int FAKE_CHAR = 0;

    private Node createNameNode(String name) {
        Node node = new Node(Token.NAME, name);
        return node;
    }

    @Test
    public void testIsImmutableValue_String() {
        Node strNode = new Node(Token.STRING, "abc");
        assertTrue(NodeUtil.isImmutableValue(strNode));
    }

    @Test
    public void testIsImmutableValue_Number() {
        Node numNode = new Node(Token.NUMBER, 42.0);
        assertTrue(NodeUtil.isImmutableValue(numNode));
    }

    @Test
    public void testIsImmutableValue_True() {
        Node trueNode = new Node(Token.TRUE);
        assertTrue(NodeUtil.isImmutableValue(trueNode));
    }

    @Test
    public void testIsImmutableValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertTrue(NodeUtil.isImmutableValue(nullNode));
    }

    @Test
    public void testIsImmutableValue_ArrayLit_Throws() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        try {
            NodeUtil.isImmutableValue(arrayNode);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIsImmutableValue_EmptyString() {
        Node strNode = new Node(Token.STRING, "");
        assertFalse(NodeUtil.isImmutableValue(strNode));
    }

    @Test
    public void testIsImmutableValue_ZeroNumber() {
        Node numNode = new Node(Token.NUMBER, 0.0);
        assertFalse(NodeUtil.isImmutableValue(numNode));
    }

    @Test
    public void testIsImmutableValue_UndefinedName() {
        Node nameNode = new Node(Token.NAME, "undefined");
        assertTrue(NodeUtil.isImmutableValue(nameNode));
    }

    @Test
    public void testIsImmutableValue_InfinityName() {
        Node nameNode = new Node(Token.NAME, "Infinity");
        assertTrue(NodeUtil.isImmutableValue(nameNode));
    }

    @Test
    public void testIsImmutableValue_NegativeInfinity() {
        Node nameNode = new Node(Token.NAME, "Infinity");
        Node neg = new Node(Token.NEG, nameNode);
        assertTrue(NodeUtil.isImmutableValue(neg));
    }

    @Test
    public void testIsImmutableValue_ComplexExpr() {
        Node nameNode = new Node(Token.NAME, "Infinity");
        Node neg = new Node(Token.NEG, nameNode);
        assertTrue(NodeUtil.isImmutableValue(neg));
    }

    @Test
    public void testIsFunctionObjectCall_Name() {
        Node nameNode = createNameNode("call");
        Node getpropNode = new Node(Token.GETPROP, nameNode);
        Node callNode = new Node(Token.CALL, getpropNode);
        Node thisNode = new Node(Token.THIS);
        callNode.addChildToBack(thisNode);
        assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectCall_NonName() {
        Node getelemNode = new Node(Token.GETELEM);
        assertFalse(NodeUtil.isFunctionObjectCall(getelemNode));
    }

    @Test
    public void testNewNameNode() {
        Node nameNode = NodeUtil.newNameNode("foo", FAKE_LINE, FAKE_CHAR);
        assertNotNull(nameNode);
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("foo", nameNode.getString());
    }

    @Test
    public void testNewNameNode_Empty() {
        Node nameNode = NodeUtil.newNameNode("", FAKE_LINE, FAKE_CHAR);
        assertNotNull(nameNode);
    }

    @Test
    public void testNewQualifiedNameNode() {
        Node qNameNode = NodeUtil.newQualifiedNameNode("foo.bar.baz", FAKE_LINE, FAKE_CHAR);
        assertNotNull(qNameNode);
    }

    @Test
    public void testNewQualifiedNameNode_Single() {
        Node qNameNode = NodeUtil.newQualifiedNameNode("foo", FAKE_LINE, FAKE_CHAR);
        assertNotNull(qNameNode);
        assertEquals(Token.NAME, qNameNode.getType());
    }

    @Test
    public void testNewVarNode_NullValue() {
        Node varNode = NodeUtil.newVarNode("foo", null);
        assertNotNull(varNode);
        assertEquals(Token.VAR, varNode.getType());
    }

    @Test
    public void testNewVarNode_WithValue() {
        Node nameNode = NodeUtil.newNameNode("foo", FAKE_LINE, FAKE_CHAR);
        Node valueNode = new Node(Token.NUMBER, 10.0);
        Node varNode = NodeUtil.newVarNode("foo", valueNode);
        assertNotNull(varNode);
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(valueNode, varNode.getFirstChild().getNext());
    }

    @Test
    public void testGetOpName_Addition() {
        assertEquals("+", NodeUtil.getOpName(new Node(Token.ADD)));
    }

    @Test
    public void testGetOpName_InvalidToken() {
        assertNull(NodeUtil.getOpName(new Node(Token.EMPTY)));
    }

    @Test
    public void testGetOpName_AssignAdd() {
        Node addNode = new Node(Token.ASSIGN_ADD);
        assertEquals("+=", NodeUtil.getOpName(addNode));
    }

    @Test
    public void testGetPrecedence_Assign() {
        assertEquals(1, NodeUtil.getPrecedence(new Node(Token.ASSIGN)));
    }

    @Test
    public void testGetPrecedence_Add() {
        assertEquals(11, NodeUtil.getPrecedence(new Node(Token.ADD)));
    }

    @Test
    public void testGetPrecedence_Comma() {
        assertEquals(0, NodeUtil.getPrecedence(new Node(Token.COMMA)));
    }

    @Test
    public void testIsAssignmentOp_Assign() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssignmentOp_Add() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
    }

    @Test
    public void testIsAssignmentOp_NonAssign() {
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
    }

    @Test
    public void testIsStatementBlock_Block() {
        Node blockNode = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isStatementBlock(blockNode));
    }

    @Test
    public void testIsStatementBlock_NotBlock() {
        Node scriptNode = new Node(Token.SCRIPT);
        assertFalse(NodeUtil.isStatementBlock(scriptNode));
    }

    @Test
    public void testIsFunctionDeclaration_Valid() {
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setChildCount(3);
        Node nameNode = new Node(Token.NAME, "foo");
        functionNode.addChildToFront(nameNode);
        assertTrue(NodeUtil.isFunctionDeclaration(functionNode));
    }

    @Test
    public void testIsFunctionDeclaration_Not() {
        Node functionNode = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isFunctionDeclaration(functionNode));
    }

    @Test
    public void testIsExprAssign_Assign() {
        Node assignNode = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.isExprAssign(assignNode));
    }

    @Test
    public void testIsExprAssign_NotAssign() {
        Node addNode = new Node(Token.ADD);
        assertFalse(NodeUtil.isExprAssign(addNode));
    }

    @Test
    public void testNewFunctionNode() {
        Node nameNode = NodeUtil.newNameNode("func", FAKE_LINE, FAKE_CHAR);
        Node function = NodeUtil.newFunctionNode("func", Arrays.asList(nameNode), 0, 0);
        assertNotNull(function);
        assertEquals(Token.FUNCTION, function.getType());
    }

    @Test
    public void testGetFirstNonEmptyChild_WithEmpty() {
        Node parentNode = new Node(Token.BLOCK);
        Node first = new Node(Token.NAME, "first");
        Node second = new Node(Token.NAME, "second");
        parentNode.addChildToBack(first);
        parentNode.addChildToBack(second);
        assertEquals(first, NodeUtil.getFirstNonEmptyChild(parentNode));
    }

    @Test
    public void testGetFirstNonEmptyChild_NoChildren() {
        Node parentNode = new Node(Token.BLOCK);
        assertNull(NodeUtil.getFirstNonEmptyChild(parentNode));
    }

    @Test
    public void testIsGet_Valid() {
        Node getPropNode = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isGet(getPropNode));
    }

    @Test
    public void testIsGet_Not() {
        Node getElementNode = new Node(Token.GETELEM);
        assertFalse(NodeUtil.isGet(getElementNode));
    }

    @Test
    public void testIsName_True() {
        Node nameNode = createNameNode("foo");
        assertTrue(NodeUtil.isName(nameNode));
    }

    @Test
    public void testIsName_False() {
        Node numNode = new Node(Token.NUMBER, 1.0);
        assertFalse(NodeUtil.isName(numNode));
    }

    @Test
    public void testIsUndefined_Valid() {
        String undef = "undefined";
        assertTrue(NodeUtil.isUndefined(undef));
    }

    @Test
    public void testIsUndefined_Not() {
        String foo = "foo";
        assertFalse(NodeUtil.isUndefined(foo));
    }

    @Test
    public void testIsSimpleOperatorType_Add() {
        assertTrue(NodeUtil.isSimpleOperatorType(new Node(Token.ADD)));
    }

    @Test
    public void testIsSimpleOperatorType_NotOperator() {
        Node nameNode = new Node(Token.NAME, "foo");
        assertFalse(NodeUtil.isSimpleOperatorType(nameNode));
    }

    @Test
    public void testIsVar_True() {
        Node varNode = new Node(Token.VAR);
        assertTrue(NodeUtil.isVar(varNode));
    }

    @Test
    public void testIsVar_False() {
        Node blockNode = new Node(Token.BLOCK);
        assertFalse(NodeUtil.isVar(blockNode));
    }

    @Test
    public void testIsFunctionObjectApplyOrCall_Valid() {
        Node getPropNode = new Node(Token.GETPROP);
        Node nameNode = createNameNode("call");
        getPropNode.addChildToBack(nameNode);
        Node callNode = new Node(Token.CALL, getPropNode);
        assertTrue(NodeUtil.isFunctionObjectApplyOrCall(callNode));
    }

    @Test
    public void testIsFunctionObjectApplyOrCall_Not() {
        Node callNode = new Node(Token.CALL);
        assertFalse(NodeUtil.isFunctionObjectApplyOrCall(callNode));
    }

    @Test
    public void testIsSideEffectFree_Valid() {
        Node strNode = new Node(Token.STRING, "test");
        assertTrue(NodeUtil.isSideEffectFree(strNode));
    }

    @Test
    public void testIsSideEffectFree_Not() {
        Node callNode = new Node(Token.CALL);
        assertFalse(NodeUtil.isSideEffectFree(callNode));
    }

    @Test
    public void testRemoveChild_Parent() {
        Node parent = new Node(Token.BLOCK);
        Node child = new Node(Token.NAME, "foo");
        parent.addChildToBack(child);
        NodeUtil.removeChild(parent, child);
        assertFalse(parent.hasChildren());
    }

    @Test
    public void testRemoveChild_Label() {
        Node parent = new Node(Token.LABEL);
        Node child = new Node(Token.NAME, "foo");
        parent.addChildToBack(child);
        NodeUtil.removeChild(parent, child);
    }

    @Test
    public void testRemoveChild_Var() {
        Node parent = new Node(Token.VAR);
        Node child = new Node(Token.NAME, "foo");
        parent.addChildToBack(child);
        NodeUtil.removeChild(parent, child);
    }

    @Test
    public void testIsQualifiedName_SimpleName() {
        Node nameNode = createNameNode("foo");
        assertTrue(NodeUtil.isQualifiedName(nameNode));
    }

    @Test
    public void testIsQualifiedName_GetProp() {
        Node getPropNode = new Node(Token.GETPROP);
        Node nameNode = createNameNode("foo");
        getPropNode.addChildToBack(nameNode);
        getPropNode.addChildToBack(createNameNode("bar"));
        assertTrue(NodeUtil.isQualifiedName(getPropNode));
    }

    @Test
    public void testIsQualifiedName_Not() {
        Node numNode = new Node(Token.NUMBER, 1.0);
        assertFalse(NodeUtil.isQualifiedName(numNode));
    }

    @Test
    public void testContainsType_Valid() {
        Node blockNode = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF);
        blockNode.addChildToBack(ifNode);
        assertTrue(NodeUtil.containsType(blockNode, Token.IF));
    }

    @Test
    public void testContainsType_Not() {
        Node blockNode = new Node(Token.BLOCK);
        assertFalse(NodeUtil.containsType(blockNode, Token.IF));
    }

    @Test
    public void testIsNameReferenced_Valid() {
        Node blockNode = new Node(Token.BLOCK);
        Node nameNode = createNameNode("foo");
        blockNode.addChildToBack(nameNode);
        assertTrue(NodeUtil.isNameReferenced(blockNode, "foo"));
    }

    @Test
    public void testIsNameReferenced_Not() {
        Node blockNode = new Node(Token.BLOCK);
        Node nameNode = createNameNode("bar");
        blockNode.addChildToBack(nameNode);
        assertFalse(NodeUtil.isNameReferenced(blockNode, "foo"));
    }

    @Test
    public void testIsNameReferenced_NullName() {
        assertFalse(NodeUtil.isNameReferenced(new Node(Token.BLOCK), null));
    }

    @Test
    public void testGetFunctionName() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = createNameNode("func");
        functionNode.addChildToFront(nameNode);
        assertEquals("func", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionName_NoName() {
        Node functionNode = new Node(Token.FUNCTION);
        assertNull(NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testIsFunctionDeclaration_Anonymous() {
        Node functionNode = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isFunctionDeclaration(functionNode));
    }

    @Test
    public void testIsSideEffectFree_Function() {
        Node functionNode = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isSideEffectFree(functionNode));
    }

    @Test
    public void testIsSideEffectFree_SimpleOperator() {
        Node addNode = new Node(Token.ADD);
        Node strNode1 = new Node(Token.STRING, "a");
        Node strNode2 = new Node(Token.STRING, "b");
        strNode1.setParent(addNode);
        strNode2.setParent(addNode);
        addNode.addChildToBack(strNode1);
        addNode.addChildToBack(strNode2);
        assertTrue(NodeUtil.isSideEffectFree(addNode));
    }
}